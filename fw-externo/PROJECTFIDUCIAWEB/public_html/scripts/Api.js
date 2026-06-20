async function enviarSeleccion(iopcion,accion) {  
                    const filasSeleccionadas = [];
                    const rows = document.querySelectorAll(iopcion==1?'#fisosDisponibles tbody tr':'#fisosAsignados tbody tr');
                    console.log("iopcion: "+iopcion);
                    rows.forEach(row => {
                        const checkbox = row.querySelector('.row-check');
                        if (checkbox.checked) {
                            filasSeleccionadas.push({
                                usuario: row.cells[1].innerText,
                                fiso: row.cells[2].innerText
                            });
                        }
                    });
                    if(filasSeleccionadas.length === 0){
                        Swal.fire('warning', 'No ha seleccionado campo alguno de la tabla!', 'warning')
                        return;
                    } 
                    
            const result = await Swal.fire({
                    title: 'Estas seguro?',
                    text: "No podras revertir esto.",
                    icon: 'warning',
                    showCancelButton: true,
                    confirmButtonText: 'Si, aceptar',
                    cancelButtonText: 'Cancelar',
                    allowOutsideClick: false // Evita cerrar al hacer clic fuera
                });
                
                if (result.isConfirmed) {
                                
                    const datosFinales = {
                    opcion: iopcion,
                    accion: accion,
                    filasSeleccionadas: filasSeleccionadas
                    };
                    // Enviar con Fetch API (AJAX)
                    fetch('procesarDatos', {
                        method: 'POST',
                        headers: {
                            'Content-Type': 'application/json'
                        },
                        body: JSON.stringify(datosFinales)
                    })
                    .then(response => response.json())
                    .then(data => 
                    Swal.fire('warning', (iopcion==1?'Se registraron ':'Se eliminaron ')+data+ ' registros!', 'warning'));
                } else {
                    // Código a ejecutar cuando cancelan
                    console.log("El usuario canceló");
                }

            limpiar();
        }

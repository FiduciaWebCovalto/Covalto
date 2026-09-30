 // Lógica para minimizar/maximizar
        function toggleWidget() {
            const body = document.getElementById('widget-body');
            const btn = document.getElementById('btn-minimizador');
            if (body.style.display === 'none' || body.style.display === '') {
                body.style.display = 'block';
                btn.textContent = '?';
            } else {
                body.style.display = 'none';
                btn.textContent = '?';
            }
        }

        // Web Speech API
        const SpeechRecognition = window.SpeechRecognition || window.webkitSpeechRecognition;
        let recognition;

        if (SpeechRecognition) {
            recognition = new SpeechRecognition();
            recognition.lang = 'es-ES';
            recognition.continuous = false;
            recognition.interimResults = false;

            recognition.onstart = function() {
                document.getElementById('texto-escuchado').textContent = "Escuchando...";
            };

            recognition.onresult = function(event) {
                const palabra = event.results[0][0].transcript.toLowerCase().trim();
                document.getElementById('texto-escuchado').textContent = `"${palabra}"`;
                buscarTemasEnBackend(palabra);
            };

            recognition.onerror = function(event) {
                console.error(event.error);
                document.getElementById('texto-escuchado').textContent = "Error al intentar escuchar.";
            };
        } else {
            alert("Tu navegador no soporta reconocimiento de voz. Usa Google Chrome o Edge.");
            document.getElementById('btn-voz').disabled = true;
        }

        function iniciarVoz() {
            if (recognition) recognition.start();
        }

        // Consumo de Spring Boot y filtrado
        async function buscarTemasEnBackend(palabraBusqueda) {
            const contenedor = document.getElementById('resultados-busqueda');
            contenedor.innerHTML = "Cargando...";

            try {
                // Pasamos el término como parámetro query a nuestro endpoint
                const url = `${window.API_BASE_URL}/api/ayuda`; 
                const BEARER_TOKEN = localStorage.getItem('token');
                console.log(url)
                const response = await fetch(url, {
                    method: 'GET',
                    headers: {
                        'Authorization': `Bearer ${BEARER_TOKEN}`,
                        'Content-Type': 'application/json'
                    }
                });
                if (!response.ok) throw new Error('Error al obtener ayuda');
        
                temas  = await response.json();

                // Filtrado por coincidencia parcial en el cliente
                const temasFiltrados = temas.filter(tema => 
                    tema.tema.toLowerCase().includes(palabraBusqueda) || 
                    tema.descripcion.toLowerCase().includes(palabraBusqueda)
                );

                mostrarResultados(temasFiltrados);
            } catch (error) {
                console.error("Error al consumir la API:", error);
                contenedor.innerHTML = "Error al cargar los temas.";
            }
        }

        function mostrarResultados(temas) {
            const contenedor = document.getElementById('resultados-busqueda');
            contenedor.innerHTML = "";

            if (temas.length === 0) {
                contenedor.innerHTML = "No se encontraron temas para esa búsqueda.";
                return;
            }

            temas.forEach(tema => {
                const div = document.createElement('div');
                div.className = 'resultado-item';
                div.innerHTML = `
                    <strong>${tema.tema}</strong>
                    <p style="font-size: 14px; margin: 5px 0;">${tema.descripcion}</p>
                    <p style="font-size: 14px; margin: 5px 0;">El Menu esta en la ruta ${tema.url}</p>
                `;
                contenedor.appendChild(div);
            });
        }
        
        
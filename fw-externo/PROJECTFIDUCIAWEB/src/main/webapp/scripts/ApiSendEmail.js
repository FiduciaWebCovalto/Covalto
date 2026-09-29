
async function sendEmail( usuario1, folio1, tipo1, monto1,descripcion1){
    try {
            // 2. Obtener los parámetros/datos del formulario
            const email = usuario1.replace(/"/g, "").replace(/'/g, '');
            const lfolio = folio1;
            const stipo = tipo1.replace(/"/g, "").replace(/'/g, '');
            const smonto = monto1.replace(/"/g, "").replace(/'/g, '');
            const dataToSend = { usuario: email,
            folio: lfolio,tipo: stipo,monto: smonto,descripcion:descripcion1};

            console.log('Enviando a API:', dataToSend);
                // 3. Invocar la API REST
                const url_mail=`${window.API_BASE_URL}/api/auth/send-email`;
                console.log("url_mail: "+url_mail);
                const response = await fetch(url_mail, {
                    method: 'POST', // o GET
                    headers: {
                        'Content-Type': 'application/json'
                    },
                    body: JSON.stringify(dataToSend) // Convertir datos a JSON
                });

                if (response.ok) {
                    const result = await response.json();                    
                } else {
                    consol.log('Error en la API');
                }
    } catch (error) {
        console.error(error);
    }                
}


async function sendEmailCuentaNueva( usuario1, fiso1, cuenta1, fecha1){
    try {
            // 2. Obtener los parámetros/datos del formulario

            const dataToSend = { usuario: usuario1,
            fiso: fiso1,cuenta: cuenta1,fecha: fecha1};

            console.log('Enviando a API:', dataToSend);
                // 3. Invocar la API REST
                const url_mail_ctanva=`${window.API_BASE_URL}/api/auth/send-email-cuenta`;
                console.log("url_mail_ctanva: "+url_mail_ctanva);

                const response = await fetch(url_mail_ctanva, {
                    method: 'POST', // o GET
                    headers: {
                        'Content-Type': 'application/json'
                    },
                    body: JSON.stringify(dataToSend) // Convertir datos a JSON
                });

                if (response.ok) {
                    const result = await response.json();                    
                } else {
                    consol.log('Error en la API');
                }
    } catch (error) {
        console.error(error);
    }                
}

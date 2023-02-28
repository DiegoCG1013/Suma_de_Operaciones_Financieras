window.addEventListener("load", () => {
    obtenerDatosSWAPI('planets' + '/1')
});

function obtenerDatosSWAPI(solicitud) {
    fetch('https://swapi.dev/api/' + solicitud)
        .then(response => {
            return response.text()
        })
        .then(contenido => {
            let x = document.getElementById("1");
            x.innerText = contenido;
            let objeto
            try {
                objeto = JSON.parse(contenido)
                return objeto
            } catch (e) {
                alert('Error parseando el objeto JSON')
            }
        })
}

function obtenerIdURLRecursoSWAPI(url) {
    return Number(url.match(/([0-9]*)\/?$/)[1])
}



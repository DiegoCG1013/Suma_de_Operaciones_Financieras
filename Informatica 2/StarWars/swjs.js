window.addEventListener("load", () => {

    let div = document.getElementById('1')
    div.innerText = obtenerDatosSWAPI()

});

function obtenerDatosSWAPI() {
    fetch('https://swapi.dev/api/people')
        .then(response => {
            return response.text()
        })
        .then(contenido => {
            let div = document.getElementById('1')
            div.innerText = contenido

            let objeto
            try {
                objeto = JSON.parse(contenido)
                return objeto
            } catch(e) {
                alert('Error parseando el objeto JSON')
            }
        })
        .then(objeto => {
            return objeto
        })
        .catch(e => alert(`Error: ${e}`))
}
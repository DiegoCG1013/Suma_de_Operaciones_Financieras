addEventListener("load", () => {
    setNave()
})

async function setNave() {
    let p = new URLSearchParams(document.location.search)
    let id = p.get('id')
    let nave = await obtenerDatosSWAPI('starships/' + id)

    let nombre = document.getElementById('nombre')
    nombre.innerText = nave.name
    let modelo = document.getElementById('modelo')
    modelo.innerText = 'Model: ' + nave.model
    let fabricante = document.getElementById('fabricante')
    fabricante.innerText = 'Manufacturer: ' + nave.manufacturer
    let costo = document.getElementById('costo')
    costo.innerText = 'Cost (credits): ' + nave.cost_in_credits
    let longitud = document.getElementById('longitud')
    longitud.innerText = 'Length: ' + nave.length
    let velocidad = document.getElementById('velocidad')
    velocidad.innerText = 'Max. speed: ' + nave.max_atmosphering_speed
    let tripulacion = document.getElementById('tripulacion')
    tripulacion.innerText = 'Crew: ' + nave.crew
    let peliculas = document.getElementById('peliculas')
    for (let url of nave.films) {
        let id = obtenerIdURLRecursoSWAPI(url)
        let pelicula = await obtenerDatosSWAPI('films/' + id)
        let li = document.createElement('li')
        let a = document.createElement('a')
        a.href = 'pelicula.html?id=' + id
        a.innerText = pelicula.title
        li.appendChild(a)
        peliculas.appendChild(li)
    }
}

async function obtenerDatosSWAPI(solicitud) {
    try {
        let response = await fetch('https://swapi.dev/api/' + solicitud);
        let data = response.json();
        return data;
    } catch (error) {
        alert('Error al obtener datos de SWAPI');
        console.error(error);
    }
}

function obtenerIdURLRecursoSWAPI(url) {
    return Number(url.match(/([0-9]*)\/?$/)[1])
}
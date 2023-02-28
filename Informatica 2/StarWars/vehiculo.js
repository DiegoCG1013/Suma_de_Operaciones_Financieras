addEventListener("load", () => {
    setVehiculo()
})

async function setVehiculo() {
    let p = new URLSearchParams(document.location.search)
    let id = p.get('id')
    let vehiculo = await obtenerDatosSWAPI('vehicles/' + id)

    let nombre = document.getElementById('nombre')
    nombre.innerText = vehiculo.name
    let modelo = document.getElementById('modelo')
    modelo.innerText = 'Model: ' + vehiculo.model
    let fabricante = document.getElementById('fabricante')
    fabricante.innerText = 'Manufacturer: ' + vehiculo.manufacturer
    let costo = document.getElementById('costo')
    costo.innerText = 'Cost (credits): ' + vehiculo.cost_in_credits
    let longitud = document.getElementById('longitud')
    longitud.innerText = 'Length: ' + vehiculo.length
    let velocidad = document.getElementById('velocidad')
    velocidad.innerText = 'Max. speed: ' + vehiculo.max_atmosphering_speed
    let pasajeros = document.getElementById('pasajeros')
    pasajeros.innerText = 'Passengers: ' + vehiculo.passengers
    let peliculas = document.getElementById('peliculas')
    for (let url of vehiculo.films) {
        let id = obtenerIdURLRecursoSWAPI(url)
        let pelicula = await obtenerDatosSWAPI('films/' + id)
        let li = document.createElement('li')
        let a = document.createElement('a')
        a.href = 'pelicula.html?id=' + id
        a.innerText = pelicula.title
        li.appendChild(a)
        peliculas.appendChild(li)
    }
    let pilotos = document.getElementById('pilotos')
    for (let url of vehiculo.pilots) {
        let id = obtenerIdURLRecursoSWAPI(url)
        let piloto = await obtenerDatosSWAPI('people/' + id)
        let li = document.createElement('li')
        let a = document.createElement('a')
        a.href = 'piloto.html?id=' + id
        a.innerText = piloto.name
        li.appendChild(a)
        pilotos.appendChild(li)
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
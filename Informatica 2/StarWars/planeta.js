addEventListener("load", () => {
    setPlaneta()
})

async function setPlaneta() {
    let p = new URLSearchParams(document.location.search)
    let id = p.get('id')
    let planeta = await obtenerDatosSWAPI('planets/' + id)

    let nombre = document.getElementById('nombre')
    nombre.innerText = planeta.name
    let diametro = document.getElementById('diametro')
    diametro.innerText = 'Diameter: ' + planeta.diameter
    let clima = document.getElementById('clima')
    clima.innerText = 'Climate: ' + planeta.climate
    let gravedad = document.getElementById('gravedad')
    gravedad.innerText = 'Gravity: ' + planeta.gravity
    let poblacion = document.getElementById('poblacion')
    poblacion.innerText = 'Population: ' + planeta.population
    let residentes = document.getElementById('residentes')
    for (let url of planeta.residents) {
        let id = obtenerIdURLRecursoSWAPI(url)
        let residente = await obtenerDatosSWAPI('people/' + id)
        let li = document.createElement('li')
        let a = document.createElement('a')
        a.href = 'personaje.html?id=' + id
        a.innerText = residente.name
        li.appendChild(a)
        residentes.appendChild(li)
    }
    let peliculas = document.getElementById('peliculas')
    for (let url of planeta.films) {
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
addEventListener("load", () => {
    setEspecie()
})

async function setEspecie() {
    let p = new URLSearchParams(document.location.search)
    let id = p.get('id')
    let especie = await obtenerDatosSWAPI('species/' + id)
    console.log(especie)

    let nombre = document.getElementById('nombre')
    nombre.innerText = especie.name
    let clasificacion = document.getElementById('clase')
    clasificacion.innerText ='Classification: ' + especie.classification
    let planeta = document.getElementById('planeta')
    let home = await obtenerDatosSWAPI('planets/' + obtenerIdURLRecursoSWAPI(especie.homeworld))
    planeta.innerText = 'Homeworld: ' + home.name



    let personajes = document.getElementById('personajes')
    for (let url of especie.people) {
        let id = obtenerIdURLRecursoSWAPI(url)
        let personaje = await obtenerDatosSWAPI('people/' + id)
        let li = document.createElement('li')
        let a = document.createElement('a')
        a.href = 'personaje.html?id=' + id
        a.innerText = personaje.name
        li.appendChild(a)
        personajes.appendChild(li)
    }
    let peliculas = document.getElementById('peliculas')
    for (let url of especie.films) {
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
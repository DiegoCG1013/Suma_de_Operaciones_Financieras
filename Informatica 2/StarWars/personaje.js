addEventListener("load", () => {
    setPersonaje()
})

async function setPersonaje() {
    let p = new URLSearchParams(document.location.search)
    let id = p.get('id')
    let personaje = await obtenerDatosSWAPI('people/' + id)

    let nombre = document.getElementById('nombre')
    nombre.innerText = personaje.name
    let altura = document.getElementById('altura')
    altura.innerText = 'Height: ' + personaje.height
    let masa = document.getElementById('peso')
    masa.innerText = 'Mass: ' + personaje.mass
    let colorPiel = document.getElementById('colorPiel')
    colorPiel.innerText = 'Skin color: ' + personaje.skin_color
    let colorCabello = document.getElementById('colorPelo')
    colorCabello.innerText = 'Hair color: ' + personaje.hair_color
    let colorOjos = document.getElementById('colorOjos')
    colorOjos.innerText = 'Eye color: ' + personaje.eye_color
    let anioNacimiento = document.getElementById('fechaNacimiento')
    anioNacimiento.innerText = 'Birth year: ' + personaje.birth_year
    let genero = document.getElementById('genero')
    genero.innerText = 'Gender: ' + personaje.gender
    let planeta = document.getElementById('homeworld')
    let idPlaneta = obtenerIdURLRecursoSWAPI(personaje.homeworld)
    let planetaObjeto = await obtenerDatosSWAPI('planets/' + idPlaneta)
    planeta.innerText = 'Homeworld: ' + planetaObjeto.name
    let peliculas = document.getElementById('peliculas')
    for (let url of personaje.films) {
        let id = obtenerIdURLRecursoSWAPI(url)
        let pelicula = await obtenerDatosSWAPI('films/' + id)
        let li = document.createElement('li')
        let a = document.createElement('a')
        a.href = 'pelicula.html?id=' + id
        a.innerText = pelicula.title
        li.appendChild(a)
        peliculas.appendChild(li)
    }
    let vehiculos = document.getElementById('vehiculos')
    for (let url of personaje.vehicles) {
        let id = obtenerIdURLRecursoSWAPI(url)
        let vehiculo = await obtenerDatosSWAPI('vehicles/' + id)
        let li = document.createElement('li')
        let a = document.createElement('a')
        a.href = 'vehiculo.html?id=' + id
        a.innerText = vehiculo.name
        li.appendChild(a)
        vehiculos.appendChild(li)
    }
    let naves = document.getElementById('naves')
    for (let url of personaje.starships) {
        let id = obtenerIdURLRecursoSWAPI(url)
        let nave = await obtenerDatosSWAPI('starships/' + id)
        let li = document.createElement('li')
        let a = document.createElement('a')
        a.href = 'nave.html?id=' + id
        a.innerText = nave.name
        li.appendChild(a)
        naves.appendChild(li)
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
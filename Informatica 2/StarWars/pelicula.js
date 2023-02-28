addEventListener("load", () => {
    setPelicula()
})

async function setPelicula() {
    let p = new URLSearchParams(document.location.search)
    let id = p.get('id')
    let pelicula = await obtenerDatosSWAPI('films/1')
    console.log(pelicula)

    let titulo = document.getElementById('titulo')
    titulo.innerText = pelicula.title + ' (Episodio ' + pelicula.episode_id + ')'
    let descripcion = document.getElementById('descripcion')
    descripcion.innerText = pelicula.opening_crawl
    let director = document.getElementById('director')
    director.innerText = pelicula.director
    let personajes = document.getElementById('personajes')

    for (let url of pelicula.characters) {
        let id = obtenerIdURLRecursoSWAPI(url)
        let personaje = await obtenerDatosSWAPI('people/' + id)
        let li = document.createElement('li')
        let a = document.createElement('a')
        a.href = 'personaje.html?id=' + id
        a.innerText = personaje.name
        li.appendChild(a)
        personajes.appendChild(li)
    }
    let planetas = document.getElementById('planetas')
    for (let url of pelicula.planets) {
        let id = obtenerIdURLRecursoSWAPI(url)
        let planeta = await obtenerDatosSWAPI('planets/' + id)
        let li = document.createElement('li')
        let a = document.createElement('a')
        a.href = 'planeta.html?id=' + id
        a.innerText = planeta.name
        li.appendChild(a)
        planetas.appendChild(li)
    }
    let naves = document.getElementById('naves')
    for (let url of pelicula.starships) {
        let id = obtenerIdURLRecursoSWAPI(url)
        let nave = await obtenerDatosSWAPI('starships/' + id)
        let li = document.createElement('li')
        let a = document.createElement('a')
        a.href = 'nave.html?id=' + id
        a.innerText = nave.name
        li.appendChild(a)
        naves.appendChild(li)
    }
    let vehiculos = document.getElementById('vehiculos')
    for (let url of pelicula.vehicles) {
        let id = obtenerIdURLRecursoSWAPI(url)
        let vehiculo = await obtenerDatosSWAPI('vehicles/' + id)
        let li = document.createElement('li')
        let a = document.createElement('a')
        a.href = 'vehiculo.html?id=' + id
        a.innerText = vehiculo.name
        li.appendChild(a)
        vehiculos.appendChild(li)
    }
    let especies = document.getElementById('especies')
    for (let url of pelicula.species) {
        let id = obtenerIdURLRecursoSWAPI(url)
        let especie = await obtenerDatosSWAPI('species/' + id)
        let li = document.createElement('li')
        let a = document.createElement('a')
        a.href = 'especie.html?id=' + id
        a.innerText = especie.name
        li.appendChild(a)
        especies.appendChild(li)
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

async function colocarPersonajes(pArray, personajes) {
    for (let i = 0; i < pArray.length; i++) {
        let url = pArray[i]
        let id = obtenerIdURLRecursoSWAPI(url)
        let personaje = await obtenerDatosSWAPI('people/' + id)
        console.log(personaje)
        let li = document.createElement('li')
        li.innerText = personaje.name
        personajes.appendChild(li)
    }
}
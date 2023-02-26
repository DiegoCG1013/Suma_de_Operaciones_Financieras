import swjs from './swjs.js';

addEventListener("load", () => {
    let p = new URLSearchParams(document.location.search)
    console.log(p)
    let id = p.get('id')
    console.log(id + p.url)
    let pelicula = swjs.obtenerDatosSWAPI('films/' + id)
    setPelicula(pelicula)
})

function setPelicula(pelicula) {
    let titulo = document.getElementById('titulo')
    titulo.innerText = pelicula.title
    let descripcion = document.getElementById('descripcion')
    descripcion.innerText = pelicula.opening_crawl
    let director = document.getElementById('director')
    director.innerText = pelicula.director
    let personajes = document.getElementById('personajes')
    pelicula.characters.forEach(url => {
        let id = swjs.obtenerIdURLRecursoSWAPI(url)
        let personaje = swjs.obtenerDatosSWAPI('people/' + id)
        let li = document.createElement('li')
        li.innerText = personaje.name
        personajes.appendChild(li)
    })
}
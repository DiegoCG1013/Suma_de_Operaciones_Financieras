
window.onload = () => {
    let p = document.getElementById('miParrafo')
    p.innerText = '<strong>Hola</strong>'
    
    let listaElementos = document.getElementsByClassName('div')
    let div
    for (let i = 0; i < listaElementos.length; i++){
        if(i === 0){
            //es mi div
            div = listaElementos[i]
        }
    }
    div.getElementsByTagName('p')
    let p2 = listaElementos[0]
    p2.innerHTML = '<strong>UAX</strong>'

    let strong = document.createElement('strong')
    strong.innerText = 'Soy fuerte'

    p.appendChild(strong)

    //Lista de personajes de StarWars
    fetch('https://swapi.dev/api/people')
        .then(response => {
            return response.text()
        })
        .then(contenido => {
            let resp = document.getElementById('respFetch')
            resp.innerText = contenido
            try {
                let objeto = JSON.parse(contenido);
                return objeto
            }catch (e){
                alert('Error en parse')
            }
        })
        .then(objeto => {
            extraerPersonajes(objeto)
        })
        .catch(e => alert('Error: ${e}'))

}

function extraerPersonajes (objetoSW) {
    let personajes = objetoSW.result.map(elemento => {
        return {
            name : elemento.name
            url: elemento.url
        }/////////////////
    })
    console.log(personajes)

    let listaPersonajes = document.getElementById('listaPersonajes')
    personajes.forEach(personaje, idx => {
        let personajeId = personaje.url.match(/([0-9]*)\/?$/)[1]

        let a = document.createElement('a')
        a.innerText = personaje.name + "(" + personajeId + ")"
        a.href = 'https://swapi.dev/api/people' + (idx+1)
        let li = document.createElement('li')
        li.innerText = 'Personaje ' + (idx +1) + ': '
        li.appendChild(a)
        listaPersonajes.appendChild(li)
    })
}
    
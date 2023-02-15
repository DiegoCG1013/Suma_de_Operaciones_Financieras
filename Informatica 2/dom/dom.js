
window.onload = () => {

    let miParrafo = document.getElementById("miParrafo")
    miParrafo.textContent = 'Universidad UAX'

    let contador = 0;
    miParrafo.onclick = () => {
        setInterval(() => {
            let r = document.getElementById('reloj')
            r.textContent = 'Intervalo ' + contador++
        }, 1000)
    }

    miParrafo.classList.add('localizame')
    let elementosConClaseLocalizame = document.getElementsByClassName('localizame')
    for (let i = 0; i < elementosConClaseLocalizame.length; i++){
        elementosConClaseLocalizame[i].textContent = 'encontrado'
    }

    crearMenu()

    let contenedor = document.getElementById('contenido')

}

function crearMenu (){
    let boton = document.getElementById('boton')
    let menu = document.getElementById('menu')
    let uls = menu.getElementsByTagName('ul')

    let ul = uls[0]

    let contador = 1;
    boton.onclick = () => {
        let li = document.createElement('li')
        li.textContent = 'Elemento ' + contador++
        ul.appendChild(li)
    }
}
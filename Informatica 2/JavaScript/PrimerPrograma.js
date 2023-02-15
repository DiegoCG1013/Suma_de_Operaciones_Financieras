
//alert("hola");

console.log("Hola mundo");

/*
let a = 2;
let b = 15;
let c = 3;

let x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a);
let x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a);

console.log("X1 = " + x1);
console.log("X2 = " + x2);

function ecuacionSegundoGrado(a, b ,c) {

    let x1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a);
    let x2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c))/(2 * a);

    console.log("X1 = " + x1);
    console.log("X2 = " + x2);

}
*/

function secuenciaDeLeibniz (a) {

    let sumatorio = 0;
    for (let i = 1; i <= a; i++){
        sumatorio += Math.pow(-1, i+1) / ((2 * i) - 1)
    }

    console.log("PI: " + sumatorio * 4);
}

secuenciaDeLeibniz(100);

let listaNumeros = [1, 4, 11, 7, 16, 6];
console.log(listaNumeros);

let multiplicadosPor2 = listaNumeros.map(function (elemento) {
    return elemento * 2;
})

//es lo mismo que
let multiplicadosPor3 = listaNumeros.map( (elemento) => elemento * 3);

//ordenado
let ordenado = listaNumeros.sort((a, b) => {
    if (a === b){
        return 0;
    } else if (a > b){
        return 1;
    }
    return -1;
});

let pares = listaNumeros.filter( e => e%2 === 0);




console.log(multiplicadosPor2);
console.log(multiplicadosPor3);
console.log(ordenado);
console.log(pares);
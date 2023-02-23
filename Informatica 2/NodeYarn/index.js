'use strict'

const uuid = require('uuid')
const express = require('express')

let app = express()

app.get('/', (req, res, next) => {
    res.send('Bienvenido a mi API')
})

app.get('/getid/', (req, res, next) => {
  res.send({
      id: uuid.v1()
  })
})

const alumnos = [
    {
        nombre: 'Juan',
        apellido: 'Perez',
        id: 1
    },
    {
        nombre: 'Maria',
        apellido: 'Gomez',
        id: 2
    },
    {
        nombre: 'Pedro',
        apellido: 'Gomez',
        id: 3
    }
]

app.get('/alumnos', (req, res, next) => {
    res.send({
        alumnos
    })
})

app.get('/alumnos/:id', (req, res, next) => {
    res.send(alumnos.find(x => x.id == [req.params.id]))

})

app.listen(3033)
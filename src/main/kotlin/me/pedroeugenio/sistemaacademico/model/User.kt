package me.pedroeugenio.sistemaacademico.model

import javax.persistence.*


@Entity
class User(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id:Int,
    var faltas:String?,
    var notas:String?,
    var user:String,
    var nome:String,
    var sobrenome:String,
    var idade:Int,
    var cpf:String,
    var tipo:String,
    var materias:String

)
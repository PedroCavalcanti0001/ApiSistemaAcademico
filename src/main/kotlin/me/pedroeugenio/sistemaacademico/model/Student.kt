package me.pedroeugenio.sistemaacademico.model

import javax.persistence.*

@Entity
@Table(name="professor")
data class Student(
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) var id: Int,
        @Column(name = "user") var userName: String,
        @Column(name = "nome") var name: String,
        @Column(name = "sobrenome") var lastName: String,
        @Column(name = "idade") var age: Int,
        var cpf: String,
        @Column(name = "senha") var password: String,
        @Column(name = "faltas") var attendances: String,
        @Column(name = "notas") var grades: String,
)
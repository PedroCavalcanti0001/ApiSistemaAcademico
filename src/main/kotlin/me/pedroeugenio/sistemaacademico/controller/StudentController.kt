package me.pedroeugenio.sistemaacademico.controller

import me.pedroeugenio.sistemaacademico.model.Student
import me.pedroeugenio.sistemaacademico.model.Teacher
import me.pedroeugenio.sistemaacademico.repository.StudentRepository
import me.pedroeugenio.sistemaacademico.repository.TeacherRepository
import org.springframework.web.bind.annotation.*
import java.lang.Exception

@RestController
@RequestMapping("/api/aluno")
class StudentController(var studentRepository: StudentRepository) {

    @GetMapping("/listar")
    fun findAll(): MutableList<Student> {
        return studentRepository.findAll()
    }

    @GetMapping("/listar/b")
    fun findByUsername(@RequestParam("username") username: String): Student? {
        try {
            val body = studentRepository.findByUsername(username)
            for (any in body) {
                val teacher = any as Array<Any>

                val id = teacher[0] as Int
                val userName = teacher[1] as String
                val age = teacher[2] as Int
                val cpf = teacher[3] as String
                val name = teacher[4] as String
                val lastName = teacher[5] as String
                val password = teacher[6] as String
                val attendances = teacher[7] as String
                val grades = teacher[8] as String
                return Student(id, userName, name, lastName, age, cpf, password, attendances, grades)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return null
    }
}
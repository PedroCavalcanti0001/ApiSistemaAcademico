package me.pedroeugenio.sistemaacademico.controller

import me.pedroeugenio.sistemaacademico.model.Teacher
import me.pedroeugenio.sistemaacademico.repository.TeacherRepository
import org.springframework.web.bind.annotation.*
import java.lang.Exception
import java.math.BigDecimal
import java.math.BigInteger

@RestController
@RequestMapping("/api/professor")
class TeacherController(var teacherRepository: TeacherRepository) {

    @GetMapping("/listar")
    fun findAll(): MutableList<Teacher> {
        return teacherRepository.findAll()
    }

    @GetMapping("/listar/b")
    fun findByUsername(@RequestParam("username") username: String): Teacher? {
        try {
            val body = teacherRepository.findByUsername(username)
            for (any in body) {
                val teacher = any as Array<Any>

                val id = teacher[0] as Int
                val userName = teacher[1] as String
                val age = teacher[2] as Int
                val cpf = teacher[3] as String
                val name = teacher[4] as String
                val lastName = teacher[5] as String
                val password = teacher[6] as String
                val subjects = teacher[1] as String
                return Teacher(id, userName, name, lastName, age, cpf, password, subjects)
            }
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return null
    }
}
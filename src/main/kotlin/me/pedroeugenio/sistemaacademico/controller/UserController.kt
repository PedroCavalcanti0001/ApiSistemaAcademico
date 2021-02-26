package me.pedroeugenio.sistemaacademico.controller

import me.pedroeugenio.sistemaacademico.model.User
import me.pedroeugenio.sistemaacademico.repository.UserRepository
import org.springframework.web.bind.annotation.*
import java.lang.Exception

@RestController
@RequestMapping("/api/usuario")
class UserController(var userRepository: UserRepository) {

    @GetMapping("/listar")
    fun findAll(): MutableList<User> {
        return userRepository.findAll()
    }

    @GetMapping("/buscar")
    fun findByUsername(@RequestParam("username") username: String,@RequestParam("password") password: String): Any? {
        try {
            return userRepository.findByUsername(username, password)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return null
    }
}
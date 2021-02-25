package me.pedroeugenio.sistemaacademico

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.autoconfigure.domain.EntityScan
import org.springframework.boot.runApplication

@SpringBootApplication(scanBasePackages = ["me.pedroeugenio.sistemaacademico"])
@EntityScan(basePackages = ["me.pedroeugenio.sistemaacademico.model"])
open class ApiSistemaAcademico

fun main(args: Array<String>) {
    println("inicializando aplicação!")
    runApplication<ApiSistemaAcademico>(*args)
}
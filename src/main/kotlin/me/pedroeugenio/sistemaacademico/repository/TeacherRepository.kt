package me.pedroeugenio.sistemaacademico.repository

import me.pedroeugenio.sistemaacademico.model.Teacher
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import org.springframework.web.bind.annotation.RequestParam

@Repository
interface TeacherRepository : JpaRepository<Teacher,Long>{

    @Query("SELECT id,userName,age,cpf,name,lastName, password, subjects FROM Teacher WHERE userName = :username")
    fun findByUsername(@RequestParam("username") username:String):Array<Any>
}
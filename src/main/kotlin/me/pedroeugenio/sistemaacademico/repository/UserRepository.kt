package me.pedroeugenio.sistemaacademico.repository

import me.pedroeugenio.sistemaacademico.model.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import org.springframework.web.bind.annotation.RequestParam

@Repository
interface UserRepository : JpaRepository<User,Long>{

    @Query("select * from buscar_usuario WHERE user = :username AND senha=:password", nativeQuery = true)
    fun findByUsername(@RequestParam("username") username:String,@RequestParam("password") password:String):Array<User>
}
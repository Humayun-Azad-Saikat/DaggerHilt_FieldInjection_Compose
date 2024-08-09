package com.example.field_injection_compose

import javax.inject.Inject

class UserResistaionService @Inject constructor(
    private val userRepository: UserRepository,
    private val emailService: EmailService
) {

    fun resisterUser(email:String,password:String){
        userRepository.saveUser("saikat","codedash00@gmail.com")
        emailService.sentEmail("saikat","system","email body")
    }
}
package com.eckelp.email.application.inbound

import com.eckelp.email.application.inbound.request.EmailRequest
import com.eckelp.email.domain.usecases.SendEmailUseCase
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/email")
class SendEmailController(val sendEmailUsecase: SendEmailUseCase) {

    @PostMapping
    fun send(@RequestBody emailRequest: EmailRequest) {
        sendEmailUsecase.send(emailRequest)
    }



}
package com.eckelp.email.application.usecases

import com.eckelp.email.domain.models.Email
import com.eckelp.email.domain.usecases.SendEmailUseCase
import org.springframework.mail.javamail.JavaMailSender
import org.springframework.mail.javamail.MimeMessageHelper
import org.springframework.stereotype.Service
import javax.mail.internet.MimeMessage

@Service
class SendEmailService(private val emailSender: JavaMailSender) : SendEmailUseCase{

    override fun send(email: Email) {

        val message = createSimpleMessage(email)

        emailSender.send(message)

    }

    private fun createSimpleMessage(email: Email): MimeMessage {
        val message: MimeMessage = emailSender.createMimeMessage()
        val helper = MimeMessageHelper(message)

        setupMessage(helper, email)

        return message
    }

    private fun setupMessage(helper: MimeMessageHelper, email: Email) {
        helper.setTo(email.to().toTypedArray())
        helper.setSubject(email.subject())
        helper.setText(email.body())
    }
}
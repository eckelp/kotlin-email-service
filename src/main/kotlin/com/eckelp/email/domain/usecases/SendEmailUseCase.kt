package com.eckelp.email.domain.usecases

import com.eckelp.email.domain.models.Email

interface SendEmailUseCase {

    fun send(email: Email);

}
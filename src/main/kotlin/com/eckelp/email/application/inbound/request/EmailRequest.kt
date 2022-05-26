package com.eckelp.email.application.inbound.request

import com.eckelp.email.domain.models.Email

class EmailRequest(var subject: String, var body: String, var to: List<String>, var cc: List<String>, var bcc: List<String>) : Email {

    override fun subject(): String {
        return this.subject;
    }

    override fun body(): String {
        return this.body;
    }

    override fun to(): List<String> {
        return this.to;
    }

    override fun cc(): List<String> {
        return this.cc;
    }

    override fun bcc(): List<String> {
        return this.bcc;
    }
}
package com.eckelp.email.domain.models

interface Email {

    fun subject() : String
    fun body() : String
    fun to(): List<String>
    fun cc(): List<String>
    fun bcc(): List<String>

}
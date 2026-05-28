package com.back.terra260528.global

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @GetMapping("/")
    fun main(): String {
        return "Hi, Spring Boot!!"
    }
}
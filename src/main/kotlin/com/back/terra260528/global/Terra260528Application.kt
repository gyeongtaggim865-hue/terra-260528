package com.back.terra260528.global

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

import org.springframework.cache.annotation.EnableCaching

@EnableCaching
@SpringBootApplication
class Terra260528Application

fun main(args: Array<String>) {
    runApplication<Terra260528Application>(*args)
}

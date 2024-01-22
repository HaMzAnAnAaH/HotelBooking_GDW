package com.example.HotelBook

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
object HotelBookApplication {
    @JvmStatic
    fun main(args: Array<String>) {
        SpringApplication.run(HotelBookApplication::class.java, *args)
    }
}

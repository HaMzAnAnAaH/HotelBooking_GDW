package com.example.HotelBook

import org.springframework.boot.CommandLineRunner
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import java.util.List

@Configuration
class HotelConfig {
    @Bean
    fun commandLineRunner(
        repository: HotelRepository
    ): CommandLineRunner {
        return CommandLineRunner { args: Array<String?>? ->
            val hotel1 = Hotel(
                "Das Steinmüller Hotel",
                "Gummersbach",
                "Steinmüllerallee 24, 51643",
                4.5f,
                "free WI-FI",
                59.99f,
                200,
                2
            )
            val hotel2 = Hotel(
                "Hotel Stremme",
                "Gummersbach",
                "Beckestrasse 55, 51647",
                4.8f,
                "free WI-FI",
                89.99f,
                300,
                1
            )
            val hotel3 = Hotel(
                "Maritim Hotel Köln",
                "Köln",
                "Heumarkt 20, 50667",
                4.2f,
                "free WI-FI, Swimming Pool, Gym",
                119.99f,
                500,
                2
            )
            val hotel4 = Hotel(
                "DO & CO Hotel München",
                "München",
                "Filserbräugasse 1, Altstadt-Lehel, 80331",
                4.9f,
                "Swimming Pool, Gym",
                159.99f,
                500,
                2
            )
            val hotel5 = Hotel(
                "Rioca Stuttgart Posto 4",
                "Stuttgart",
                "Salzwiesenstraße, Zuffenhausen, 70435",
                3.9f,
                "free WI-FI, Swimming Pool, Gym",
                25.99f,
                450,
                2
            )
            val hotel6 = Hotel(
                "ACHAT Hotel Stuttgart Zuffenhausen",
                "Stuttgart",
                "Wollinstr. 6, Zuffenhausen, 70439",
                3.2f,
                "free WI-FI",
                30.00f,
                600,
                1
            )
            repository.saveAll(
                List.of(hotel1, hotel2, hotel3, hotel4, hotel5, hotel6)
            )
        }
    }
}

package com.example.HotelBook;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class HotelConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            HotelRepository repository
    ){
        return args -> {
            Hotel hotel1 = new Hotel(


                    "Das Steinmüller Hotel",
                    "Gummersbach",
                    "Steinmüllerallee 24, 51643",
                    4.5F,
                    "free WI-FI",
                    59.99F


            );

            Hotel hotel2 = new Hotel(

                    "Hotel Stremme",
                    "Gummersbach",
                    "Beckestrasse 55, 51647",
                    4.8F,
                    "free WI-FI",
                    89.99F
            );

            Hotel hotel3 = new Hotel(

                    "Maritim Hotel Köln",
                    "Köln",
                    "Heumarkt 20, 50667",
                    4.2F,
                    "free WI-FI, Swimming Pool, Gym",
                    119.99F
            );

            repository.saveAll(
                    List.of(hotel1,hotel2,hotel3)
            );
        };
    }
}

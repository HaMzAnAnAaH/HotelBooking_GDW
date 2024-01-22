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
                    59.99F,
                    200,
                    2


            );

            Hotel hotel2 = new Hotel(

                    "Hotel Stremme",
                    "Gummersbach",
                    "Beckestrasse 55, 51647",
                    4.8F,
                    "free WI-FI",
                    89.99F,
                    300,
                    1
            );

            Hotel hotel3 = new Hotel(

                    "Maritim Hotel Köln",
                    "Köln",
                    "Heumarkt 20, 50667",
                    4.2F,
                    "free WI-FI, Swimming Pool, Gym",
                    119.99F,
                    500,
                    2

            );

            Hotel hotel4 = new Hotel(

                    "DO & CO Hotel München",
                    "München",
                    "Filserbräugasse 1, Altstadt-Lehel, 80331",
                    4.9F,
                    "Swimming Pool, Gym",
                    159.99F,
                    500,
                    2

            );

            Hotel hotel5 = new Hotel(

                    "Rioca Stuttgart Posto 4",
                    "Stuttgart",
                    "Salzwiesenstraße, Zuffenhausen, 70435",
                    3.9F,
                    "free WI-FI, Swimming Pool, Gym",
                    25.99F,
                    450,
                    2

            );

            Hotel hotel6 = new Hotel(

                    "ACHAT Hotel Stuttgart Zuffenhausen",
                    "Stuttgart",
                    "Wollinstr. 6, Zuffenhausen, 70439",
                    3.2F,
                    "free WI-FI",
                    30.00F,
                    600,
                    1

            );

            repository.saveAll(
                    List.of(hotel1,hotel2,hotel3,hotel4,hotel5,hotel6)
            );
        };
    }
}

package com.example.HotelBook;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/hotels")
public class HotelController {

    private final HotelService hotelService;

    @Autowired
    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    @GetMapping
    public List<Hotel> getHotels(){

        return hotelService.getHotels();
    }
    @PostMapping
    public void registerNewHotel(@RequestBody Hotel hotel){
        hotelService.addNewStudent(hotel);
    }

    @GetMapping("/cheaper-than")
    public List<Hotel> getHotelsCheaperThan(@RequestParam("maxPrice") float maxPrice) {
        return hotelService.findHotelsCheaperThan(maxPrice);
    }


    @GetMapping("/by-amenity")
    public List<Hotel> getHotelsByAmenity(@RequestParam String amenity) {

            return hotelService.findHotelsByAmenity(amenity);

    }



}

package com.example.HotelBook

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping(path = ["api/v1/hotels"])
class HotelController @Autowired constructor(private val hotelService: HotelService) {
    @get:GetMapping
    val hotels: List<Hotel>
        get() = hotelService.hotels

    @PostMapping
    fun registerNewHotel(@RequestBody hotel: Hotel?) {
        hotelService.addNewStudent(hotel)
    }

    @GetMapping("/cheaper-than")
    fun getHotelsCheaperThan(@RequestParam("maxPrice") maxPrice: Float): List<Hotel> {
        return hotelService.findHotelsCheaperThan(maxPrice)
    }

    @GetMapping("/by-amenity")
    fun getHotelsByAmenity(@RequestParam amenity: String?): List<Hotel> {
        return hotelService.findHotelsByAmenity(amenity)
    }
}

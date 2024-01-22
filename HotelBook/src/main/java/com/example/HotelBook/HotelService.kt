package com.example.HotelBook

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class HotelService @Autowired constructor(private val hotelRepository: HotelRepository) {
    val hotels: List<Hotel?>
        get() = hotelRepository.findAll()

    fun addNewStudent(hotel: Hotel) {
        val studentByEmail = hotelRepository
            .findHotelByName(hotel.hotelName)
        check(!studentByEmail!!.isPresent) { "email taken" }
        // studentRepository.findStudentByEmail(student.getEmail())
        hotelRepository.save(hotel)
        //  System.out.println(student);
    }

    fun findHotelsCheaperThan(maxPrice: Float): List<Hotel?>? {
        return hotelRepository.findByPriceLessThan(maxPrice)
    }

    fun findHotelsByAmenity(amenities: String?): List<Hotel?>? {
        return hotelRepository.findByAmenitiesContaining(amenities)
    }
}

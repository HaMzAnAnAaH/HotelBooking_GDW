package com.example.HotelBook

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface HotelRepository : JpaRepository<Hotel?, Long?> {
    @Query("SELECT s FROM Hotel s WHERE s.hotelName = ?1")
    fun findHotelByName(hotelName: String?): Optional<Hotel?>?
    fun findByPriceLessThan(maxPrice: Float): List<Hotel?>?
    fun findByAmenitiesContaining(amenities: String?): List<Hotel?>?
}

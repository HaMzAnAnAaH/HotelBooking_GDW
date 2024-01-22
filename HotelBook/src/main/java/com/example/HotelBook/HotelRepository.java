package com.example.HotelBook;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface HotelRepository extends
        JpaRepository<Hotel, Long> {




    @Query("SELECT s FROM Hotel s WHERE s.hotelName = ?1")
    Optional<Hotel> findHotelByName(String hotelName);

    List<Hotel> findByPriceLessThan(float maxPrice);

    List<Hotel> findByAmenitiesContaining(String amenities);


}

package com.example.HotelBook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelService {

    private final HotelRepository hotelRepository;


    @Autowired
    public HotelService(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    public List<Hotel> getHotels() {
        return  hotelRepository.findAll();
    }

    public void addNewStudent(Hotel hotel) {
        Optional<Hotel> studentByEmail = hotelRepository
                .findHotelByName(hotel.getHotelName());
        if(studentByEmail.isPresent()){
            throw new IllegalStateException("email taken");
        }
        // studentRepository.findStudentByEmail(student.getEmail())
        hotelRepository.save(hotel);
        //  System.out.println(student);
    }

    public List<Hotel> findHotelsCheaperThan(float maxPrice) {
        return hotelRepository.findByPriceLessThan(maxPrice);
    }


    public List<Hotel> findHotelsByAmenity(String amenities) {
        return hotelRepository.findByAmenitiesContaining(amenities);
    }




}

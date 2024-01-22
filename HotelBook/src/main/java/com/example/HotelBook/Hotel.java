package com.example.HotelBook;

import jakarta.persistence.*;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@Entity
@Table
public class Hotel {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private long UnterkunftId;
    private String hotelName;
    private String Stadt;
    private String Adresse;
    private float rating;
    private String amenities;
    private float price;
    private int AnzahlDerRaume;
    private int AnzahlDerBetten;

    public Hotel(long unterkunftId, String hotelName, String Stadt, String Adresse, float rating, String amenities, float price, int AnzahlDerRaume, int AnzahlDerBetten) {
        UnterkunftId = unterkunftId;
        this.hotelName = hotelName;
        this.Stadt = Stadt;
        this.Adresse = Adresse;
        this.rating = rating;
        this.amenities = amenities;
        this.price = price;
        this.AnzahlDerRaume = AnzahlDerRaume;
        this.AnzahlDerBetten = AnzahlDerBetten;
    }

    public Hotel(String hotelName, String Stadt, String Adresse, float rating, String amenities, float price, int AnzahlDerRaume, int AnzahlDerBetten) {
        this.hotelName = hotelName;
        this.Stadt = Stadt;
        this.Adresse = Adresse;
        this.rating = rating;
        this.amenities = amenities;
        this.price = price;
        this.AnzahlDerRaume = AnzahlDerRaume;
        this.AnzahlDerBetten = AnzahlDerBetten;
    }

    public Hotel() {

    }

    public long getUnterkunftId() {
        return UnterkunftId;
    }

    public void setUnterkunftId(long unterkunftId) {
        UnterkunftId = unterkunftId;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getStadt() {
        return Stadt;
    }

    public void setStadt(String Stadt) {
        this.Stadt = Stadt;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String adresse) {
        Adresse = adresse;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public String getAmenities() {
        return amenities;
    }

    public void setAmenities(String amenities) {
        this.amenities = amenities;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getAnzahlDerRaume() {
        return AnzahlDerRaume;
    }

    public void setAnzahlDerRaume(int anzahlDerRaume) {
        AnzahlDerRaume = anzahlDerRaume;
    }

    public int getAnzahlDerBetten() {
        return AnzahlDerBetten;
    }

    public void setAnzahlDerBetten(int anzahlDerBetten) {
        AnzahlDerBetten = anzahlDerBetten;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "UnterkunftId=" + UnterkunftId +
                ", hotelName='" + hotelName + '\'' +
                ", Stadt='" + Stadt + '\'' +
                ", Adresse='" + Adresse + '\'' +
                ", rating=" + rating +
                ", amenities='" + amenities + '\'' +
                ", price=" + price +
                ", AnzahlDerRaume=" + AnzahlDerRaume +
                ", AnzahlDerBetten=" + AnzahlDerBetten +
                '}';
    }
}

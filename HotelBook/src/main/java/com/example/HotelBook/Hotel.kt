package com.example.HotelBook

import jakarta.persistence.*

@Entity
@Table
class Hotel {
    @Id
    @SequenceGenerator(name = "student_sequence", sequenceName = "student_sequence", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "student_sequence")
    var unterkunftId: Long = 0
    @JvmField
    var hotelName: String? = null
    var stadt: String? = null
    var adresse: String? = null
    var rating = 0f
    var amenities: String? = null
    var price = 0f
    var anzahlDerRaume = 0
    var anzahlDerBetten = 0

    constructor(
        unterkunftId: Long,
        hotelName: String?,
        Stadt: String?,
        Adresse: String?,
        rating: Float,
        amenities: String?,
        price: Float,
        AnzahlDerRaume: Int,
        AnzahlDerBetten: Int
    ) {
        this.unterkunftId = unterkunftId
        this.hotelName = hotelName
        stadt = Stadt
        adresse = Adresse
        this.rating = rating
        this.amenities = amenities
        this.price = price
        anzahlDerRaume = AnzahlDerRaume
        anzahlDerBetten = AnzahlDerBetten
    }

    constructor(
        hotelName: String?,
        Stadt: String?,
        Adresse: String?,
        rating: Float,
        amenities: String?,
        price: Float,
        AnzahlDerRaume: Int,
        AnzahlDerBetten: Int
    ) {
        this.hotelName = hotelName
        stadt = Stadt
        adresse = Adresse
        this.rating = rating
        this.amenities = amenities
        this.price = price
        anzahlDerRaume = AnzahlDerRaume
        anzahlDerBetten = AnzahlDerBetten
    }

    constructor()

    override fun toString(): String {
        return "Hotel{" +
                "UnterkunftId=" + unterkunftId +
                ", hotelName='" + hotelName + '\'' +
                ", Stadt='" + stadt + '\'' +
                ", Adresse='" + adresse + '\'' +
                ", rating=" + rating +
                ", amenities='" + amenities + '\'' +
                ", price=" + price +
                ", AnzahlDerRaume=" + anzahlDerRaume +
                ", AnzahlDerBetten=" + anzahlDerBetten +
                '}'
    }
}

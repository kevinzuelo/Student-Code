package com.techelevator.reservations.dao;

import java.util.List;
import com.techelevator.reservations.model.Reservation;

public interface ReservationDao {

    /**
     * A list of all publicly visible reservations
     *
     * @return List of reservations
     */
    List<Reservation> findAll();

    List<Reservation> findByHotel(int hotelID);

    Reservation get(int reservationID);

    Reservation create(Reservation reservation, int hotelID);

}

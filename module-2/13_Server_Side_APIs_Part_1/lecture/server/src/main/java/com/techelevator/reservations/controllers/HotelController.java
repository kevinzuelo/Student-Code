package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.MemoryHotelDao;
import com.techelevator.reservations.dao.MemoryReservationDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.model.Hotel;
import com.techelevator.reservations.model.Reservation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

@RestController
public class HotelController {

    private HotelDao hotelDao;
    private ReservationDao reservationDao;

    public HotelController() {
        this.hotelDao = new MemoryHotelDao();
        this.reservationDao = new MemoryReservationDao(hotelDao);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> listHotels() {
        return hotelDao.list();
    }

    /**
     * Return hotel information
     *
     * @param id the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{id}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int id) {
        return hotelDao.get(id);
    }

    // Reservation stuff

    /**
     *  Return all reservations
     *
     * @return a list of all reservations in the system
     */

    @RequestMapping(path = "/reservations", method = RequestMethod.GET)
    public List<Reservation> listReservations() {
        return reservationDao.findAll();
    }

    /**
     * Return reservation by id
     *
     * @return a single reservation
     */
    @RequestMapping(path = "/reservations/{id}", method = RequestMethod.GET)
    public Reservation getReservation(@PathVariable int id) {
        return reservationDao.get(id);
    }

    /**
     * Return reservations for a specific hotel
     *
     * @param hotelID
     * @return all hotels for a specific hotel
     */

    @RequestMapping(path = "/hotels/{id}/reservations", method = RequestMethod.GET)
    public List<Reservation> getReservationsByHotel(@PathVariable("id") int hotelID) {
        return reservationDao.findByHotel(hotelID);
    }

    /**
     * Create a reservation for a given hotel
     *
     * @param reservation to create
     */

    @RequestMapping(path = "/reservations", method = RequestMethod.POST)
    public Reservation createReservation(@RequestBody Reservation reservation){
        return reservationDao.create(reservation, reservation.getHotelID());
    }

    /**
     * /hotels/filter?state=oh&city=cleveland
     *
     */
    @RequestMapping(path = "/hotels/filter", method = RequestMethod.GET)
    public List<Hotel> filterByStateAndCity(@RequestParam String state, @RequestParam(required = false) String city) {
        List<Hotel> filteredHotels = new ArrayList<>();
        List<Hotel> hotels = listHotels();

        for(Hotel hotel: hotels) {
            if (city != null) {
                if (hotel.getAddress().getCity().toLowerCase().equals(city.toLowerCase()) && hotel.getAddress().getState().toLowerCase().equals(state)) {
                    filteredHotels.add(hotel);
                }
            }
            else {
                if (hotel.getAddress().getState().toLowerCase().equals(state.toLowerCase())) {
                    filteredHotels.add(hotel);
                }

            }

        }
        return filteredHotels;
    }

}


package com.techelevator.dao;

import com.techelevator.model.City;

import java.util.List;

public interface CityDao {

    City getCity(int cityId);

    List<City> getCitiesByState(String stateAbbreviation);

    List<City> getCitiesBySizeAndState(String stateAbbreviation, int minPopulation, int maxPopulation);

    City createCity(City city);

    void updateCity(City city);

    void deleteCity(int cityId);
}

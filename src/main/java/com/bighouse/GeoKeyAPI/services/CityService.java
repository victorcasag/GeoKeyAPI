package com.bighouse.GeoKeyAPI.services;

import com.bighouse.GeoKeyAPI.domain.Locales.City;
import com.bighouse.GeoKeyAPI.domain.Locales.CityDTO;
import com.bighouse.GeoKeyAPI.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityService {
    private final CityRepository cityRepository;
    @Autowired
    public CityService(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    public List<CityDTO> findAllCitiesByCountry(String country, String states){
        return cityRepository.findAllCitiesByCountryAndStates(country, states);
    }

}

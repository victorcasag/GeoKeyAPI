package com.bighouse.GeoKeyAPI.controller;

import com.bighouse.GeoKeyAPI.domain.Locales.*;
import com.bighouse.GeoKeyAPI.services.CityService;
import com.bighouse.GeoKeyAPI.services.CountryService;
import com.bighouse.GeoKeyAPI.services.StateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController()
@RequestMapping("/locales")
public class LocalesController {
    @Autowired
    private final CountryService countryService;
    @Autowired
    private final StateService stateService;
    @Autowired
    private final CityService cityService;
    public LocalesController(CountryService countryService, StateService stateService, CityService cityService) {
        this.countryService = countryService;
        this.stateService = stateService;
        this.cityService = cityService;
    }
    @GetMapping("/country/all")
    public List<CountryDTO> getAllCountry(){
        return countryService.FindAll();
    }
    @GetMapping("/state/findAllStatesByCountry/{country}")
    public List<StateDTO> getAllStateByCountry(@PathVariable String country){
        return stateService.findAllCitiesByCountry(country);
    }
    @GetMapping("/city/findAllCityByCountryAndStates/{country}/{state}")
    public List<CityDTO> getAllCityByCountryAndStates(@PathVariable String country, @PathVariable String state){
        return cityService.findAllCitiesByCountry(country, state);
    }
    @GetMapping("/country/getAllPhoneCodeAndEmojis")
    public List<PhoneCodeDTO> getAllPhoneCodeAndEmojis(){
        return countryService.findAllPhoneCodeAndEmojis();
    }
}

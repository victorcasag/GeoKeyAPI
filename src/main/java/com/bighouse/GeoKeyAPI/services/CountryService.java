package com.bighouse.GeoKeyAPI.services;

import com.bighouse.GeoKeyAPI.domain.Locales.Country;
import com.bighouse.GeoKeyAPI.domain.Locales.CountryDTO;
import com.bighouse.GeoKeyAPI.domain.Locales.PhoneCodeDTO;
import com.bighouse.GeoKeyAPI.repositories.CountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CountryService {
    private final CountryRepository countryRepository;
    @Autowired
    public CountryService(CountryRepository countryRepository){this.countryRepository = countryRepository;}
    public List<CountryDTO> FindAll(){return countryRepository.findAllCountries();}
    public List<PhoneCodeDTO> findAllPhoneCodeAndEmojis(){return countryRepository.findAllPhoneCodeAndEmojis();}
}

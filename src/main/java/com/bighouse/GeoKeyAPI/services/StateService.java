package com.bighouse.GeoKeyAPI.services;

import com.bighouse.GeoKeyAPI.domain.Locales.State;
import com.bighouse.GeoKeyAPI.domain.Locales.StateDTO;
import com.bighouse.GeoKeyAPI.repositories.StateRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StateService {
    private final StateRepository stateRepository;
    @Autowired
    public StateService(StateRepository stateRepository) {
        this.stateRepository = stateRepository;
    }

    public List<StateDTO> findAllCitiesByCountry(String country){
        return stateRepository.findAllStatesByCountry(country);
    }

}

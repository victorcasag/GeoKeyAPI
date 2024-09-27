package com.bighouse.GeoKeyAPI.repositories;

import com.bighouse.GeoKeyAPI.domain.Locales.State;
import com.bighouse.GeoKeyAPI.domain.Locales.StateDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StateRepository extends JpaRepository<State, Long> {
    @Query("SELECT new com.bighouse.GeoKeyAPI.domain.Locales.StateDTO(s.name) FROM State s WHERE s.countryName = ?1")
    List<StateDTO> findAllStatesByCountry(String country);
}

package com.bighouse.GeoKeyAPI.repositories;

import com.bighouse.GeoKeyAPI.domain.Locales.City;
import com.bighouse.GeoKeyAPI.domain.Locales.CityDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<City, Long> {
    @Query("SELECT new com.bighouse.GeoKeyAPI.domain.Locales.CityDTO(c.name) FROM City c WHERE c.countryName = ?1 AND c.stateName = ?2")
    List<CityDTO> findAllCitiesByCountryAndStates(String country, String states);
}

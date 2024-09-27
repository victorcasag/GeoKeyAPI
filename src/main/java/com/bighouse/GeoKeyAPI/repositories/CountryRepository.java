package com.bighouse.GeoKeyAPI.repositories;

import com.bighouse.GeoKeyAPI.domain.Locales.Country;
import com.bighouse.GeoKeyAPI.domain.Locales.CountryDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CountryRepository extends JpaRepository<Country, Long> {
    @Query("SELECT new com.bighouse.GeoKeyAPI.domain.Locales.CountryDTO(c.name) FROM Country c")
    List<CountryDTO> findAllCountries();
}

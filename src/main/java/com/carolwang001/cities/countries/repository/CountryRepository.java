package com.carolwang001.cities.countries.repository;

import com.carolwang001.cities.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}

package com.example.cityservice.repository

import com.example.cityservice.domain.City
import org.springframework.data.jdbc.repository.query.Query
import org.springframework.data.repository.CrudRepository

interface CityRepository : CrudRepository<City, String> {

    @Query("select * from CITIES")
    fun findCities(): List<City>
}
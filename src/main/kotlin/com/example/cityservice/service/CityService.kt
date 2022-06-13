package com.example.cityservice.service

import com.example.cityservice.domain.City
import com.example.cityservice.repository.CityRepository
import org.springframework.stereotype.Service

@Service
class CityService(val cityRepository: CityRepository) {

    fun findCities(): List<City> = cityRepository.findCities()

    fun post(city: City){
        cityRepository.save(city)
    }
}
package com.example.cityservice.web

import com.example.cityservice.domain.City
import com.example.cityservice.service.CityService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class CityRestService(val cityService: CityService) {

    @GetMapping
    fun get(): List<City> = cityService.findCities()

    @PostMapping
    fun post(@RequestBody city: City) {
        cityService.post(city)
    }
}
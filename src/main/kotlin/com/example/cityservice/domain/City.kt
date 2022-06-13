package com.example.cityservice.domain

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table


@Table("CITIES")
data class City(@Id val id: String?, val city: String)
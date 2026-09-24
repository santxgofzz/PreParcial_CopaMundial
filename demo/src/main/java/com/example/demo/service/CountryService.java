package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Country;
import com.example.demo.model.Player;

public interface CountryService {
    Country create(Country country);
    List<Country> findAll();
    Optional<Country> findById(Integer id);
}

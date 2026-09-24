package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Country;
import com.example.demo.repository.CountryRepository;
import com.example.demo.service.CountryService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j 
@Service 
@RequiredArgsConstructor 
public class CountryServiceImpl implements CountryService{
    private final CountryRepository countryRepository;

    @Override 
    public Country create(Country country){
        log.info("Creating country: {}", country);

        return countryRepository.save(country);
    }

    @Override 
    public List<Country> findAll(){
        log.info("Fetching all countries.");

        return countryRepository.findAll();
    }

    @Override 
    public Optional<Country> findById(Integer id){
        log.info("Fetching country by id: {}", id);

        return countryRepository.findById(id);
    }
}

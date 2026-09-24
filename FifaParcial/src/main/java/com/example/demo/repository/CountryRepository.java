package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Country;

public interface CountryRepository extends JpaRepository<Country, Integer> {
    List<Country> findTop5ByClubsPlayerClubsPlayerFifaScore();
}

package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Club;
import com.example.demo.model.Player;

public interface ClubService {
    Club create(Club club);
    List<Club> findAll();
    Optional<Club> findById(Integer id);
}

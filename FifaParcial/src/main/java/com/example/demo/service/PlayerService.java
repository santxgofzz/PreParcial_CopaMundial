package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Player;

public interface PlayerService {
    Player create(Player player);
    List<Player> findAll();
    Optional<Player> findById(Integer id);
    List<Player> findDistinctByPlayerClubsClubName(String clubName);
    List<Player> findByCountryNameAndPlayerClubsClubName(String country, String clubName);
}

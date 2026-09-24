package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Player;

public interface PlayerRepository extends JpaRepository<Player, Integer>{
    List<Player> findDistinctByPlayerClubsClubName(String clubName);

    List<Player> findByCountryNameAndPlayerClubsClubName(String country, String clubName);
}

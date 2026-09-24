package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.PlayerClub;
import com.example.demo.model.PlayerClubPK;

public interface PlayerClubService {
    PlayerClub create(PlayerClub player);
    List<PlayerClub> findAll();
    Optional<PlayerClub> findById(PlayerClubPK id);
}

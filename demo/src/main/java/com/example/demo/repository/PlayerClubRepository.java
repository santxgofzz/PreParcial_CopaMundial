package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.PlayerClub;
import com.example.demo.model.PlayerClubPK;

public interface PlayerClubRepository extends JpaRepository<PlayerClub, PlayerClubPK>{
    
}

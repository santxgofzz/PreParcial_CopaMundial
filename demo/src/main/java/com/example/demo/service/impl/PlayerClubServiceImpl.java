package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Player;
import com.example.demo.model.PlayerClub;
import com.example.demo.model.PlayerClubPK;
import com.example.demo.repository.PlayerClubRepository;
import com.example.demo.service.PlayerClubService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service 
@RequiredArgsConstructor 
@Slf4j 

public class PlayerClubServiceImpl implements PlayerClubService{
    private final PlayerClubRepository playerClubRepository;
    
    @Override 
    public PlayerClub create(PlayerClub playerClub){
        log.info("Saving PlayerClub: {}", playerClub);

        return playerClubRepository.save(playerClub);
    }

    @Override 
    public List<PlayerClub> findAll(){
        log.info("Fetching all PlayerClubs");

        return playerClubRepository.findAll();
    }

    @Override 
    public Optional<PlayerClub> findById(PlayerClubPK playerClubPK){
        log.info("Fetching PlayerClub by id: {}", playerClubPK);

        return playerClubRepository.findById(playerClubPK);
    }
}

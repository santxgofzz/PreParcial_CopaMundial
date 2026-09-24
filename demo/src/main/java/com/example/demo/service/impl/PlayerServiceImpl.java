package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Player;
import com.example.demo.repository.PlayerRepository;
import com.example.demo.service.PlayerService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j 
@RequiredArgsConstructor 
@Service 
public class PlayerServiceImpl implements PlayerService {
    private final PlayerRepository playerRepository;

    @Override 
    public Player create(Player player){
        log.info("Creating player: {}", player);

        return playerRepository.save(player);
    }

    @Override 
    public List<Player> findAll(){
        log.info("Fetching all players");

        return playerRepository.findAll();
    }

    @Override 
    public Optional<Player> findById(Integer id){
        log.info("Fetching player by id: {}", id);

        return playerRepository.findById(id);
    }

    @Override
    public List<Player> findDistinctByPlayerClubsClubName(String clubName) {
        return playerRepository.findDistinctByPlayerClubsClubName(clubName);
    }

    @Override
    public List<Player> findByCountryNameAndPlayerClubsClubName(String country, String clubName) {
        log.info("Fetching player de pais mierda {} y club {}", country, clubName);

        return playerRepository.findByCountryNameAndPlayerClubsClubName(country, clubName);
    }
}

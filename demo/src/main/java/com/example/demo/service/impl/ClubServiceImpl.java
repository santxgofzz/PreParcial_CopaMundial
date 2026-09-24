package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Club;
import com.example.demo.repository.ClubRepository;
import com.example.demo.service.ClubService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service 
@Slf4j 
@RequiredArgsConstructor 
public class ClubServiceImpl implements ClubService {
    private final ClubRepository clubRepository;

    @Override 
    public Club create(Club club){
        log.info("Creating Club: {}", club);

        return clubRepository.save(club);
    }

    @Override 
    public List<Club> findAll(){
        log.info("fetching clubs");

        return clubRepository.findAll();
    }

    @Override 
    public Optional<Club> findById(Integer id){
        log.info("Fetching club by id: {}", id);

        return clubRepository.findById(id);
    }
}

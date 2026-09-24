package com.example.demo.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Match;
import com.example.demo.repository.MatchRepository;
import com.example.demo.service.MatchService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j 
@RequiredArgsConstructor 
@Service 
public class MatchServiceImpl implements MatchService{
    private final MatchRepository matchRepository;

    @Override 
    public Match create(Match match){
        log.info("Creating match: {}", match);

        return matchRepository.save(match);
    }

    @Override 
    public List<Match> findAll(){
        log.info("Fetching all matches");

        return matchRepository.findAll();
    }

    @Override 
    public Optional<Match> findById(Integer id){
        log.info("Fetching match by id: {}", id);

        return matchRepository.findById(id);
    }
}

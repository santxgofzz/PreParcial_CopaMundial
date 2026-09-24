package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Match;
import com.example.demo.repository.MatchRepository;

import lombok.RequiredArgsConstructor;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestMapping("/matches")
@RequiredArgsConstructor 
public class MatchController {
    private final MatchRepository matchRepository;

    @GetMapping("/consulta3")
    public List<Match> consulta3() {
        // Creacion de fecha Timestamp con sql:
        Timestamp timestamp1 = new Timestamp(System.currentTimeMillis());

        
        return matchRepository.findByHomeCountryPlayersPlayerClubsClubNameAndHomeCountryPlayersPlayerClubsEndDateIsNull("club1");
    }
    
}

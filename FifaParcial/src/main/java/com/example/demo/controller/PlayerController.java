package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Player;
import com.example.demo.service.PlayerService;

import lombok.RequiredArgsConstructor;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;

@RestController 
@RequestMapping("/players")
@RequiredArgsConstructor 
public class PlayerController {
    private final PlayerService playerService;

    @GetMapping("/consulta1")
    public List<Player> consulta1() {
        return playerService.findDistinctByPlayerClubsClubName("club3");
    }

    @GetMapping("/consulta2")
    public List<Player> consulta2() {
        return playerService.findByCountryNameAndPlayerClubsClubName("Colombia", "club1");
    }
    
    
}

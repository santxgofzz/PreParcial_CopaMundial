package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import com.example.demo.model.Match;
import com.example.demo.model.Player;

public interface MatchService {
    Match create(Match match);
    List<Match> findAll();
    Optional<Match> findById(Integer id);
}

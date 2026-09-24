package com.example.demo.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Table(name = "COUNTRY")
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
@Builder 
public class Country {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // @Column(nullable = false, unique = false)
    private String name;
    private String code;
    private String confederation;

    @OneToMany(mappedBy = "homeCountry")
    @JsonIgnore 
    private List<Match> matchesHome;
    
    @OneToMany(mappedBy = "awayCountry")
    @JsonIgnore 
    private List<Match> matchesAway;
    
    @OneToMany(mappedBy = "country")
    @JsonIgnore 
    private List<Player> players;

    @OneToMany(mappedBy = "country")
    @JsonIgnore 
    private List<Club> clubs;
    
}

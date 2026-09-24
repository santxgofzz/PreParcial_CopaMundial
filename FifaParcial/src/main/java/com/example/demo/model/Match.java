package com.example.demo.model;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity 
@Table(name = "MATCHES")
@Data 
@NoArgsConstructor 
@AllArgsConstructor 
@Builder 
public class Match {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "match_date")
    private Timestamp matchDate;
    
    private String stadium;
    
    //fks
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "home_country_id")
    private Country homeCountry;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "away_country_id")
    private Country awayCountry;

    
    

}

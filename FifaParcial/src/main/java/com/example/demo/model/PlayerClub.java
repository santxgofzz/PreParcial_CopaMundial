package com.example.demo.model;


import java.sql.Timestamp;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity(name = "player_club")
@AllArgsConstructor 
@NoArgsConstructor 
@Data 
@Builder 
public class PlayerClub {
    @EmbeddedId 
    private PlayerClubPK id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "player_id")
    @JsonIgnore 
    private Player player;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "club_id")
    @JsonIgnore 
    private Club club;

    @Column(name = "end_date")
    private Timestamp endDate;
}

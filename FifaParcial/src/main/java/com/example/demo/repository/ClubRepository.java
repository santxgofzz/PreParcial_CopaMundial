package com.example.demo.repository;

import java.sql.Timestamp;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Club;
import com.example.demo.model.Match;
import com.example.demo.model.Player;

public interface ClubRepository extends JpaRepository<Club, Integer> {
    List<Club> findDistinctByPlayerClubsPlayerCountryMatchesHomeIdOrPlayerClubsPlayerCountryMatchesAwayId(Integer idMatch1, Integer idMatch2);
    // IgnoreCase.
    List<Club> findByNameIgnoreCase(String name);

    // GreaterThan. Mayor que
    List<Player> findByFifaScoreGreaterThan(Integer score);

    // GreaterThanEqual. Mayor o igual que
    List<Club> findByFifaScoreGreaterThanEqual(Integer score);

    // LessThan. Menor que
    List<Club> findByFifaScoreLessThan(Integer score);

    // LessThanEqual. Menor o igual que
    List<Club> findByFifaScoreLessThanEqual(Integer score);

    // Between. Rangos
    List<Match> findByMatchDateBetween(Timestamp start, Timestamp end); // Partidos realizados entre dos fechas


    // Before y After. 
    //List<Club> findByMatchDateAfter(Timestamp date);
    //List<Club> findByMatchDateAfter(Timestamp date);

    //IsNull. IsNotNull
    Boolean findByEndDateIsNull();
    Boolean findByEndDateIsNotNull();


    // Not. Sirve para negar; ejm: jugadores cuya posicion sea distina a x.
    List<Club> findByPositionNot(String position); 

    // In. Ejm: jugadores cuya posicion sea DC, MC o MCO.
    List<Player> findByPositionIn(List<String> positions); // pa crear la lista puede ser: List.of("DC", "MC", "MCO")
    //NotIn, lo contrario.
    List<Club> findByPositionNotIn(List<String> positions);

    // Containing. Significa: contiene este fragmento.
    List<Club> findByNameContaining(String text);

    // StartingWith.
    List<Club> findByNameStartingWith(String prefix);

    // EndingWith.
    List<Club> findByNameEndingWith(String suffix);

    // True. False. Para booleanos.
    Boolean findByActiveTrue();

    // Distinct.
    List<Club> findDistinctByPlayerClubs_Club_Name(String clubName);

    // OrderBy. Sirve para ordenar desde el mismo nombre.
    List<Club> findByCountry_NameOrderByFifaScoreDesc(String countryName);
    List<Club> findByPositionOrderByNameAsc(String position); 
    List<Club> findByCountry_NameOrderByFifaScoreDescNameAsc();//...). Si dos tienen el mismo score, van por name asc. 

    // Top5. Limitar resultados.
    List<Player> findTop5ByOrderByFifaScoreDesc();

    // First. 
    Player findFirstByOrderByFifaScoreDesc();

    // Exists. Retorna booleano segun condicion.
    boolean existsByName(String name);

    // CountBy. Cuenta registros
    long countByCountry_Name(String countryName);

    // DeleteBy.
    //List<Club> deleteByName(String name);



}

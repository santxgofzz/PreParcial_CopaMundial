package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Club;

public interface ClubRepository extends JpaRepository<Club, Integer> {
    List<Club> findDistinctByPlayerClubsPlayerCountryMatchesHomeIdOrPlayerClubsPlayerCountryMatchesAwayId(Integer idMatch1, Integer idMatch2);
    // IgnoreCase.
    // findByNameIgnoreCase(String name);

    // GreaterThan. Mayor que
    // List<Player> findByFifaScoreGreaterThan(Integer score);

    // GreaterThanEqual. Mayor o igual que
    //findByFifaScoreGreaterThanEqual(Integer score);

    // LessThan. Menor que
    // findByFifaScoreLessThan(Integer score);

    // LessThanEqual. Menor o igual que
    // findByFifaScoreLessThanEqual(Integer score);

    // Between. Rangos
    // List<Match> findByMatchDateBetween(Timestamp start, Timestamp end); // Partidos realizados entre dos fechas


    // Before y After. 
    // findByMatchDateAfter(Timestamp date);
    // findByMatchDateAfter(Timestamp date);

    //IsNull. IsNotNull
    // findByEndDateIsNull();
    // findByEndDateIsNotNull();


    // Not. Sirve para negar; ejm: jugadores cuya posicion sea distina a x.
    //findByPositionNot(String position); 

    // In. Ejm: jugadores cuya posicion sea DC, MC o MCO.
    // List<Player> findByPositionIn(List<String> positions); // pa crear la lista puede ser: List.of("DC", "MC", "MCO")
    // NotIn, lo contrario.
    // findByPositionNotIn(List<String> positions);

    // Containing. Significa: contiene este fragmento.
    // findByNameContaining(String text);

    // StartingWith.
    // findByNameStartingWith(String prefix);

    // EndingWith.
    // findByNameEndingWith(String suffix);

    // True. False. Para booleanos.
    // findByActiveTrue();

    // Distinct.
    // findDistinctByPlayerClubs_Club_Name(String clubName);

    // OrderBy. Sirve para ordenar desde el mismo nombre.
    // findByCountry_NameOrderByFifaScoreDesc(String countryName);
    // findByPositionOrderByNameAsc(String position); 
    // findByCountry_NameOrderByFifaScoreDescNameAsc(...). Si dos tienen el mismo score, van por name asc. 

    // Top5. Limitar resultados.
    // List<Player> findTop5ByOrderByFifaScoreDesc();

    // First. 
    // Player findFirstByOrderByFifaScoreDesc();

    // Exists. Retorna booleano segun condicion.
    // boolean existsByName(String name);

    // CountBy. Cuenta registros
    // long countByCountry_Name(String countryName);

    // DeleteBy.
    // deleteByName(String name);



}

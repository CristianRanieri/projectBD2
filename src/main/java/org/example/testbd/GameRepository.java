package org.example.testbd;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GameRepository extends MongoRepository<Game, String> {
    @Query
    List<Game> findByYearAndRedTeamTag(int year, String redTeamTag);

    @Query("{$or: [ " +
            "{ 'blueTeamTag': ?0, 'bResult': 1 }, " +
            "{ 'redTeamTag': ?0, 'rResult': 1 } " +
            "]}")
    List<Game> findWinTagTeam(String teamTag);

    @Query
    Game findByMatchHistory(String matchHistory);

}

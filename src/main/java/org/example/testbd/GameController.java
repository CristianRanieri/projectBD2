package org.example.testbd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.AggregationResults;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameRepository gameRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/Joined")
    public List<GameWithBan> getGamesWithBans() {

        Aggregation aggregation = Aggregation.newAggregation(
                Aggregation.lookup("ban-games", "MatchHistory", "MatchHistory", "banData"),
                Aggregation.unwind("banData"),

                // Filtro per ban_4 e ban_5 diversi da null
                Aggregation.match(Criteria.where("banData.ban_4").ne(null).and("banData.ban_5").ne(null)),

                Aggregation.limit(50),

                Aggregation.project("MatchHistory", "Year", "redTeamTag", "blueTeamTag", "bResult", "rResult")
                        .and("banData.TeamColor").as("TeamColor")
                        .and("banData.ban_1").as("ban_1")
                        .and("banData.ban_2").as("ban_2")
                        .and("banData.ban_3").as("ban_3")
                        .and("banData.ban_4").as("ban_4")
                        .and("banData.ban_5").as("ban_5")
        );

        AggregationResults<GameWithBan> results = mongoTemplate.aggregate(aggregation, "competitive-games", GameWithBan.class);
        List<GameWithBan> games = results.getMappedResults();

        for (GameWithBan gameWithBan : games) {
            System.out.println(gameWithBan);
        }

        return games;
    }

    // Endpoint per ottenere tutti i giochi con Year = 2015 e redTeamTag = C9
    @GetMapping("/TagTeamYear")
    public List<Game> getGames(@RequestParam int year, @RequestParam String redTeamTag) {

        List<Game> list= null;
        try {
            list = gameRepository.findByYearAndRedTeamTag(year, redTeamTag);
        }catch (Exception e) {
            System.out.println(e);
        }

        return list;
    }

    // Ricerca di tutte le partite vinte da un Team
    @GetMapping("/TagTeamWins")
    public List<Game> getTeamWins(@RequestParam String teamTag) {

        System.out.println(teamTag);

        List<Game> list = gameRepository.findWinTagTeam(teamTag);

        System.out.println(list.get(0).getMatchHistory());

        return list;
    }

    public static class WrapperId {
        private String fullId;

        public WrapperId() {}

        public WrapperId(String fullId) {
            this.fullId = fullId;
        }

        public String getFullId() {
            return fullId;
        }

        public void setFullId(String fullId) {
            this.fullId = fullId;
        }
    }

    @PostMapping("/GetGame")
    public Game getGameById(@RequestBody WrapperId body){
        String id = body.fullId;
        //System.out.println("id: " + id);

        return gameRepository.findByMatchHistory(id);
    }




    @PostMapping("/UpdateGame")
    public ResponseEntity<String> updateGame(
            @RequestParam("matchHistory") String matchHistory,
            @RequestParam("league") String league,
            @RequestParam("season") String season,

            @RequestParam("year") String year,
            @RequestParam("blueTeamTag") String blueTeamTag,
            @RequestParam("bResult") String bResult,

            @RequestParam("rResult") String rResult,
            @RequestParam("redTeamTag") String redTeamTag,
            @RequestParam("gamelength") String gamelength,

            @RequestParam("blueTop") String blueTop,
            @RequestParam("blueTopChamp") String blueTopChamp,
            @RequestParam("blueJungle") String blueJungle,

            @RequestParam("blueJungleChamp") String blueJungleChamp,
            @RequestParam("blueMiddle") String blueMiddle,
            @RequestParam("blueMiddleChamp") String blueMiddleChamp,

            @RequestParam("blueADC") String blueADC,
            @RequestParam("blueADCChamp") String blueADCChamp,
            @RequestParam("blueSupport") String blueSupport,

            @RequestParam("blueSupportChamp") String blueSupportChamp,
            @RequestParam("redTop") String redTop,
            @RequestParam("redTopChamp") String redTopChamp,

            @RequestParam("redJungle") String redJungle,
            @RequestParam("redJungleChamp") String redJungleChamp,
            @RequestParam("redMiddle") String redMiddle,

            @RequestParam("redMiddleChamp") String redMiddleChamp,
            @RequestParam("redADC") String redADC,
            @RequestParam("redADCChamp") String redADCChamp,

            @RequestParam("redSupportChamp") String redSupportChamp,
            @RequestParam("redSupport") String redSupport

            // Aggiungi altri parametri qui, se necessario
    ) {
        // Crea un oggetto Game e aggiorna i suoi campi
        Game updatedGame = new Game();
        updatedGame.setMatchHistory(matchHistory);
        updatedGame.setLeague(league);
        updatedGame.setSeason(season);

        updatedGame.setYear(Integer.parseInt(year));
        updatedGame.setBlueTeamTag(blueTeamTag);
        updatedGame.setbResult(bResult);

        updatedGame.setrResult(rResult);
        updatedGame.setRedTeamTag(redTeamTag);
        updatedGame.setGamelength(gamelength);

        updatedGame.setBlueTop(blueTop);
        updatedGame.setBlueTopChamp(blueTopChamp);
        updatedGame.setBlueJungle(blueJungle);

        updatedGame.setBlueJungleChamp(blueJungleChamp);
        updatedGame.setBlueMiddle(blueMiddle);
        updatedGame.setBlueMiddleChamp(blueMiddleChamp);

        updatedGame.setBlueADC(blueADC);
        updatedGame.setBlueADCChamp(blueADCChamp);
        updatedGame.setBlueSupport(blueSupport);

        updatedGame.setBlueSupportChamp(blueSupportChamp);
        updatedGame.setRedTop(redTop);
        updatedGame.setRedTopChamp(redTopChamp);

        updatedGame.setRedJungle(redJungle);
        updatedGame.setRedJungleChamp(redJungleChamp);
        updatedGame.setRedMiddle(redMiddle);

        updatedGame.setRedMiddleChamp(redMiddleChamp);
        updatedGame.setRedADC(redADC);
        updatedGame.setRedADCChamp(redADCChamp);

        updatedGame.setRedSupportChamp(redSupportChamp);
        updatedGame.setRedSupport(redSupport);


        Game temp = gameRepository.findByMatchHistory(matchHistory);

        if(temp != null)
            updatedGame.setId(temp.getId());

        System.out.println("sono qui" + updatedGame);

        // Salva l'oggetto aggiornato nel database
        gameRepository.save(updatedGame);

        return ResponseEntity.ok("ok");
    }

    // Endpoint per eliminare una partita
    @PostMapping("/DeleteGame")
    public void deleteGame(@RequestBody WrapperId body) {
        String id = body.fullId;
        System.out.println("id: " + id);

        Game game = gameRepository.findByMatchHistory(id);

        gameRepository.deleteById(game.getId());
    }
}

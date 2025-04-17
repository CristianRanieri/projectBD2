package org.example.testbd;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "ban-games")
public class Ban {

    @Id
    private String id;

    @Field("MatchHistory")
    private String matchHistory;

    @Field("TeamColor")
    private String teamColor;

    @Field("ban_1")
    private String ban_1;

    @Field("ban_2")
    private String ban_2;

    @Field("ban_3")
    private String ban_3;

    @Field("ban_4")
    private String ban_4;

    @Field("ban_5")
    private String ban_5;


    // Costruttore vuoto richiesto da Spring
    public Ban() {}

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // Getter e Setter
    public String getMatchHistory() {
        return matchHistory;
    }

    public void setMatchHistory(String matchHistory) {
        this.matchHistory = matchHistory;
    }

    public String getTeamColor() {
        return teamColor;
    }

    public void setTeamColor(String teamColor) {
        this.teamColor = teamColor;
    }

    public String getBan_1() {
        return ban_1;
    }

    public void setBan_1(String ban_1) {
        this.ban_1 = ban_1;
    }

    public String getBan_2() {
        return ban_2;
    }

    public void setBan_2(String ban_2) {
        this.ban_2 = ban_2;
    }

    public String getBan_3() {
        return ban_3;
    }

    public void setBan_3(String ban_3) {
        this.ban_3 = ban_3;
    }

    public String getBan_4() {
        return ban_4;
    }

    public void setBan_4(String ban_4) {
        this.ban_4 = ban_4;
    }

    public String getBan_5() {
        return ban_5;
    }

    public void setBan_5(String ban_5) {
        this.ban_5 = ban_5;
    }

    @Override
    public String toString() {
        return "Ban{" +
                "matchHistory='" + matchHistory + '\'' +
                ", teamColor='" + teamColor + '\'' +
                ", ban_1='" + ban_1 + '\'' +
                ", ban_2='" + ban_2 + '\'' +
                ", ban_3='" + ban_3 + '\'' +
                ", ban_4='" + ban_4 + '\'' +
                ", ban_5='" + ban_5 + '\'' +
                '}';
    }
}

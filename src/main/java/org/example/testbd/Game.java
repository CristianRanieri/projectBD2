package org.example.testbd;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "competitive-games")
public class Game {

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Id
    private String id;

    @Field("MatchHistory")
    private String matchHistory;

    @Field("League")
    private String league;

    @Field("Season")
    private String season;

    @Field("Year")
    private int year;

    @Field("blueTeamTag")
    private String blueTeamTag;

    @Field("bResult")
    private int bResult;

    @Field("rResult")
    private int rResult;

    @Field("redTeamTag")
    private String redTeamTag;

    @Field("gamelength")
    private int gamelength;

    @Field("blueTop")
    private String blueTop;

    @Field("blueTopChamp")
    private String blueTopChamp;

    @Field("blueJungle")
    private String blueJungle;

    @Override
    public String toString() {
        return "Game{" +
                "id='" + id + '\'' +
                ", matchHistory='" + matchHistory + '\'' +
                ", league='" + league + '\'' +
                ", season='" + season + '\'' +
                ", year=" + year +
                ", blueTeamTag='" + blueTeamTag + '\'' +
                ", bResult='" + bResult + '\'' +
                ", rResult='" + rResult + '\'' +
                ", redTeamTag='" + redTeamTag + '\'' +
                ", gamelength='" + gamelength + '\'' +
                ", blueTop='" + blueTop + '\'' +
                ", blueTopChamp='" + blueTopChamp + '\'' +
                ", blueJungle='" + blueJungle + '\'' +
                ", blueJungleChamp='" + blueJungleChamp + '\'' +
                ", blueMiddle='" + blueMiddle + '\'' +
                ", blueMiddleChamp='" + blueMiddleChamp + '\'' +
                ", blueADC='" + blueADC + '\'' +
                ", blueADCChamp='" + blueADCChamp + '\'' +
                ", blueSupport='" + blueSupport + '\'' +
                ", blueSupportChamp='" + blueSupportChamp + '\'' +
                ", redTop='" + redTop + '\'' +
                ", redTopChamp='" + redTopChamp + '\'' +
                ", redJungle='" + redJungle + '\'' +
                ", redJungleChamp='" + redJungleChamp + '\'' +
                ", redMiddle='" + redMiddle + '\'' +
                ", redMiddleChamp='" + redMiddleChamp + '\'' +
                ", redADC='" + redADC + '\'' +
                ", redADCChamp='" + redADCChamp + '\'' +
                ", redSupportChamp='" + redSupportChamp + '\'' +
                ", redSupport='" + redSupport + '\'' +
                '}';
    }

    @Field("blueJungleChamp")
    private String blueJungleChamp;

    @Field("blueMiddle")
    private String blueMiddle;

    @Field("blueMiddleChamp")
    private String blueMiddleChamp;

    @Field("blueADC")
    private String blueADC;

    @Field("blueADCChamp")
    private String blueADCChamp;

    @Field("blueSupport")
    private String blueSupport;

    @Field("blueSupportChamp")
    private String blueSupportChamp;

    @Field("redTop")
    private String redTop;

    @Field("redTopChamp")
    private String redTopChamp;

    @Field("redJungle")
    private String redJungle;

    @Field("redJungleChamp")
    private String redJungleChamp;

    @Field("redMiddle")
    private String redMiddle;

    @Field("redMiddleChamp")
    private String redMiddleChamp;

    @Field("redADC")
    private String redADC;

    @Field("redADCChamp")
    private String redADCChamp;

    @Field("redSupportChamp")
    private String redSupportChamp;

    @Field("redSupport")
    private String redSupport;


    public String getMatchHistory() {
        return matchHistory;
    }

    public void setMatchHistory(String matchHistory) {
        this.matchHistory = matchHistory;
    }

    public String getLeague() {
        return league;
    }

    public void setLeague(String league) {
        this.league = league;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getBlueTeamTag() {
        return blueTeamTag;
    }

    public void setBlueTeamTag(String blueTeamTag) {
        this.blueTeamTag = blueTeamTag;
    }


    public String getRedTeamTag() {
        return redTeamTag;
    }

    public void setRedTeamTag(String redTeamTag) {
        this.redTeamTag = redTeamTag;
    }

    public int getbResult() {
        return bResult;
    }

    public void setbResult(int bResult) {
        this.bResult = bResult;
    }

    public int getrResult() {
        return rResult;
    }

    public void setrResult(int rResult) {
        this.rResult = rResult;
    }

    public int getGamelength() {
        return gamelength;
    }

    public void setGamelength(int gamelength) {
        this.gamelength = gamelength;
    }

    public String getBlueTop() {
        return blueTop;
    }

    public void setBlueTop(String blueTop) {
        this.blueTop = blueTop;
    }

    public String getBlueTopChamp() {
        return blueTopChamp;
    }

    public void setBlueTopChamp(String blueTopChamp) {
        this.blueTopChamp = blueTopChamp;
    }

    public String getBlueJungle() {
        return blueJungle;
    }

    public void setBlueJungle(String blueJungle) {
        this.blueJungle = blueJungle;
    }

    public String getBlueJungleChamp() {
        return blueJungleChamp;
    }

    public void setBlueJungleChamp(String blueJungleChamp) {
        this.blueJungleChamp = blueJungleChamp;
    }

    public String getBlueMiddle() {
        return blueMiddle;
    }

    public void setBlueMiddle(String blueMiddle) {
        this.blueMiddle = blueMiddle;
    }

    public String getBlueMiddleChamp() {
        return blueMiddleChamp;
    }

    public void setBlueMiddleChamp(String blueMiddleChamp) {
        this.blueMiddleChamp = blueMiddleChamp;
    }

    public String getBlueADC() {
        return blueADC;
    }

    public void setBlueADC(String blueADC) {
        this.blueADC = blueADC;
    }

    public String getBlueADCChamp() {
        return blueADCChamp;
    }

    public void setBlueADCChamp(String blueADCChamp) {
        this.blueADCChamp = blueADCChamp;
    }

    public String getBlueSupport() {
        return blueSupport;
    }

    public void setBlueSupport(String blueSupport) {
        this.blueSupport = blueSupport;
    }

    public String getBlueSupportChamp() {
        return blueSupportChamp;
    }

    public void setBlueSupportChamp(String blueSupportChamp) {
        this.blueSupportChamp = blueSupportChamp;
    }

    public String getRedTop() {
        return redTop;
    }

    public void setRedTop(String redTop) {
        this.redTop = redTop;
    }

    public String getRedTopChamp() {
        return redTopChamp;
    }

    public void setRedTopChamp(String redTopChamp) {
        this.redTopChamp = redTopChamp;
    }

    public String getRedJungle() {
        return redJungle;
    }

    public void setRedJungle(String redJungle) {
        this.redJungle = redJungle;
    }

    public String getRedJungleChamp() {
        return redJungleChamp;
    }

    public void setRedJungleChamp(String redJungleChamp) {
        this.redJungleChamp = redJungleChamp;
    }

    public String getRedMiddle() {
        return redMiddle;
    }

    public void setRedMiddle(String redMiddle) {
        this.redMiddle = redMiddle;
    }

    public String getRedMiddleChamp() {
        return redMiddleChamp;
    }

    public void setRedMiddleChamp(String redMiddleChamp) {
        this.redMiddleChamp = redMiddleChamp;
    }

    public String getRedADC() {
        return redADC;
    }

    public void setRedADC(String redADC) {
        this.redADC = redADC;
    }

    public String getRedADCChamp() {
        return redADCChamp;
    }

    public void setRedADCChamp(String redADCChamp) {
        this.redADCChamp = redADCChamp;
    }

    public String getRedSupportChamp() {
        return redSupportChamp;
    }

    public void setRedSupportChamp(String redSupportChamp) {
        this.redSupportChamp = redSupportChamp;
    }

    public String getRedSupport() {
        return redSupport;
    }

    public void setRedSupport(String redSupport) {
        this.redSupport = redSupport;
    }

}
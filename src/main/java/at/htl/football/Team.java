package at.htl.football;

public class Team implements Comparable {

    private String name;
    private int points;
    private int wins;
    private int draws;
    private int defeats;
    private int goalsShot;
    private int goalsReceived;

    public Team(String name) {
        this.name = name;
    }

    public Team() {
    }

    public void addMatch(Match first) {



    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getWins() {
        return wins;
    }

    public int getDraws() {
        return draws;
    }

    public int getDefeats() {
        return defeats;
    }

    public int getGoalsShot() {
        return goalsShot;
    }

    public int getGoalsReceived() {
        return goalsReceived;
    }

    public int getGoalDifference() {
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        return 0;
    }
}

package at.htl.football;

public class Team extends League implements Comparable<Team> {

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
        if(first.getHomeName().equals(name)) {
            if(first.getHomeGoals() > first.getGuestGoals()) {
                points += 3;
                wins += 1;
            } else if(first.getHomeGoals() == first.getGuestGoals()) {
                points += 1;
                draws += 1;
            } else if(first.getHomeGoals() < first.getGuestGoals()) {
                defeats += 1;
            }

            goalsReceived += first.getGuestGoals();
            goalsShot += first.getHomeGoals();

        } else if(first.getGuestName().equals(name)) {
            if(first.getGuestGoals() > first.getHomeGoals()) {
                points += 3;
                wins += 1;
            } else if(first.getGuestGoals() == first.getHomeGoals()) {
                points += 1;
                draws += 1;
            } else if(first.getGuestGoals() < first.getHomeGoals()) {
                defeats += 1;
            }

            goalsReceived += first.getHomeGoals();
            goalsShot += first.getGuestGoals();
        }
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
        return goalsShot - goalsReceived;
    }

    @Override
    public int compareTo(Team team) {

        if(team.getPoints() > this.points) {
            return 1;
        } if(team.getPoints() < this.points) {
            return -1;
        } else {
            return team.getGoalDifference() - this.getGoalDifference();
        }
    }
}

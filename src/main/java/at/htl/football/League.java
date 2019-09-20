package at.htl.football;

import java.util.List;

public class League {

    private List<Team> teams;

    public void addMatchResult(Match first) {
        int guestCount = 0;
        int homeCount = 0;

        if(teams.size() != 0) {
            for (int i = 0; i < teams.size(); i++) {
                if(teams.get(i).equals(first.getGuestName()) || teams.get(i).equals(first.getHomeName())) {
                    teams.get(i).addMatch(first);
                }
            }
        } else {
            guestCount = 1;
            homeCount = 1;
        }

        if(guestCount == 1) {
            Team team1 = new Team(first.getGuestName());
            teams.add(team1);
        }
        if(homeCount == 1) {
            Team team2 = new Team(first.getHomeName());
            teams.add(team2);
        }
    }

    private Team findOrCreateTeam(String name) {
        return null;
    }

    public List<Team> getTable() {
        return null;
    }
}

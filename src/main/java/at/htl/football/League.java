package at.htl.football;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class League {

    private List<Team> teams = new ArrayList<>(18);

    public void addMatchResult(Match first) {
        boolean found = false;

        if(teams.size() != 0) {
            found = false;

            for (int i = 0; i < teams.size(); i++) {

                if(teams.get(i).getName().equals(first.getGuestName()) || teams.get(i).getName().equals((first.getHomeName()))) {
                    teams.get(i).addMatch(first);
                    found = true;
                }
            }

            if(!found) {
                Team team1 = new Team(first.getGuestName());
                teams.add(team1);
                teams.get(teams.size() - 1).addMatch(first);
                Team team2 = new Team(first.getHomeName());
                teams.add(team2);
                teams.get(teams.size() -1).addMatch(first);
            }

        } else {
            Team team1 = new Team(first.getGuestName());
            teams.add(team1);
            teams.get(0).addMatch(first);
            Team team2 = new Team(first.getHomeName());
            teams.add(team2);
            teams.get(1).addMatch(first);
        }
    }

    private Team findOrCreateTeam(String name) {
        return null;
    }

    public List<Team> getTable() {
        Collections.sort(teams);
        return teams;
    }
}

package at.htl.football;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {

    public static void main(String[] args) {
        League league = new League();
        Path file = Paths.get("bundesliga-1819.csv");

        try {
            List<String> lines = Files.readAllLines(file, UTF_8);

            for (int i = 1; i < lines.size(); i++) {
                String[] lineParts = lines.get(i).split(";");
                Match team = new Match(lineParts[1], lineParts[2], Integer.parseInt(lineParts[3]), Integer.parseInt(lineParts[4]));
                league.addMatchResult(team);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private void printTable(List<Team> teams) {

    }
}

package at.htl.football;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    }

    private void printTable(List<Team> teams) {
        String line;
        String[] splittedLine;

        try(Scanner scanner = new Scanner(new FileReader("bundesliga-1819.csv"))) {
            scanner.nextLine();
            while(scanner.hasNextLine()) {
                line = scanner.nextLine();
                splittedLine = line.split(";");

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

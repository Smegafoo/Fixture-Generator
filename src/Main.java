import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        teams.add("Galatasaray");
        teams.add("Fenerbahçe");
        teams.add("Beşiktaş");
        teams.add("Trabzonspor");
        



        List<String[]> fixtures = FixtureGenerator.generateFixture(teams);

        int week = 1;
        for (String[] fixture : fixtures) {
            System.out.println("Week " + week++ + ": " + fixture[0] + " vs " + fixture[1]);
        }
    }
    }

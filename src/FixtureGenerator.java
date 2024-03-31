import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FixtureGenerator {
    public static List<String[]> generateFixture(List<String> teams){
        if(teams.size()%2 !=0){
            teams.add("Bay");
        }
        Collections.shuffle(teams);
        List<String[]> fixtures=new ArrayList<>();
        int numTeams=teams.size();
        int numWeeks=numTeams-1;
        for(int round =0;round<numWeeks;round++){
            List<String[]> weeksFixtures=new ArrayList<>();
            for (int teamIndex=0;teamIndex<numTeams/2;teamIndex++){
                String homeTeam=teams.get(teamIndex);
                String awayTeam=teams.get(numTeams-1-teamIndex);
                String[] fixture={homeTeam,awayTeam};
                weeksFixtures.add(fixture);
            }
            fixtures.addAll(weeksFixtures);
        }
        String lastTeam=teams.remove(teams.size()-1);
        teams.add(1,lastTeam);

        return fixtures;
    }
}

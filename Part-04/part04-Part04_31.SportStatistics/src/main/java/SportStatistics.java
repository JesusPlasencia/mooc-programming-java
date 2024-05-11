
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String fileName = scan.nextLine();
        System.out.println("Team:");
        String teamName = scan.nextLine();

        int games = 0;
        int wins = 0;

        try ( Scanner scanFile = new Scanner(Paths.get(fileName))) {
            while (scanFile.hasNext()) {
                String line = scanFile.nextLine();
                String[] parts = line.split(",");

                String localTeam = parts[0];
                String awayTeam = parts[1];
                int localScore = Integer.valueOf(parts[2]);
                int awayScore = Integer.valueOf(parts[3]);

                boolean isTeamLocal = teamName.equals(localTeam);
                boolean isTeamAway = teamName.equals(awayTeam);
                boolean isTeamInLocalOrAway = isTeamLocal || isTeamAway;

                if (isTeamInLocalOrAway) {
                    games++;
                    if (isTeamLocal && localScore > awayScore) {
                        wins++;
                    } else if (isTeamAway && localScore < awayScore) {
                        wins++;
                    }
                }
            }

            System.out.println("Games: " + games);
            System.out.println("Wins: " + wins);
            System.out.println("Losses: " + (games - wins));
        } catch (Exception err) {
            err.printStackTrace();
        }

    }

}

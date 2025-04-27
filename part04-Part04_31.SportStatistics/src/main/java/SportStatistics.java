
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count = 0;
        int wins = 0;
        int losses = 0;

        ArrayList<String[]> games = new ArrayList<>();

        System.out.println("File:");
        String file = scan.nextLine();

        System.out.println("Team:");
        String team = scan.nextLine();

        try (Scanner fileName = new Scanner(Paths.get(file))) {
            while (fileName.hasNextLine()) {
                String row = fileName.nextLine();
                String[] game = row.split(",");
                games.add(game);
            }
        } catch (Exception e) {
            System.out.println("Error " + e.getMessage());
        }

        for (String[] item : games) {
            if (team.equals(item[0]) || team.equals(item[1])) {
                count += 1;

                int homeScore = Integer.parseInt(item[2]);
                int visitingScore = Integer.parseInt(item[3]);
                boolean isHomeTeam = team.equals(item[0]);
                boolean teamWon = (isHomeTeam && homeScore > visitingScore)
                        || (!isHomeTeam && visitingScore > homeScore);

                if (teamWon) {
                    wins++;
                } else {
                    losses++;
                }
            }
        }

        System.out.println("Games: " + count);
        System.out.println("Wins: " + wins);
        System.out.println("Losses: " + losses);

    }

}

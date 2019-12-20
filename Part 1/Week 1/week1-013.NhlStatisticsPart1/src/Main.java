import java.util.Scanner;
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Player By Goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("Players by penalties");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("Stats for Sidney");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println("Stats for Philadelphia");
        NHLStatistics.teamStatistics("PHI");
        
        System.out.println("All Anaheim's Players");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");
        
        
        
    }
}

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random random = new Random();

        League<FootballTeam> footballLeague = new League<>("English Premier League");
        FootballTeam liverpool = new FootballTeam("Liverpool");
        FootballTeam manchester = new FootballTeam("Manchester United");
        
        liverpool.addPlayer(new FootballPlayer("Mohamed Salah"));
        manchester.addPlayer(new FootballPlayer("Cristiano Ronaldo"));

        footballLeague.addTeam(liverpool);
        footballLeague.addTeam(manchester);

        liverpool.matchResult(manchester, random.nextInt(10), random.nextInt(10));
        footballLeague.showLeagueTable();

        System.out.println("-".repeat(30));
        System.out.println("Now, let's switch to the basketball!");
        System.out.println("-".repeat(30));

        League<BasketballTeam> basketballLeague = new League<>("NBA");

        BasketballTeam lakers = new BasketballTeam("Los Angeles Lakers");
        BasketballTeam celtics = new BasketballTeam("Boston Celtics");
        BasketballTeam bulls = new BasketballTeam("Chicago Bulls");
        BasketballTeam warriors = new BasketballTeam("Golden State Warriors");
        BasketballTeam heat = new BasketballTeam("Miami Heat");

        celtics.addPlayer(new BasketballPlayer("Larry Bird"));
        lakers.addPlayer(new BasketballPlayer("Magic Johnson"));
        bulls.addPlayer(new BasketballPlayer("Michael Jordan"));
        warriors.addPlayer(new BasketballPlayer("Stephen Curry"));
        heat.addPlayer(new BasketballPlayer("Dwyane Wade"));
        
        basketballLeague.addTeam(lakers);
        basketballLeague.addTeam(celtics);
        basketballLeague.addTeam(bulls);
        basketballLeague.addTeam(warriors);
        basketballLeague.addTeam(heat);
        // basketballLeague.addTeam(liverpool);
        // Main.java:44: error: incompatible types: FootballTeam cannot be converted to BasketballTeam

        lakers.matchResult(celtics, random.nextInt(500), random.nextInt(500));
        lakers.matchResult(bulls, random.nextInt(500), random.nextInt(500));
        lakers.matchResult(warriors, random.nextInt(500), random.nextInt(500));
        lakers.matchResult(heat, random.nextInt(500), random.nextInt(500));
        warriors.matchResult(heat, random.nextInt(500), random.nextInt(500));
        bulls.matchResult(heat, random.nextInt(500), random.nextInt(500));

        System.out.println("-".repeat(30));
        System.out.println("Here's the final league table for the NBA:");
        System.out.println("-".repeat(30));

        basketballLeague.showLeagueTable();

        System.out.println("-".repeat(30));

        
    }
}
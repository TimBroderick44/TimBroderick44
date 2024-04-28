import java.util.ArrayList;
import java.util.List;

public abstract class Team<T extends Player> {
    private String name;
    private List<T> players = new ArrayList<>();
    private int won = 0;
    private int lost = 0;
    private int drew = 0;

    public Team(String name) {
        this.name = name;
    }

    public boolean addPlayer(T player) {
        if (!players.contains(player)) {
            players.add(player);
            System.out.println(player.getName() + " added to " + name);
            return true;
        }
        return false;
    }

    public void matchResult(Team<T> otherTeam, int team1, int team2) {
        String message;
        if (team1 > team2) {
            won++;
            message = " crushed ";
        } else if (team1 == team2) {
            drew++;
            message = " tied with ";
        } else {
            lost++;
            message = " was decimated by ";
        }
        if (otherTeam != null) {
            System.out.println(this.name + message + otherTeam.getName());
            otherTeam.matchResult(null, team2, team1);
        }
    }

    public int ranking() {
        return (won * 5) + drew;
    }

    public String getName() {
        return name;
    }
}

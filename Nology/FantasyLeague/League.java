import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// ? == Whether a team of football players or a team of baseball players, the League class can be used to manage them all
public class League<T extends Team<?>> {
    private String name;
    private List<T> teams = new ArrayList<>();

    public League(String name) {
        this.name = name;
    }

    public boolean addTeam(T team) {
        // Obviously a team can't be added twice
        if (!teams.contains(team)) {
            teams.add(team);
            return true;
        }
        return false;
    }

    // Collections.sort ( lambda function )
    
    // .sort has the syntax of Collections.sort(List<T> list, Comparator<? super T> c)

    //https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html#sort(T[],%20java.util.Comparator)
    // public static <T> void sort(T[] a,
    //         Comparator<? super T> c)

    // An array of generic type T is passed in, with a comparator of type T or any (wildcard = ?) superclass of T
    // Here, the comparator is the lambda function (team1, team2) -> Integer.compare(team2.ranking(), team1.ranking())

    // public static <T> void sort (teams, (team1, team2) -> Integer.compare(team2.ranking(), team1.ranking()))

    // https://www.w3schools.com/java/java_lambda.asp

    // A lambda expression is a short block of code which takes in parameters and returns a value. Lambda expressions are similar to methods, 
    // but they do not need a name and they can be implemented right in the body of a method.

    // In English = an implement and use a method without giving it a name or creating a class for it. It's a one-time use method.
    // A bad idea if you're going to use it more than once, as it's not reusable.

    // Lambda function = anonymous function. 
    // The syntax is (parameters) -> expression
    // i.e. (team1, team2) -> Integer.compare(team2.ranking(), team1.ranking())

    // new Comparator<Team>() {
    //     public int compare(Team team1, Team team2) {
    //         return Integer.compare(team2.ranking(), team1.ranking());
    //     }
    // }

    public void showLeagueTable() {
        Collections.sort(teams, (team1, team2) -> Integer.compare(team2.ranking(), team1.ranking()));
        teams.forEach(t -> System.out.println(t.getName() + ": " + t.ranking() + " points"));
    }
}
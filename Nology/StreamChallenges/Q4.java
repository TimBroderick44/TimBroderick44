import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Q4 {
public List<Subscriber> weeklyFemaleSubscribers(List<Subscriber> subscribers)
    {
    return subscribers.stream()
    .filter(subscriber -> subscriber.getGender().equals("female") &&
    subscriber.getAge() >= 20 && subscriber.getAge() <= 40)
    .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        Q4 q4 = new Q4();
        List<Subscriber> customers = Arrays.asList(
            new Subscriber(25, "female"),
            new Subscriber(35, "female"),
            new Subscriber(29, "male"),
            new Subscriber(22, "female"),
            new Subscriber(45, "female"),
            new Subscriber(19, "female"),
            new Subscriber(31, "male"),
            new Subscriber(38, "female")
            );

        List<Subscriber> femaleSubscribers = q4.weeklyFemaleSubscribers(customers);
        System.out.println(femaleSubscribers.toString());
    }
}

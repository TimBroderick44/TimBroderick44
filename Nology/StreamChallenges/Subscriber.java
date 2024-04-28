public class Subscriber {
    private int age;
    private String gender;

    public Subscriber(int age, String gender) {
        this.age = age;
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Subscriber{" +
            "age=" + age +
            ", gender='" + gender + '\'' +
            '}';
    }
}

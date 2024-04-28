public class Animal {
    private String species;
    private String name;
    private String sound;

    public Animal() {
        this.species = "cat";
        this.name = "cat";
        this.sound = "meows";
    }

    public Animal(String species, String name, String sound) {
        this.species = species;
        this.name = name;
        this.sound = sound;
    }

    public String makeSound() {
        return this.name + " the " + this.species + " " + this.sound;
    }

    public static void main(String[] args) {
        Animal cat = new Animal();
        System.out.println(cat.makeSound());

        Animal dog = new Animal("dog", "dog", "woofs");
        System.out.println(dog.makeSound());

        Animal bear = new Animal("bear", "bear", "roars");
        System.out.println(bear.makeSound());
    }
}

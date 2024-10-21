package inheritancePractice;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, String type, String size, String color, double weight, String breed, String speed) {
        super(name, type, size, color, weight, speed);
        this.breed = breed;
    }
    public void bark() {
        System.out.println(super.getName() + " is barking");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(super.getName() + " is eating dog food");
    }

    @Override
    public void sleep() {
        System.out.println(super.getName() + " is sleeping on the couch in a curled up ball");
    }

    @Override
    public void move(String speed) {
        System.out.println(super.getName() + " is running at " + speed);
    }

    public void fetch(String speed) {
        System.out.println(super.getName() + " is fetching the ball at speed: " + speed);
    }

    public void wagTail() {
        System.out.println(super.getName() + " is wagging its tail");
    }
    @Override
    public void makeNoise() {
        if (super.type == "wolf" || super.type == "coyote") {
            System.out.println(super.getName() + " is howling");
        } else {
            bark();
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                "} " + super.toString();
    }
}

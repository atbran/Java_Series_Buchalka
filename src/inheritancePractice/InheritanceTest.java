package inheritancePractice;

public class InheritanceTest {

    public static void main(String[] args) {
            Animal animal = new Animal("Unknown", "Unknown", "Unknown", "Unknown", 0.0, "0mph");
           Dog dog = new Dog("Fido", "Dog", "Medium", "Brown", 50.0, "Golden Retriever", "20mph");
           Dog wolf = new Dog("Wolfie", "wolf", "Large", "Grey", 100.0, "Wolf", "5000mph");
           Fish fish = new Fish("Goldie", "Fish", "Small", "Gold", 0.5, "1mph", "Dorsal");
           doAnimalStuff(dog);
           doAnimalStuff(wolf);
           doAnimalStuff(fish);
           System.out.println(fish.toString());

   }


    public static void doAnimalStuff(Animal animal) {
        animal.eat();
        animal.sleep();
        animal.makeNoise();
        animal.move("5mph");
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
            dog.fetch("5mph");
            dog.wagTail();
        }
        else
        {
            System.out.println("This is not a dog");
        }
        System.out.println("\n\n\n");
    }
}
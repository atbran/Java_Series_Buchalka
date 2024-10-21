package inheritancePractice;

public class Fish extends Animal{
    private String finType;

    public Fish(){
        super();
        this.finType = "Unknown";
        System.out.println("Default Fish Constructor");
    }
    public Fish(String Name, String type, String Size, String color, double weight, String speed, String finType){
        super(Name, type, Size, color, weight, speed);
        this.finType = finType;
    }

    public void move(String speed){
        swim();
    }
    private void swim(){
        System.out.println(super.getName() + " is swimming at speed: " + super.getSpeed());
    }
    public void makeNoise(){
        System.out.println("Glub glub he whispers...");
    }

    @Override
    public String toString() {
        return "Fish{" +
                "finType='" + finType + '\'' +
                "} " + super.toString();
    }
}

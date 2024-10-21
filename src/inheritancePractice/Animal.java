package inheritancePractice;

public class Animal {
    protected String type;
    private String Name;
    private String size;
    private String color;
    private double weight;
    private String speed;

    public Animal() {
        this.type = "Unknown";
        this.Name = "Unknown";
        this.size = "Unknown";
        this.color = "Unknown";
        this.weight = 0.0;
        this.speed = "0mph";
    }

    public Animal(String Name, String type, String size, String color, double weight, String speed) {
        this.Name = Name;
        this.type = type;
        this.size = size;
        this.color = color;
        this.weight = weight;
        this.speed = speed;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public void eat() {
        System.out.println(this.Name + " is eating");
    }

    public void sleep() {
        System.out.println(this.Name + " is sleeping");
    }
    public void makeNoise() {
        System.out.println(this.Name + " is making some kind of noise");
    }
    public void makeNoise(String noise) {
        System.out.println(this.Name + " is making noise" + noise);
    }

    public void move(String speed) {
        System.out.println(this.Name + " is moving at " + speed);
    }
//    @Override
//    public String toString() {
//        return "Animal{" +
//                "type='" + type + '\'' +
//                ", size='" + size + '\'' +
//                ", color='" + color + '\'' +
//                ", weight=" + weight +
//                '}';
//    }


    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                ", Name='" + Name + '\'' +
                ", size='" + size + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                ", speed='" + speed + '\'' +
                '}';
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}

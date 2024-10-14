package classpractice;


public class carTest{

    private String name = "default";
    private int year = 0;
    private int mileage = 0;
    private int price = 0;
    private int speed = 0;
    private int weight = 0;
    private boolean isRunning = false;



    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public int getMileage() {
        return mileage;
    }

    public int getPrice() {
        return price;
    }

    public int getSpeed() {
        return speed;
    }

    public int getWeight() {
        return weight;
    }

    public boolean isRunning() {
        return isRunning;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setRunning(boolean running) {
        isRunning = running;
    }

    public void describeCar(){
        System.out.println("The car is a " + name + " from " + year + " with " + mileage + " miles on it. It costs $" + price + "." + " This car is currently running: " + isRunning);
    }
}

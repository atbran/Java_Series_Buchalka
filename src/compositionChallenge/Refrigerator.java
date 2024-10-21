package compositionChallenge;

public class Refrigerator {

    private String Brand;
    private boolean hasWorkToDo;

    public String orderFood(String foodOrder){
        return "This has been ordered: " + foodOrder;
    }

    public Refrigerator() {
        Brand = "no input";
        this.hasWorkToDo = false;
    }

    public Refrigerator(String brand, boolean hasWorktodo) {
        Brand = brand;
        this.hasWorkToDo = hasWorktodo;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public boolean isHasWorkToDo() {
        return hasWorkToDo;
    }

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }
}

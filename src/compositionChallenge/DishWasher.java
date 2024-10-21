package compositionChallenge;

public class DishWasher {
    private String Brand;
    private boolean hasWorkToDo;

    public void doDishes(){

        System.out.println("Dishwasher is doing the dishes");
    }

    public DishWasher() {
        Brand = "no input";
        this.hasWorkToDo = false;
    }

    public DishWasher(String brand, boolean hasWorkToDo) {
        Brand = brand;
        this.hasWorkToDo = hasWorkToDo;
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

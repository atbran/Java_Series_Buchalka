package compositionChallenge;

public class CoffeeMaker {
    private String Brand;
    private boolean hasWorkToDo;


    public void brewCoffee(){

        System.out.println("CoffeeMaker is brewing Coffee");
    }
    public CoffeeMaker(){
        Brand = "no input";
        this.hasWorkToDo = false;
    }

    public CoffeeMaker(String brand, boolean hasWorkToDo) {
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

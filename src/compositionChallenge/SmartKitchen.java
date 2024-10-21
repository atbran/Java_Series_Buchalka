package compositionChallenge;

public class SmartKitchen {
    public static void main(String[] args) {
    doKitchenWork();
    IceBox.setHasWorkToDo(true);
    DishMaster.setHasWorkToDo(true);
    frenchPress9000.setHasWorkToDo(true);
    doKitchenWork();
    }

    static Refrigerator IceBox = new Refrigerator("IceBOX", false);
    static DishWasher DishMaster = new DishWasher("DishMaster", false);
    static CoffeeMaker frenchPress9000 = new CoffeeMaker("FrenchPress9000", false);

    private static String orderFood(){
        if (IceBox.isHasWorkToDo()){
            return IceBox.getBrand() + " is getting food";
        }
        else{
            return "There is nothing to order";
        }
    }

    private static String doDishes(){
        if (DishMaster.isHasWorkToDo()){
            return DishMaster.getBrand() + " is washing the dishes";
        }
        else{
            return "There is nothing to wash";
        }
    }
    private static String brewCoffee(){
        if (frenchPress9000.isHasWorkToDo()){
            return frenchPress9000.getBrand() + " is brewing the coffee";
        }
        else{
            return "There is nothing to brew.";
        }
    }

    private static void doKitchenWork(){

        System.out.println(doDishes());
        System.out.println(orderFood());
        System.out.println(brewCoffee());

        System.out.println("Doing kitchen stuff");
    }
}

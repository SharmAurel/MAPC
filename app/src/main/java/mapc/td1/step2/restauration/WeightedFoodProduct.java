package mapc.td1.step2.restauration;

public interface WeightedFoodProduct extends FoodProduct {

    public double weight();
    default double calories(){
        return 0;
    }
    
}

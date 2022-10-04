package mapc.td1.step2.burger;

import mapc.td1.step2.restauration.WeightedFoodProduct;

public class Ingredient implements WeightedFoodProduct{

    private FoodType type;
    private double weight;

    public Ingredient(FoodType type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double price() {
        return 0;
    }

    @Override
    public boolean hasUniquePrice() {
        return this.type.hasUniquePrice();
    }

    @Override
    public double calories_per_100g() {
        // TODO Auto-generated method stub
        return 0;
    }
    @Override
    public double calories() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double weight() {
        // TODO Auto-generated method stub
        return 0;
    }
}

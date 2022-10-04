package mapc.td1.step1.general;

public class Meat implements FoodProduct {

    
        // BEEF : 200 kcal / 100g
        // WHITEFISH : 170 kcal / 100g

  

    private MeatType type;
    private double weight;

    public Meat(MeatType type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double price() {
        return type.price() * weight / 100;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s (%.0fg) -- %.2f€", type, weight(), price());
    }

    
    @Override
    public double calories_per_100g() {
        return this.type.calories_per_100g();
    }

    @Override
    public double calories() {
        return calories_per_100g()/100*weight;
    }
}
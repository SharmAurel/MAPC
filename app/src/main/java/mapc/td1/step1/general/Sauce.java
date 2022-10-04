package mapc.td1.step1.general;

public class Sauce implements FoodProduct {

 
        // BURGER : 240 kcal / 100g
        // BARBECUE : 130 kcal / 100g
        // BEARNAISE : 550 kcal / 100g
    

    private static double BASE_PRICE = 1;

    private SauceType type;
    private double weight;

    public Sauce(SauceType type, double weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public double price() {
        return BASE_PRICE;
    }

    @Override
    public double weight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("%s sauce (%.0fg) -- %.2f€", type, weight(), price());
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

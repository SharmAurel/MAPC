package mapc.td1.step2.burger;

import java.util.List;

import mapc.td1.step2.restauration.WeightedFoodProduct;

public class Burger implements WeightedFoodProduct{

    String name;
    List<Ingredient> items;

    

    public Burger(String name, List<Ingredient> items) {
        this.name = name;
        this.items = items;
    }
   
    

    @Override
    public double weight() {
        return items.stream().map(Ingredient::weight).reduce(0.0, Double::sum);
    }

    @Override
    public double price() {
        return items.stream().map(Ingredient::price).reduce(0.0, Double::sum);
    }

    @Override
    public String toString() {
        final String DELIM = "--------------------\n";
        StringBuilder buffer = new StringBuilder();
        buffer.append(String.format("*** Menu %s ***\n", name));
        for (Object item : items) {
            buffer.append(String.format("- %s\n", item));
        }
        buffer.append(DELIM);
        buffer.append(String.format("price:         %.2f\n", price()));
        buffer.append(DELIM);
        buffer.append(String.format("calories:         %.2f\n", calories()));
        buffer.append(DELIM);
        buffer.append(String.format("calories au 100g:         %.2f\n", calories_per_100g()));
        return buffer.toString();
    }

    @Override
    public double calories_per_100g() {
        return calories()/weight()*100;
    }

    @Override
    public double calories() {
        return items.stream().map(Ingredient::calories).reduce(0.0, Double::sum);
    }



    @Override
    public boolean hasUniquePrice() {
        // TODO Auto-generated method stub
        return false;
    }
}

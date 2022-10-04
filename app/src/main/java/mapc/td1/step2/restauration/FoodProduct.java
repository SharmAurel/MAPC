package mapc.td1.step2.restauration;

import mapc.td1.step2.money.Product;
import mapc.td1.step2.food.Food;

public interface FoodProduct extends Food,Product {

    public boolean hasUniquePrice();
}

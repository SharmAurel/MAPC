package mapc.td1.step2.burger;

import mapc.td1.step2.restauration.FoodProduct;

public enum FoodType implements FoodProduct{
    
    BURGER,BARBECUE,BEARNAISE,BEEF,WHITEFISH,CHEDDAR,DEEPFREIDONIONS,TOMATO;

    @Override
    public double calories_per_100g() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double price() {
        if(this.hasUniquePrice()==true)
        {
            return 1;
        }
        else{
            //this.
        }
        return 0;
    }

    @Override
    public boolean hasUniquePrice() {
        boolean moningredient;
        if(this.equals(BURGER)||this.equals(BARBECUE)||this.equals(BEARNAISE)){
            moningredient=true;
        }
        else{
            moningredient=false;
        }
        return moningredient;
    }

}

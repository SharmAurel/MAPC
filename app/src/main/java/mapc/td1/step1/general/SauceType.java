package mapc.td1.step1.general;


public enum SauceType implements Food{
      BURGER, BARBECUE, BEARNAISE;
        // BURGER : 240 kcal / 100g
        // BARBECUE : 130 kcal / 100g
        // BEARNAISE : 550 kcal / 100g

    @Override
    public double calories_per_100g() {
        if(this.equals(BARBECUE))
        {
            return 130;
        }
        else if(this.equals(BURGER))
        {
            return 240;
        }
        else{
            return 550;
        }
        
    }
}

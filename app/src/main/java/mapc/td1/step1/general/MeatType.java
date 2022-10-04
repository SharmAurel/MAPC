package mapc.td1.step1.general;

public enum MeatType implements Food{
        BEEF, WHITEFISH;
        // BEEF : 200 kcal / 100g
        // WHITEFISH : 170 kcal / 100g

        public double price() {
            double rtr;
            switch (this) {
                case WHITEFISH:
                    rtr = 6;
                    break;
                case BEEF:
                default:
                    rtr = 4;
            }
            return rtr;
        }

    @Override
    public double calories_per_100g() {
        if(this.equals(BEEF))
        {
            return 200;
        }
        else {
            return 170;
        }
    }
}

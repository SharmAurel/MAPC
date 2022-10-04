package mapc.td1.step2.client;


import java.util.Arrays;
import java.util.List;
import mapc.td1.step1.general.*;
import mapc.td1.step1.general.Cheddar;
import mapc.td1.step1.general.Sauce;
import mapc.td1.step1.general.SauceType;
import mapc.td1.step1.general.MeatType;
import mapc.td1.step1.general.Burger;
import mapc.td1.step1.general.DeepFriedOnions;
import mapc.td1.step1.general.Meat;
import static mapc.td1.step1.general.MeatType.*;
import static mapc.td1.step1.general.SauceType.*;

public class App {
    public static void main(String args[]) {
        Burger alice_dinner = new Burger(
                "Fishy",
                List.of(new Meat(WHITEFISH, 50),
                        new Sauce(BEARNAISE, 40))
        );
        Burger bob_dinner = new Burger(
                "Beefy",
                List.of(new Meat(BEEF, 100),
                        new Sauce(BURGER, 40),
                        new DeepFriedOnions(10),
                        new Cheddar(15),
                        new DeepFriedOnions(10),
                        new Cheddar(15))
        );
        Burger charles_dinner = new Burger(
                "Own Style",
                List.of(new Meat(BEEF,400),
                        new DeepFriedOnions(20),
                        new Cheddar(30),
                        new Sauce(BARBECUE,20),
                        new Sauce(BEARNAISE,20),
                        new Sauce(BURGER,20),
                        new Cheddar(30))
        );
        List<Burger> dinners = Arrays.asList(
                alice_dinner,
                bob_dinner,
                charles_dinner
        );
        for (Burger dinner : dinners) {
            System.out.println(dinner);
        }
    }
}
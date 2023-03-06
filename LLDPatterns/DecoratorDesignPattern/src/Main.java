import PizzaExample.BasePizza;
import PizzaExample.ExtraCheese;
import PizzaExample.Mushroom;
import PizzaExample.VegDelight;

public class Main {
    public static void main(String[] args) {
        BasePizza basePizza = new Mushroom(new ExtraCheese(new VegDelight()));
        System.out.println(basePizza.cost());
    }
}
package decorator.pizzeria;

public abstract class Pizzeria {

    public static CustomPizza createMargharritta(){
        return new CustomPizza(new SimplePizza()).addIngredient("oregano");
    }

}

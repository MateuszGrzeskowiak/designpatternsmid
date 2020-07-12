package decorator.pizzeria;

public class Main {
    public static void main(String[] args) {

        SimplePizza simplePizza = new SimplePizza();
        System.out.println(simplePizza.getPrice());
        System.out.println(simplePizza.getIngredients());

        CustomPizza customPizza = new CustomPizza(simplePizza);
        customPizza
                .addIngredient("oregano")
                .addIngredient("ser")
                .addIngredient("rukola")
                .addIngredient("kukurydza")
                .addIngredient("cebula")
                .addIngredient("tunczyk");
        System.out.println(customPizza.getIngredients());
        System.out.println(customPizza.getPrice());

        System.out.println(Pizzeria.createMargharritta().getPrice());
        System.out.println(Pizzeria.createMargharritta().getIngredients());
    }
}

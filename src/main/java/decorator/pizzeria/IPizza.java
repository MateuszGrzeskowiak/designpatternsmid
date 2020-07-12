package decorator.pizzeria;

import java.util.List;

public interface IPizza {
    List<String> getIngredients();
    double getPrice();
}

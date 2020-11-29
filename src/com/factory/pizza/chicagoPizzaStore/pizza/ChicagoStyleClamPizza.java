package com.factory.pizza.chicagoPizzaStore.pizza;

import com.factory.pizza.Pizza;
import com.factory.pizza.PizzaIngredientFactory;

public class ChicagoStyleClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public ChicagoStyleClamPizza(PizzaIngredientFactory ingredientFactory) {
        this.ingredientFactory = ingredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println("Pepperoni " + getName());
        dough = ingredientFactory.createDough();
        sauce = ingredientFactory.createSauce();
        cheese = ingredientFactory.createCheese();
    }
}

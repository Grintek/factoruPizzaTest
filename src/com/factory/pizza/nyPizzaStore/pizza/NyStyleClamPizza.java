package com.factory.pizza.nyPizzaStore.pizza;

import com.factory.pizza.Pizza;
import com.factory.pizza.PizzaIngredientFactory;

public class NyStyleClamPizza extends Pizza {
    PizzaIngredientFactory ingredientFactory;

    public NyStyleClamPizza(PizzaIngredientFactory ingredientFactory) {
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

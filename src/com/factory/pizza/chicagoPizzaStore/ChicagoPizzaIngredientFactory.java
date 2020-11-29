package com.factory.pizza.chicagoPizzaStore;

import com.factory.pizza.PizzaIngredientFactory;
import com.factory.pizza.chicagoPizzaStore.ingredient.FrozenClams;
import com.factory.pizza.ingredient.*;
import com.factory.pizza.ingredient.sliced.SlicedPepperoni;
import com.factory.pizza.nyPizzaStore.ingredient.MarinaraSauce;
import com.factory.pizza.nyPizzaStore.ingredient.ReggianoCheese;
import com.factory.pizza.nyPizzaStore.ingredient.ThinCrustDough;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
    @Override
    public Dough createDough() {
        return new ThinCrustDough();
    }

    @Override
    public Sauce createSauce() {
        return new MarinaraSauce();
    }

    @Override
    public Cheese createCheese() {
        return new ReggianoCheese();
    }

    @Override
    public Veggies[] createVeggies() {
        Veggies veggies[] = {new Veggies(), new Veggies(), new Veggies()};
        return veggies;
    }

    @Override
    public Pepperoni createPepperoni() {
        return new SlicedPepperoni();
    }

    @Override
    public Clams createClam() {
        return new FrozenClams();
    }
}

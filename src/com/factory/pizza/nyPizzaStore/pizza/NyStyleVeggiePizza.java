package com.factory.pizza.nyPizzaStore.pizza;

import com.factory.pizza.Pizza;

public class NyStyleVeggiePizza extends Pizza {

    public NyStyleVeggiePizza() {
        setName("Ny Style Sauce and Cheese Pizza");
        setDough("Thin Crust Dough");
        setSauce("Marinara Sauce");

        getToppings().add("Grated Reggiano Cheese");
    }
}

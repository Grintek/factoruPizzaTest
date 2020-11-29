package com.factory.pizza.chicagoPizzaStore.pizza;

import com.factory.pizza.Pizza;

public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        setName("Chicago Style Sauce and Cheese Pizza");
        setDough("Thin Crust Dough");
        setSauce("Marinara Sauce");

        getToppings().add("Grated Chicago Cheese");
    }
}

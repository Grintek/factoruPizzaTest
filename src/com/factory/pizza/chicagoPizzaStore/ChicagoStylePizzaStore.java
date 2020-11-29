package com.factory.pizza.chicagoPizzaStore;

import com.factory.pizza.Pizza;
import com.factory.pizza.PizzaStore;
import com.factory.pizza.chicagoPizzaStore.pizza.ChicagoStyleClamPizza;
import com.factory.pizza.chicagoPizzaStore.pizza.ChicagoStylePepperoniPizza;
import com.factory.pizza.chicagoPizzaStore.pizza.ChicagoStyleVeggiePizza;
import com.factory.pizza.chicagoPizzaStore.pizza.ChicagoStyleCheesePizza;
import com.factory.pizza.nyPizzaStore.pizza.NyStyleCheesePizza;
import com.factory.pizza.nyPizzaStore.pizza.NyStyleClamPizza;
import com.factory.pizza.nyPizzaStore.pizza.NyStylePepperoniPizza;
import com.factory.pizza.nyPizzaStore.pizza.NyStyleVeggiePizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    Pizza pizza;
    @Override
    public Pizza createPizza(String type) {
        pizza = null;

        switch (type) {
            case "cheese":
                pizza = new NyStyleCheesePizza();
                break;
            case "pepperoni":
                pizza = new NyStylePepperoniPizza();
                break;
            case "clam":
                pizza = new NyStyleClamPizza();
                break;
            case "veggie":
                pizza = new NyStyleVeggiePizza();
                break;
        }
        return pizza;
    }
}

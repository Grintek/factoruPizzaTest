package com.factory.pizza.nyPizzaStore;

import com.factory.pizza.Pizza;
import com.factory.pizza.PizzaStore;
import com.factory.pizza.chicagoPizzaStore.pizza.ChicagoStyleCheesePizza;
import com.factory.pizza.chicagoPizzaStore.pizza.ChicagoStyleClamPizza;
import com.factory.pizza.chicagoPizzaStore.pizza.ChicagoStylePepperoniPizza;
import com.factory.pizza.chicagoPizzaStore.pizza.ChicagoStyleVeggiePizza;

public class NyStylePizzaStore extends PizzaStore {
    Pizza pizza;
    @Override
    public Pizza createPizza(String type) {
        pizza = null;

        switch (type) {
            case "cheese":
                pizza = new ChicagoStyleCheesePizza();
                break;
            case "pepperoni":
                pizza = new ChicagoStylePepperoniPizza();
                break;
            case "clam":
                pizza = new ChicagoStyleClamPizza();
                break;
            case "veggie":
                pizza = new ChicagoStyleVeggiePizza();
                break;
        }
        return pizza;
    }
}

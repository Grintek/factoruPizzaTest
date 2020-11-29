package com.factory.pizza;

import com.factory.pizza.typePizza.CheesePizza;
import com.factory.pizza.typePizza.ClamPizza;
import com.factory.pizza.typePizza.PepperoniPizza;
import com.factory.pizza.typePizza.VeggiePizza;

public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;

        switch (type) {
            case "cheese":
                pizza = new CheesePizza();
                break;
            case "pepperoni":
                pizza = new PepperoniPizza();
                break;
            case "clam":
                pizza = new ClamPizza();
                break;
            case "veggie":
                pizza = new VeggiePizza();
                break;
        }
        return pizza;
    }
}

package com.sherlocky.headfirst.pattern._04_factory._3_abstractfactory;

import com.sherlocky.headfirst.pattern._04_factory._3_abstractfactory.factory.PizzaIngredientFactory;
import com.sherlocky.headfirst.pattern._04_factory._3_abstractfactory.pizza.AbstractPizza;

/**
 * {@link AbstractPizzaStore}
 * {@link AbstractPizza}
 * {@link PizzaIngredientFactory}
 */
public class PizzaTestDrive {

    public static void main(String[] args) {
        AbstractPizzaStore nyStore = new NYPizzaStore();
        AbstractPizzaStore chicagoStore = new ChicagoPizzaStore();

        AbstractPizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("clam");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("clam");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("pepperoni");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("pepperoni");
        System.out.println("Joel ordered a " + pizza + "\n");

        pizza = nyStore.orderPizza("veggie");
        System.out.println("Ethan ordered a " + pizza + "\n");

        pizza = chicagoStore.orderPizza("veggie");
        System.out.println("Joel ordered a " + pizza + "\n");
    }
}

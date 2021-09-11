package AbstractFactory;

import AbstractFactory.FactoryPizzarias.FactoryPizzaria;
import AbstractFactory.FactoryPizzarias.FactoryPizzariaNovaYork;
import AbstractFactory.Pizzas.Pizza;

public class Main {
    public static void main(String[] args) {
        FactoryPizzaria factoryPizzariaNovaYork = new FactoryPizzariaNovaYork();
        Pizza pizza = factoryPizzariaNovaYork.pedidoPizza("pepperoni");
        System.out.println("Danilo pedio "+ pizza.getNome());
    }//main
}//classe

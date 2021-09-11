package AbstractFactory;

import AbstractFactory.FactoryPizzarias.Pizzaria;
import AbstractFactory.FactoryPizzarias.PizzariaChicago;
import AbstractFactory.FactoryPizzarias.PizzariaNovaYork;
import AbstractFactory.Pizzas.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizzaria pizzariaNovaYork = new PizzariaNovaYork();
        Pizza pizza = pizzariaNovaYork.pedidoPizza("pepperoni");
        System.out.println("Danilo pedio "+ pizza.getNome());
    }//main
}//classe

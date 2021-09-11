package AbstractFactory;

import AbstractFactory.FactoryPizzarias.Pizzaria;
import AbstractFactory.FactoryPizzarias.PizzariaNovaYork;
import AbstractFactory.Pizzas.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizzaria pizzariaNY = new PizzariaNovaYork();
        Pizza pizza = pizzariaNY.pedidoPizza("queijo");
        System.out.println("Danilo pedio "+ pizza.getNome());

    }//main
}//classe

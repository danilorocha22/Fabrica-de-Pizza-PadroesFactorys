package FactoryMethod;

import FactoryMethod.Factorys.Pizzaria;
import FactoryMethod.Factorys.PizzariaNovaYork;
import FactoryMethod.Pizzas.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizzaria pizzariaNY = new PizzariaNovaYork();
        Pizza pizza = pizzariaNY.pedidoPizza("queijo");
        System.out.println("Danilo pedio uma pizza de "+ pizza.getNome());

    }//main
}//classe

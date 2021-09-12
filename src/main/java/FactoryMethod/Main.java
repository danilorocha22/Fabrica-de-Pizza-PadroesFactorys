package FactoryMethod;

import FactoryMethod.Factorys.Pizzaria;
import FactoryMethod.Factorys.PizzariaChicago;
import FactoryMethod.Factorys.PizzariaNovaYork;
import FactoryMethod.Pizzas.Pizza;

public class Main {
    public static void main(String[] args) {
        Pizzaria pizzariaNY = new PizzariaNovaYork();
        Pizzaria pizzariaChicago = new PizzariaChicago();

        Pizza pizza = pizzariaNY.pedidoPizza("queijo");
        System.out.println("Danilo pediu uma "+ pizza.getNome()+"\n");

        pizza = pizzariaChicago.pedidoPizza("queijo");
        System.out.println("João pediu uma "+ pizza.getNome());

    }//main
}//classe

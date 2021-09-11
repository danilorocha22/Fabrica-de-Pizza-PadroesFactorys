package FactoryMethod.Factorys;

import FactoryMethod.Pizzas.Pizza;

public abstract class Pizzaria {

    public final Pizza pedidoPizza(String tipo) {
        Pizza pizza = criarPizza(tipo);
        pizza.preparar();
        pizza.assar();
        pizza.cortar();
        pizza.embalar();
        pizza.entregar();
        return pizza;
    }//metodo

    //Factory Method
    abstract Pizza criarPizza(String tipo);

}//classe

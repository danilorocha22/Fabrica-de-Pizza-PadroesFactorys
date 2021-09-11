package AbstractFactory.FactoryPizzarias;

import AbstractFactory.Pizzas.Pizza;

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

    abstract Pizza criarPizza(String tipo);

}//classe

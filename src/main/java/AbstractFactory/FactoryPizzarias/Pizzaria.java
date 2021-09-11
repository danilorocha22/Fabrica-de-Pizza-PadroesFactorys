package AbstractFactory.FactoryPizzarias;

import AbstractFactory.Pizzas.Pizza;

public abstract class Pizzaria {

    public final Pizza pedidoPizza(String tipo) {
        Pizza pizza = criarPizza(tipo);
        pizza.preparar();
        assar();
        cortar();
        embalar();
        entregar();
        return pizza;
    }//metodo

    abstract Pizza criarPizza(String tipo);

    public void assar() {
        System.out.println("Assar por 25 min a 300º.");
    }//metodo

    public void cortar() {
        System.out.println("Cortando a pizza em pedaços triangulares.");
    }//metodo

    public void embalar() {
        System.out.println("Embalar a pizza na caixa adequada.");
    }//metodo

    public void entregar() {
        System.out.println("Entregar a pizza.");
    }//metodo

}//classe

package SimpleFactory.Pizzaria;

import SimpleFactory.Factory.SimpleFactoryPizza;
import SimpleFactory.Pizzas.Pizza;

public class Pizzaria {
    SimpleFactoryPizza fabricaPizza;

    public Pizzaria(SimpleFactoryPizza fabrica) {
        this.fabricaPizza = fabrica;
    }//construtor

    public Pizza pedidoPizza(String tipo) {
        Pizza pizza = fabricaPizza.criarPizza(tipo);
        pizza.prepararPizza(tipo);
        pizza.assar();
        pizza.cortar();
        pizza.embalar();
        pizza.entregar();
        return pizza;
    }//metodo

}//classe

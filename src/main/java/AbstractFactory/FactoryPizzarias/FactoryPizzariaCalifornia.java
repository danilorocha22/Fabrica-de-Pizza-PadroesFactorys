package AbstractFactory.FactoryPizzarias;

import AbstractFactory.FactoryIngredientes.FactoryIngredientesCalifornia;
import AbstractFactory.FactoryIngredientes.FactoryIngredientes;
import AbstractFactory.Pizzas.*;

public class FactoryPizzariaCalifornia extends FactoryPizzaria {
    @Override
    Pizza criarPizza(String tipo) {
        Pizza pizza = null;
        FactoryIngredientes factoryIngredientes = new FactoryIngredientesCalifornia();
        if (tipo.equals("queijo")) {
            pizza = new PizzaDeQueijo(factoryIngredientes);
            pizza.setNome("Pizza de Queijo no estilo da California.");
        } else if (tipo.equals("vegetariana")) {
            pizza = new PizzaVegetariana(factoryIngredientes);
            pizza.setNome("Pizza Vegetariana no estilo da California");
        } else if (tipo.equals("marisco")) {
            pizza = new PizzaDeMarisco(factoryIngredientes);
            pizza.setNome("Pizza de Mariscos no estilo da California");
        } else if (tipo.equals("pepperoni")) {
            pizza = new PizzaDePepperoni(factoryIngredientes);
            pizza.setNome("Pizza de Pepperoni no estilo da California");
        }
        return pizza;
    }//metodo

}//classe

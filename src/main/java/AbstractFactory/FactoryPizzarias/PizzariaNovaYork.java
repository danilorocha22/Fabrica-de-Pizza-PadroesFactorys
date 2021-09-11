package AbstractFactory.FactoryPizzarias;

import AbstractFactory.FactoryIngredientes.FactoryIngredientes;
import AbstractFactory.FactoryIngredientes.NYFactoryIngredientes;
import AbstractFactory.Pizzas.*;

public class PizzariaNovaYork extends Pizzaria {
    @Override
    protected Pizza criarPizza(String tipo) {
        Pizza pizza = null;
        FactoryIngredientes factoryIngredientes = new NYFactoryIngredientes();

        if (tipo.equals("queijo")) {
            pizza = new PizzaDeQueijo(factoryIngredientes);
            pizza.setNome("Piza de Queijo no estilo Nova York.");
        } else if (tipo.equals("vegetariana")) {
            pizza = new PizzaVegetariana(factoryIngredientes);
            pizza.setNome("Pizza Vegerariana no estilo Nova York.");
        } else if (tipo.equals("marisco")) {
            pizza = new PizzaDeMarisco(factoryIngredientes);
            pizza.setNome("Pizza de Mariscos no estilo Nova York. ");
        } else if (tipo.equals("pepperoni")) {
            pizza = new PizzaDePepperoni(factoryIngredientes);
            pizza.setNome("Pizza de Pepperoni no estilo Nova York.");
        }
        return pizza;
    }//metodo
}//classe

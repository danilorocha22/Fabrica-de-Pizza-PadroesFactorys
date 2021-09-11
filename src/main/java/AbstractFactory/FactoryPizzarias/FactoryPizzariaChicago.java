package AbstractFactory.FactoryPizzarias;

import AbstractFactory.FactoryIngredientes.FactoryIngredientesChicago;
import AbstractFactory.FactoryIngredientes.FactoryIngredientes;
import AbstractFactory.Pizzas.*;

public class FactoryPizzariaChicago extends FactoryPizzaria {
    @Override
    Pizza criarPizza(String tipo) {
        Pizza pizza = null;
        FactoryIngredientes factoryIngredientes = new FactoryIngredientesChicago();
        if (tipo.equals("queijo")) {
            pizza = new PizzaDeQueijo(factoryIngredientes);
            pizza.setNome("Pizza de Queijo no estilo de Chicago.");
        } else if (tipo.equals("vegetariana")) {
            pizza = new PizzaVegetariana(factoryIngredientes);
            pizza.setNome("Pizza Vegetariana no estilo de Chicago");
        } else if (tipo.equals("marisco")) {
            pizza = new PizzaDeMarisco(factoryIngredientes);
            pizza.setNome("Pizza de Mariscos no estilo de Chicago");
        } else if (tipo.equals("pepperoni")) {
            pizza = new PizzaDePepperoni(factoryIngredientes);
            pizza.setNome("Pizza de Pepperoni no estilo de Chicago");
        }
        return pizza;
    }//metodo

    @Override
    public void cortar() {
        System.out.println("Cortando a pizza em pedaços quadrados.");
    }//metodo

}//classe

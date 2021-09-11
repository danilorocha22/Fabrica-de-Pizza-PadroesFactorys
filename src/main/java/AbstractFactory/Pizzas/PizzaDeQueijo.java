package AbstractFactory.Pizzas;

import AbstractFactory.FactoryIngredientes.FactoryIngredientes;

import java.util.List;

public class PizzaDeQueijo extends Pizza {
    FactoryIngredientes factoryIngredientes;

    public PizzaDeQueijo(FactoryIngredientes factoryIngredientes) {
        this.factoryIngredientes = factoryIngredientes;
    }//construtor

    @Override
    public void preparar() {
        System.out.println("Preparando "+ nome);
        massa = factoryIngredientes.criarMassa();
        molho = factoryIngredientes.criarMolho();
        queijo = factoryIngredientes.criarQueijo();
        System.out.println("Cobertura:");
        cobertura =factoryIngredientes.criarCobertura();
    }//metodo


}//classe

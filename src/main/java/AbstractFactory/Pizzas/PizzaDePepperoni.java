package AbstractFactory.Pizzas;

import AbstractFactory.FactoryIngredientes.FactoryIngredientes;

public class PizzaDePepperoni extends Pizza {
    FactoryIngredientes factoryIngredientes;

    public PizzaDePepperoni(FactoryIngredientes factoryIngredientes) {
        this.factoryIngredientes = factoryIngredientes;
    }//construtor

    @Override
    public void preparar() {
        System.out.println("Preparando "+ nome);
        massa = factoryIngredientes.criarMassa();
        molho = factoryIngredientes.criarMolho();
        pepperoni = factoryIngredientes.criarPepperoni();
        System.out.println("Cobertura:");
        cobertura =factoryIngredientes.criarCobertura();
    }//metodo

}//classe

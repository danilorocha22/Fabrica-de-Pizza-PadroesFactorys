package AbstractFactory.Pizzas;

import AbstractFactory.FactoryIngredientes.FactoryIngredientes;

public class PizzaDeMarisco extends Pizza {
    FactoryIngredientes factoryIngredientes;

    public PizzaDeMarisco(FactoryIngredientes factoryIngredientes) {
        this.factoryIngredientes = factoryIngredientes;
    }//construtor

    @Override
    public void preparar() {
        System.out.println("Preparando "+ nome);
        massa = factoryIngredientes.criarMassa();
        molho = factoryIngredientes.criarMolho();
        molusco = factoryIngredientes.criarMolusco();
    }//metodo

}//classe

package AbstractFactory.Pizzas;

import AbstractFactory.FactoryIngredientes.FactoryIngredientes;

public class PizzaVegetariana extends Pizza {
    FactoryIngredientes factoryIngredientes;

    public PizzaVegetariana(FactoryIngredientes factoryIngredientes) {
        this.factoryIngredientes = factoryIngredientes;
    }//construtor

    @Override
    public void preparar() {
        System.out.println("Preparando "+ nome);
        massa = factoryIngredientes.criarMassa();
        molho = factoryIngredientes.criarMolho();
        vegetais = factoryIngredientes.criarVegetais();
    }
}

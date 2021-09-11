package FactoryMethod.Factorys;

import FactoryMethod.Pizzas.*;

public class PizzariaChicago extends Pizzaria {
    /**
     * Factory Method
     * @param tipo
     * @return
     */
    @Override
    Pizza criarPizza(String tipo) {
        if (tipo.equals("queijo")) {
            return new PizzaDeQueijoEstiloChicago();
        } else if (tipo.equals("vegetariana")) {
            return new PizzaVegetarianaEstiloChicago();
        } else if (tipo.equals("molusco")) {
            return new PizzaDeMoluscoEstiloChicago();
        } else if (tipo.equals("pepperoni")) {
            return new PizzaDePepperoniEstiloChicago();
        } else return null;
    }//metodo
}//classe

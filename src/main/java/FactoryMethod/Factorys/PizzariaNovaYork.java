package FactoryMethod.Factorys;

import FactoryMethod.Pizzas.*;

public class PizzariaNovaYork extends Pizzaria{
    /**
     * Factory Method
     * @param tipo
     * @return
     */
    @Override
    Pizza criarPizza(String tipo) {
        if (tipo.equals("queijo")) {
            return new PizzaDeQueijoEstiloNY();
        } else if (tipo.equals("vegetariana")) {
            return new PizzaVegetarianaEstiloNY();
        } else if (tipo.equals("molusco")) {
            return new PizzaDeMoluscoEstiloNY();
        } else if (tipo.equals("pepperoni")) {
            return new PizzaDePepperoniEstiloNY();
        } else return null;
    }//metodo
}//classe

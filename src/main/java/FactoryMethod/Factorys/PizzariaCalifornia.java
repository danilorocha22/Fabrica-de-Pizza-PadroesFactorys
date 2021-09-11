package FactoryMethod.Factorys;

import FactoryMethod.Pizzas.*;

public class PizzariaCalifornia extends Pizzaria {
    /**
     * Factory Method
     * @param tipo
     * @return
     */
    @Override
    Pizza criarPizza(String tipo) {
        if (tipo.equals("queijo")) {
            return new PizzaDeQueijoEstiloCalifornia();
        } else if (tipo.equals("vegetariana")) {
            return new PizzaVegetarianaEstiloCalifornia();
        } else if (tipo.equals("molusco")) {
            return new PizzaDeMoluscoEstiloCalifornia();
        } else if (tipo.equals("pepperoni")) {
            return new PizzaDePepperoniEstiloCalifornia();
        } else return null;
    }//metodo
}//classe

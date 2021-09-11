package SimpleFactory.Factory;

import SimpleFactory.Pizzas.*;

public class SimpleFactoryPizza {
    /**
     * Método de criação, geralmente é declarado statico.
     * @param tipo
     * @return pizza
     */
    public static Pizza criarPizza(String tipo) {
        Pizza pizza = null;

        if (tipo.equals("queijo")) {
            pizza = new PizzaDeQueijo();
        } else if (tipo.equals("pepperoni")) {
            pizza = new PizzaDePepperoni();
        } else if (tipo.equals("molusco")) {
            pizza = new PizzaDeMolusco();
        } else if (tipo.equals("vegetariana")) {
            pizza = new PizzaVegetariana();
        }
        return pizza;
    }//metodo

}//classe

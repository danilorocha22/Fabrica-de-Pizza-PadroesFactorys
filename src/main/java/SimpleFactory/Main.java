package SimpleFactory;

import SimpleFactory.Factory.SimpleFactoryPizza;
import SimpleFactory.Pizzaria.Pizzaria;

public class Main {
    public static void main(String[] args) {
        SimpleFactoryPizza factoryPizza = new SimpleFactoryPizza();
        Pizzaria pizzaria = new Pizzaria(factoryPizza);
        pizzaria.pedidoPizza("molusco");
    }
}

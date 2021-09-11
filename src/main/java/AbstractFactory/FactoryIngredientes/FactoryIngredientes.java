package AbstractFactory.FactoryIngredientes;

import AbstractFactory.Ingredientes.*;

public interface FactoryIngredientes {
    Massa criarMassa();
    Molho criarMolho();
    Queijo criarQueijo();
    Vegetais[] criarVegetais();
    Pepperoni criarPepperoni();
    Marisco criarMarisco();
    Cobertura[] criarCobertura();
}//classe

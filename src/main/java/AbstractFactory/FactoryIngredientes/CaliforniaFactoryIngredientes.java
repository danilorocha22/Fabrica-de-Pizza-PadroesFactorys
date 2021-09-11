package AbstractFactory.FactoryIngredientes;

import AbstractFactory.Ingredientes.*;

public class CaliforniaFactoryIngredientes implements FactoryIngredientes {


    @Override
    public Massa criarMassa() {
        return null;
    }

    @Override
    public Molho criarMolho() {
        return null;
    }

    @Override
    public Queijo criarQueijo() {
        return null;
    }

    @Override
    public Vegetais[] criarVegetais() {
        return new Vegetais[0];
    }

    @Override
    public Pepperoni criarPepperoni() {
        return null;
    }

    @Override
    public Marisco criarMarisco() {
        return null;
    }

    @Override
    public Cobertura[] criarCobertura() {
        return null;
    }
}//classe

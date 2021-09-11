package AbstractFactory.FactoryIngredientes;

import AbstractFactory.Ingredientes.*;

public class FactoryIngredientesNovaYork implements FactoryIngredientes {

    @Override
    public Massa criarMassa() {
        return new MassaFina();
    }//metodo

    @Override
    public Molho criarMolho() {
        return new MolhoMarinara();
    }//metodo

    @Override
    public Queijo criarQueijo() {
        return new QueijoReggiano();
    }//metodo

    @Override
    public Vegetais[] criarVegetais() {
        Vegetais vegetais[] = { new Alho(), new Cebola(), new Cogumelo(), new PimentaoVermelho() };
        return vegetais;
    }//metodo

    @Override
    public Pepperoni criarPepperoni() {
        return new PepperoniFatiado();
    }//metodo

    @Override
    public Marisco criarMarisco() {
        return new MariscoFresco();
    }//metodo

    @Override
    public Cobertura[] criarCobertura() {
        Cobertura cobertura[] = {new TomateFresco(), new Oregano(), new AzeitonaPreta() };
        return cobertura;
    }

}//classe

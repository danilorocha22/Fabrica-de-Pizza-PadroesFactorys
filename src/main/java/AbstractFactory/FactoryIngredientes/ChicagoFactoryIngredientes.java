package AbstractFactory.FactoryIngredientes;

import AbstractFactory.Ingredientes.*;

public class ChicagoFactoryIngredientes implements FactoryIngredientes {

    @Override
    public Massa criarMassa() {
        return new MassaGrossa();
    }//metodo

    @Override
    public Molho criarMolho() {
        return new MolhoDeTomate();
    }//metodo

    @Override
    public Queijo criarQueijo() {
        return new QueijoMussarela();
    }//metodo

    @Override
    public Vegetais[] criarVegetais() {
        Vegetais vegetais[] = { new AzeitonaPreta(), new Espinafre(), new Berinjela() };
        return vegetais;
    }//metodo

    @Override
    public Pepperoni criarPepperoni() {
        return new PepperoniFatiado();
    }//metodo

    @Override
    public Marisco criarMarisco() {
        return new MariscoCongelado();
    }//metodo

    @Override
    public Cobertura[] criarCobertura() {
        Cobertura cobertura[] = { new TomateSeco(), new Oregano() };
        return cobertura;
    }//metodo

}//classe

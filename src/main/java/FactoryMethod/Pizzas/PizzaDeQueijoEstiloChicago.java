package FactoryMethod.Pizzas;

public class PizzaDeQueijoEstiloChicago extends Pizza {
    public PizzaDeQueijoEstiloChicago() {
        nome = "Pizza de queijo prato fundo estilo Chicago";
        massa = "Massa extra grossa";
        molho = "Molho de tomate ameixa";
        coberturas.add("Queijo mozzarella ralado");
    }//construtor

    public void cortar() {
        System.out.println("Cortando a pizza em fatias quadradas.");
    }//metodo

}//classe

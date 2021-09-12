package SimpleFactory.Pizzas;

public class PizzaDeQueijo extends Pizza {
    public PizzaDeQueijo() {
        nome = "Pizza de queijo";
        coberturas.add("Tomates secos e orégano");
    }//construtor

    @Override
    public void cortar() {
        System.out.println("Cortando a pizza em pedaços quadrados");
    }
}//classe

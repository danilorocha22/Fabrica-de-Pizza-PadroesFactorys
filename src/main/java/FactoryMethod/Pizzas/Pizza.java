package FactoryMethod.Pizzas;

import java.util.ArrayList;
import java.util.List;

public abstract class Pizza {
    String nome, massa, molho;
    List<String> coberturas = new ArrayList<String>();

    public void preparar() {
        System.out.println("Preparando "+ nome);
        System.out.println("Amassando a massa... ");
        System.out.println("Jogando o molho... ");
        System.out.println("Adicionando coberturas: ");
        coberturas.stream().forEach(s -> System.out.println(s));
    }//metodo

    public void assar() {
        System.out.println("Assar por 25 min a 300º.");
    }//metodo

    public void cortar() {
        System.out.println("Cortando a pizza em pedaços triangulares.");
    }//metodo

    public void embalar() {
        System.out.println("Embalar a pizza na caixa adequada.");
    }//metodo

    public void entregar() {
        System.out.println("Entregar a pizza.");
    }

    public String getNome() {
        return nome;
    }//metodo

}//classe

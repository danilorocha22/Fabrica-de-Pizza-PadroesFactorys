package AbstractFactory.Pizzas;

import AbstractFactory.Ingredientes.*;

import java.util.Arrays;

public abstract class Pizza {
    String nome;
    Massa massa;
    Molho molho;
    Vegetais vegetais[];
    Queijo queijo;
    Pepperoni pepperoni;
    Marisco molusco;
    Cobertura[] cobertura;

    public abstract void preparar();

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

    public void setNome(String nome) {
        this.nome = nome;
    }//metodo

    @Override
    public String toString() {
        return "Pizza{" +
                "nome='" + nome + '\'' +
                ", massa=" + massa +
                ", molho=" + molho +
                ", vegetais=" + Arrays.toString(vegetais) +
                ", queijo=" + queijo +
                ", pepperoni=" + pepperoni +
                ", molusco=" + molusco +
                ", cobertura=" + Arrays.toString(cobertura) +
                '}';
    }
}//classe

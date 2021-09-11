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
    Marisco marisco;
    Cobertura[] cobertura;

    public abstract void preparar();

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
                ", marisco=" + marisco +
                ", cobertura=" + Arrays.toString(cobertura) +
                '}';
    }
}//classe


package com.ifpb.cassandra01;

import java.util.ArrayList;
import java.util.List;

public class Pessoa {
    private String cpf;
    private String nome;
    private int idade;
    private List<String> gostos;

    public Pessoa() {
        gostos = new ArrayList<>();
    }

    public Pessoa(String cpf, String nome, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        gostos = new ArrayList<>();
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public List<String> getGostos() {
        return gostos;
    }

    public void setGostos(List<String> gostos) {
        this.gostos = gostos;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "cpf=" + cpf + ", nome=" + nome + ", idade=" + idade + ", gostos=" + gostos + '}';
    }
    
    
    
    
}

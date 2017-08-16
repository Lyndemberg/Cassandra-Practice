
package com.ifpb.cassandra01;
public class Pessoa2 {
    private String cpf;
    private String nome;
    private int idade;
    private Endereco endereco;
    
    public Pessoa2(){
    
    }

    public Pessoa2(String cpf, String nome, int idade, Endereco endereco) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Pessoa2{" + "cpf=" + cpf + ", nome=" + nome + ", idade=" + idade + ", endereco=" + endereco + '}';
    }
    
    
}

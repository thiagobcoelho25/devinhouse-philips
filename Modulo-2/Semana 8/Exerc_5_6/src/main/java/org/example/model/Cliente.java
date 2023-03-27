package org.example.model;

public class Cliente {

    private int id;
    private String nome;
    private String CPF;

    public Cliente(int id, String nome, String CPF) {
        this.id = id;
        this.nome = nome;
        if(CPF.length() < 11 ){
            throw new IllegalArgumentException();
        } else {
            this.CPF = CPF;
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", CPF='" + CPF + '\'' +
                '}';
    }
}

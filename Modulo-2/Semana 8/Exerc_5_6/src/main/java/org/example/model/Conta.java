package org.example.model;

public class Conta {

    private int id;
    private Cliente cliente;
    private Double valor;

    public Conta(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.valor = 0.0;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Conta{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", valor=" + valor +
                '}';
    }

    public void depositar(double valor){
        this.valor = this.valor + valor;
    }

    public boolean sacar(double valor){
        if(this.valor - valor < 0){
            return false;
        } else {
            this.valor = this.valor - valor;
            return true;
        }
    }
}

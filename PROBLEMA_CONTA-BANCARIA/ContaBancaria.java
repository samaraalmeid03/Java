package entities;

public class ContaBancaria {
    //Criação e definição dos atributos numero, titular e saldo como privados.
    private int numero;
    private String titular;
    private double saldo;

    //Construtores:
    public ContaBancaria(int numero, String titular, double depositoInicial) {
        this.numero = numero;
        this.titular = titular;
        deposito(depositoInicial);
        /*Chamada do metodo deposito para atualizar o saldo da conta
        adicionando o valor do depositoInicial.*/
    }

    //Construtor sobrecarregado.
    public ContaBancaria(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }

    //Getters e setters:
    public int getNumero() {
        return numero;
    }

    public void setTitular(String titular) {
       this.titular = titular;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    //Métodos da classe:
    public void deposito(double valor) {
        saldo += valor;
    }

    public void saque(double valor) {
        saldo -= valor - 5.0;
    }

    public String toString() {
        return "Conta " + numero + ", Titular: "
                + titular + ", Saldo: R$ "
                + String.format("%.2f", saldo);
    }
}

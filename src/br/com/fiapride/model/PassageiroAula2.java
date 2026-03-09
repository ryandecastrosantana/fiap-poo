package br.com.fiapride.model;

public class PassageiroAula2 {

    public String nome;
    public String cpf;
    public double saldo;

    // Construtor
    public PassageiroAula2(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
        this.saldo = 0.0;
    }

    // Método para adicionar saldo
    public void adicionarSaldo(double valor) {

        if (valor <= 0) {
            System.out.println("Erro: valor inválido para recarga.");
            return;
        }

        saldo += valor;

        System.out.println("Recarga realizada. Saldo atual: " + saldo);
    }

    // Método para pagar viagem
    public void pagarViagem(double custo) {

        if (custo <= 0) {
            System.out.println("Erro: valor da viagem inválido.");
            return;
        }

        if (saldo < custo) {
            System.out.println("Erro: saldo insuficiente.");
            return;
        }

        saldo -= custo;

        System.out.println("Viagem paga! Saldo restante: " + saldo);
    }
}
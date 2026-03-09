package br.com.fiapride.main;

import br.com.fiapride.model.PassageiroAula2;

public class SistemaPrincipal2 {

    public static void main(String[] args) {

    	PassageiroAula2 passageiro1 = new PassageiroAula2("Ana Silva", "222");

        System.out.println("Adicionando saldo...");
        passageiro1.adicionarSaldo(50);

        System.out.println("Pagando viagem...");
        passageiro1.pagarViagem(20);

        System.out.println("Saldo final: " + passageiro1.saldo);


        PassageiroAula2 passageiro2 = new PassageiroAula2("Carlos Souza", "333");

        passageiro2.adicionarSaldo(10);
        passageiro2.pagarViagem(20); // erro saldo insuficiente
    }
}
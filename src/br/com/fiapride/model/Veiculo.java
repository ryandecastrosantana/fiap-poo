package br.com.fiapride.main;

import br.com.fiapride.model.Veiculo;

public class Principal {

    public static void main(String[] args) {

        Veiculo v1 = new Veiculo("Carlos", "ABC-1234");

        v1.setCombustivel(10); // agora validado
        v1.abastecer(50);
        v1.consumir(30);

        System.out.println(
            "Dono: " + v1.getProprietario() +
            " | Placa: " + v1.getPlaca() +
            " | Combustível: " + v1.getCombustivel()
        );
    }
}
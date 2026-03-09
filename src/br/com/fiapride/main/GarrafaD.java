package br.com.fiapride.main;

import br.com.fiapride.model.Garrafa;

public class GarrafaD {
    public static void main(String[] args) {

        Garrafa minhaGarrafa = new Garrafa();
        minhaGarrafa.cor = "Azul";
        minhaGarrafa.material = "Plástico";
        minhaGarrafa.capacidadeEmMl = 500;

        Garrafa garrafaDoProfessor = new Garrafa();
        garrafaDoProfessor.cor = "Metálica";
        garrafaDoProfessor.material = "Alumínio";
        garrafaDoProfessor.capacidadeEmMl = 1000;

        System.out.println("Minha garrafa é: " + minhaGarrafa.cor);
        System.out.println("Minha garrafa é de: " + minhaGarrafa.material);
        System.out.println("Minha garrafa tem a capacidade de: " + minhaGarrafa.capacidadeEmMl + " ml");

        System.out.println("A do professor é: " + garrafaDoProfessor.cor);
        System.out.println("A do professor é de: " + garrafaDoProfessor.material);
        System.out.println("A garrafa do professor tem a capacidade de: " + garrafaDoProfessor.capacidadeEmMl + " ml");
    }
}
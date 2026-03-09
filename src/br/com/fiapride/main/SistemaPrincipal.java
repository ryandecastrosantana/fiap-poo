package br.com.fiapride.main;

// Importamos a classe Passageiro para que o sistema a reconheça
import br.com.fiapride.model.Garrafa; // < Trocar aqui "Passageiro" Ou "Garrafa"

public class SistemaPrincipal {

    public static void main(String[] args) {
        // INSTANCIAÇÃO ----------------------------- Exemplo Anterior -------------------------------------------
        // O comando 'new' aloca memória para um novo objeto.
        // Criando o primeiro passageiro (Objeto 1)
        ///Passageiro passageiro1 = new Passageiro();
    	///passageiro1.nome = "Ana Silva";
    	///passageiro1.saldo = 50.0;

        // Criando o segundo passageiro (Objeto 2)
    	///Passageiro passageiro2 = new Passageiro();
    	///passageiro2.nome = "Carlos Souza";
    	///passageiro2.saldo = 12.50;

        // Exibindo os dados no Console
    	///System.out.println("--- Sistema FiapRide ---");
    	///System.out.println("Passageiro: " + passageiro1.nome + " | Saldo: R$" + passageiro1.saldo);
    	///System.out.println("Passageiro: " + passageiro2.nome + " | Saldo: R$" + passageiro2.saldo);
        
        // Teste mental: Se eu mudar o nome do passageiro1, o passageiro2 muda?
    	// Dentro do main...// Fabriquei a primeira (Instância 1)
    	//---------------------------------------------------------------------------------------------------------
    	Garrafa minhaGarrafa = new Garrafa();
    	minhaGarrafa.cor = "Azul";
    	minhaGarrafa.material = "Plástico";
    	minhaGarrafa.capacidadeEmMl = 500;
    	// Fabriquei a segunda (Instância 2)
    	Garrafa garrafaDoProfessor = new Garrafa();
    	garrafaDoProfessor.cor = "Metálica";
    	garrafaDoProfessor.material = "Alumínio";
    	garrafaDoProfessor.capacidadeEmMl = 1000;
    	System.out.println("Minha garrafa é: " + minhaGarrafa.cor);
    	System.out.println("Minha garrafa é de: " + minhaGarrafa.material);
    	System.out.println("Minha garrafa tem a capacidade de: " + minhaGarrafa.capacidadeEmMl + "ml");
    	System.out.println("A do professor é: " + garrafaDoProfessor.cor);
    	System.out.println("A do professor é: " + garrafaDoProfessor.material);
     	System.out.println("A garrafa do professor tem a capassidade de: " + garrafaDoProfessor.capacidadeEmMl + "mL");
    }
}
package br.com.fiapride.model;

public class Veiculo {

    private String proprietario;
    private String placa;
    private double combustivel;

    // Construtor
    public Veiculo(String proprietario, String placa) {
        this.proprietario = proprietario;
        this.placa = placa;
        this.combustivel = 0;
    }

    // Método para abastecer
    public void abastecer(double litros) {
        if (litros > 0) {
            combustivel += litros;
        } else {
            System.out.println("Valor inválido para abastecimento!");
        }
    }

    // Método para gastar combustível
    public void consumir(double litros) {
        if (litros > 0 && combustivel >= litros) {
            combustivel -= litros;
        } else {
            System.out.println("Combustível insuficiente ou valor inválido!");
        }
    }

    // Getter
    public String getProprietario() {
        return proprietario;
    }

    public String getPlaca() {
        return placa;
    }

    public double getCombustivel() {
        return combustivel;
    }

    // Setter com validação
    public void setCombustivel(double combustivel) {
        if (combustivel >= 0) {
            this.combustivel = combustivel;
        } else {
            System.out.println("Combustível não pode ser negativo!");
        }
    }
}
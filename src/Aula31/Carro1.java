package Aula31;

public class Carro1 {


    String marca;
    String modelo;
    int numPassageiros;
    double capCombustivel;
    private double consumoCombustivel;

    public void exibirAutonomia(){

        System.out.println("A autonomia do carro é de: " + this.capCombustivel * this.consumoCombustivel + " km.");

    }

    public double obterAutonomia(){

        System.out.println("Método obterAutonomia foi chamado.");

        System.out.println();

        return this.capCombustivel * this.consumoCombustivel;

    }

    private double divideKmPorConsumoCombustivel(double km){
        return km/this.capCombustivel;
    }

    public double calcularCombustivel(double km) {

        double qtdCombustivel = km /this.consumoCombustivel;

        return qtdCombustivel;
    }

}

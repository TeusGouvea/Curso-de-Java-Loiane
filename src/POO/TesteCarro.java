package POO;
public class TesteCarro {

    public static void main(String[] args){

        Carro van = new Carro();
         van.marca = "Fiat";
         van.modelo = "Ducato";
         van.numPassageiros = 10;
         van.capCombustivel = 100;
         van.consumoCombustivel = 0.2;

         System.out.println("Essa van é da marca: " + van.marca);
         System.out.println("Esse é o modelo da van: " + van.modelo);
         System.out.println("Essa Van é para até: " + van.numPassageiros + " passageiros.");
         System.out.println("O tanque dessa van comporta até: " + van.capCombustivel + " Litros.");
         System.out.println("Essa van tem um consumo de combustivel de aproximadamente de: " + van.consumoCombustivel + " litro por km.");

        Carro fusca = new Carro();
        fusca.marca = "Volkswagen";
        fusca.modelo = "Fusca";
        fusca.numPassageiros = 5;
        fusca.capCombustivel = 30;
        fusca.consumoCombustivel = 0.15;

        System.out.println();
        System.out.println();


        System.out.println(fusca.marca);
        System.out.println(fusca.modelo);

    }

}

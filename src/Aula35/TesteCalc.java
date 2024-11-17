package Aula35;

public class TesteCalc {

    public static void main(String[] args){

        int fatorialNR = Calculadora.fatorialNaoRecursivo(5);
        System.out.println(fatorialNR);

        int fatoriaR = Calculadora.fatorial(5);
        System.out.println(fatoriaR);

    }
}

package Aula33;

public class TesteCalculadora {

    public static void main(String[] args){

        MinhaCalculadora calc = new MinhaCalculadora();

        int soma1 = calc.soma(1, 2);

        System.out.println(soma1);
        
        int soma2 = calc.soma(1, 2, 3);

        System.out.println(soma2);

    }

}

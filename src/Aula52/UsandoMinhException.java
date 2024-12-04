package Aula52;

public class UsandoMinhException {

    public static void main(String[] args) {

    }

    public void test(){

        int[] numeros = {4, 8, 5, 16, 32, 21, 64, 128};

        int[] demon = {2, 0, 4, 8, 0, 2, 4};

        for (int i = 0; i < numeros.length; i++) {
            try {
                if (numeros[i] % 2 != 0) {
                    throw new DivisaoNaoExata(numeros[i], demon[i]);
                }
                System.out.println(numeros[i] + "/" + demon[i] + " = " + (numeros[i] / demon[i]));

            } catch (ArithmeticException | ArrayIndexOutOfBoundsException | DivisaoNaoExata e) {
                System.out.println("Aconteceu um erro");
                e.printStackTrace();

            }

        }

    }

}
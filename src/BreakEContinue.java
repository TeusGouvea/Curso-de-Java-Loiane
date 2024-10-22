import java.util.Scanner;
public class BreakEContinue {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /*for(int i = 0; i <= 4; ++i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        System.out.println("rotulo3");
                    }

                    System.out.println("rotulo2");
                }

                System.out.println("rotulo1");
            }

            System.out.println(i);
        }*/

        System.out.println("Entre com um número:");
        int num = scan.nextInt();

        System.out.println("Entre com um limite:");
        int max = scan.nextInt();

        for(int i = num; i <= max; i++) {
            if(i % 7 == 0){
                continue;
            }
            System.out.println("O valor de i é: " + i);
        }

    }

}

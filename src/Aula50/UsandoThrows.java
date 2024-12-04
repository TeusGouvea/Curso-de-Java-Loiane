package Aula50;

import com.sun.xml.internal.stream.Entity;

import java.util.Scanner;

public class UsandoThrows {

    public static void main(String[] args){

        System.out.println("Entre com um número decimal:");
        try {
            double num = leNumero();
        } catch (Exception e) {
            System.out.println("Entrada inválida");
            e.printStackTrace();
        }

    }

    public static double leNumero() throws Exception{

        Scanner scan = new Scanner(System.in);
        double num = scan.nextDouble();
        return num;

    }

}
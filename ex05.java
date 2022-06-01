//calcular área de um quadrado

import java.util.Scanner;

public class ex05 {
    public static void main(String[] args) {
        System.out.println("Ola, usuario! Vamos calcular a area de um quadrado");

        //entrada de valor
        System.out.println("Insira o valor de um dos lados, em cm: ");

        //armazenamento do valor
        Scanner s1 = new Scanner(System.in);
        double l1 =  s1.nextDouble();

        //calculo
        double quad = l1*l1;

        //saída
        System.out.println("A area calculada eh de: " + quad);

    }
}
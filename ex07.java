//calcular area de um trapézio

import java.util.Scanner;
public class ex07 {
    public static void main(String[] args) {
        System.out.println("Ola, usuario! Vamos calcular a area de um trapezio.");

        //entrada de valor
        System.out.println("Insira o valor da base maior, em cm: ");

        //armazenamento do valor1
        Scanner s1 = new Scanner(System.in);
        double bM =  s1.nextDouble();

        //entrada de valor2
        System.out.println("Insira o valor da base menor, em cm: ");

        //armazenamento do valor2
        Scanner s2 = new Scanner(System.in);
        double bm =  s2.nextDouble();

        //entrada de valor3
        System.out.println("Insira o valor da altura, em cm: ");

        //armazenamento do valor3
        Scanner s3 = new Scanner(System.in);
        double h =  s3.nextDouble();
        
        //calculo
        double a = ((bM+bm)*h)/2;

        //saída
        System.out.println("A area calculada eh de: " + a);

    }
}

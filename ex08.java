//calcular area de um paralelogramo

import java.util.Scanner;
public class ex08 {
    public static void main(String[] args) {
        System.out.println("Ola, usuario! Vamos calcular a area de um paralelogramo.");

        //entrada de valor
        System.out.println("Insira o valor da base, em cm: ");

        //armazenamento do valor1
        Scanner s1 = new Scanner(System.in);
        double b =  s1.nextDouble();

        //entrada de valor2
        System.out.println("Insira o valor da altura, em cm: ");

        //armazenamento do valor2
        Scanner s2 = new Scanner(System.in);
        double h =  s2.nextDouble();
        
        //calculo
        double a = b*h;

        //saída
        System.out.println("A area calculada eh de: " + a);

    }
}

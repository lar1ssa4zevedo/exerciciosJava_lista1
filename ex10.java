//calcular a área de um circulo

import java.util.Scanner;
import java.math.*;

public class ex10 {
    public static void main(String[] args) {
        System.out.println("Ola, usuario! Vamos calcular a area de um circulo.");
        double pi =  3.14;

        //entrada de valor
        System.out.println("Insira o valor do raio, em cm: ");

        //armazenamento do valor1
        Scanner s1 = new Scanner(System.in);
        double r =  s1.nextDouble();
        
        //calculo
        double a = pi*Math.pow(r,2);

        //saída
        System.out.println("A area calculada eh de: " + a);

    }
}

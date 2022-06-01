//calcular area de um losango

import java.util.Scanner;
public class ex06 {
    public static void main(String[] args) {
        System.out.println("Ola, usuario! Vamos calcular a area de um losango.");

        //entrada de valor
        System.out.println("Insira o valor da diagonal maior, em cm: ");

        //armazenamento do valor1
        Scanner s1 = new Scanner(System.in);
        double dM =  s1.nextDouble();

        //entrada de valor2
        System.out.println("Insira o valor da diagonal menor, em cm: ");

        //armazenamento do valor2
        Scanner s2 = new Scanner(System.in);
        double dm =  s2.nextDouble();
        
        //calculo
        double a = (dM*dm)/2;

        //saída
        System.out.println("A area calculada eh de: " + a);

    }
}

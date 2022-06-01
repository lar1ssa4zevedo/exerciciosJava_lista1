//calcular área de um retângulo

import java.util.Scanner;

public class ex04 {
    public static void main(String[] args) {
        System.out.println("Ola, usuario! Vamos calcular a area de um retangulo");

        //entrada de valor
        System.out.println("Insira o valor da base, em cm: ");

        //armazenamento do valor1
        Scanner s1 = new Scanner(System.in);
        double base =  s1.nextDouble();

        //entrada de valor2
        System.out.println("Insira o valor da altura, em cm: ");

        //armazenamento do valor2
        Scanner s2 = new Scanner(System.in);
        double altura = s2.nextDouble();

        //calculo
        double ret = base*altura;

        //saída
        System.out.println("A area calculada eh de: " + ret);

    }
}

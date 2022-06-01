//Faça um para ler 2 valores informados pelo usuário e se o segundo valor informado for ZERO, deve ser lido um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero nem negativo e imprimir o resultado da divisão do primeiro valor lido pelo segundo valor lido. 

import java.util.Scanner;
public class ex14 {
    public static void main(String[] args) {
    
        System.out.println("Insira um numero: ");
        Scanner s1 = new Scanner(System.in);
        int n1 =  s1.nextInt();

        System.out.println("Insira outro numero: ");
        Scanner s2 = new Scanner(System.in);
        int n2 =  s2.nextInt();

        if (n2<=0){
            while (n2<=0){
                System.out.println("O segundo numero nao pode ser menor ou igual a zero.Insira outro numero: ");
                Scanner s3 = new Scanner(System.in);
                int n3 =  s2.nextInt();

                if (n3>0){
                    System.out.println("Resultado da divisao entre os dois numeros: " + (n1/n3));
                }
            }
        } else {
            System.out.println("Resultado da divisao entre os dois numeros: " + (n1/n2));
        }

    }
}

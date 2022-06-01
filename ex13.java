//Faça um programa que leia  3 valores (considere que não serão informados valores iguais) e escrever a soma dos 2 maiores. 

import java.util.Scanner;
public class ex13 {
    public static void main(String[] args) {
    
        System.out.println("Insira um numero: ");
        Scanner s1 = new Scanner(System.in);
        int n1 =  s1.nextInt();

        System.out.println("Insira outro numero: ");
        Scanner s2 = new Scanner(System.in);
        int n2 =  s2.nextInt();

        System.out.println("Insira mais um numero: ");
        Scanner s3 = new Scanner(System.in);
        int n3 =  s3.nextInt();

        if (n1<n2 && n1<n3){
            System.out.println("A soma entre os dois maiores eh: " + (n2+n3));
        }
        else if (n2<n1 && n2<n3){
            System.out.println("A soma entre os dois maiores eh: " + (n1+n3));
        }
        else if (n3<n1 && n3<n2){
            System.out.println("A soma entre os dois maiores eh: " + (n1+n2));
        }

    }
}
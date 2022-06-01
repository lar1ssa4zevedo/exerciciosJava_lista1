//Faça um programa que leia um valor informado pelo usuário e diga se o valor informado é positivo, negativo ou zero.

import java.util.Scanner;
public class ex11 {
    public static void main(String[] args) {
    
        
        System.out.println("Insira um numero: ");

        Scanner s1 = new Scanner(System.in);
        double n =  s1.nextDouble();
        
        if (n>0){
            System.out.println("O numero informado eh positivo");
        } else if (n<0){
            System.out.println("O numero informado eh negativo");
        } else if (n==0){
            System.out.println("O numero informado eh nulo");
        }
    }
}

//Escreva um programa em Java em que o usuário informe o seu nome e exiba a mensagem "Olá, [NomeDoUsuario]".

import java.util.Scanner;

public class ex02 {
    
    public static void main(String[] args) {

        System.out.println("Informe seu nome: ");
        Scanner in = new Scanner(System.in);

        String nome = in.nextLine();

        System.out.println("Ola, " + nome + "!");

    }
}
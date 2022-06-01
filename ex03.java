//Escreva um programa em Java em que o usuário informe o seu nome e em seguida o programa perguntará a idade do usuário. Agora o programa deve exibir a mensagem "Olá, [NomeDoUsuario], sua idade é [idade]".

import java.util.Scanner;

public class ex03 {
    
    public static void main(String[] args) {

        System.out.println("Informe seu nome: ");
        Scanner in = new Scanner(System.in);

        String nome = in.nextLine();

        System.out.println("Informe sua idade: ");
        Scanner on = new Scanner(System.in);

        String idade = on.nextLine();

        System.out.println("Ola, " + nome + "! Sua idade eh " + idade + " anos.");

    }
}

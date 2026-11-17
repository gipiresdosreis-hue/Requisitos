
package org.example;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Perfil do Usuário");

        System.out.println("Informe seu nome: ");
        String nome = entrada.nextLine();

        System.out.println("Informe sua idade:");
        int idade = entrada.nextInt();

        entrada.nextLine();

        System.out.println("Perfil cadastrado!");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);

        System.out.println("Deseja realizar o logout?");
        String resposta = entrada.nextLine();

        if (resposta.equalsIgnoreCase("Sim")) {
            System.out.println("Realizando logout...");
        } else {
            System.out.println("Logout não realizado");
        }

        entrada.close();
    }
}








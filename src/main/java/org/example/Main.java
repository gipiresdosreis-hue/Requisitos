
package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int opcao = 0;
        int notificacoes = 3;

        do {
            System.out.println(" BARRA SUPERIOR");
            System.out.println("Sino (" + notificacoes + " notificações)");
            System.out.println("1 - Acessar notificações");
            System.out.println("2 - Sair");
            System.out.println("Escolha uma opção: ");

            opcao = entrada.nextInt();

            if (opcao == 1) {

                System.out.println("CENTRAL DE NOTIFICAÇÕES ");

                System.out.println("1 - Novo cadastro realizado");
                System.out.println("2 - Atualização disponível no sistema");
                System.out.println("3 - Alerta de segurança");

                System.out.println("Notificações visualizadas!");

                notificacoes = 0;

            } else if (opcao == 2) {

                System.out.println("Saindo do sistema...");

            } else {

                System.out.println("Opção inválida!");

            }

        } while (opcao != 2);

        entrada.close();
    }
}







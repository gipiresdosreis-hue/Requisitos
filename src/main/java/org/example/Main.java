
package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Menu Lateral ===");

        int opcao = 0;

        do {
            System.out.println("1- Painel Geral");
            System.out.println("2- Perfil e Cadastro");
            System.out.println("3- Configurações");
            System.out.println("Selecione uma das opções: ");

            opcao = entrada.nextInt();

            if (opcao == 1) {
                System.out.println("Painel Geral selecionado");

            } else if (opcao == 2) {
                System.out.println("Perfil e Cadastro selecionado");

            } else if (opcao == 3) {
                System.out.println("Configurações selecionadas");

            } else {
                System.out.println("Opção inválida!");
            }

        } while (opcao != 3);

        entrada.close();
    }
}







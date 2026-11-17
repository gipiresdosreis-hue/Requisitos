
package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("=== Cabeçalho ===");
        System.out.println("A instituição que deseja colocar no cabeçalho é SENAI?");
        String resposta;
        resposta = entrada.nextLine();
        if (resposta.equalsIgnoreCase("Sim")){
            System.out.println("Processando cabeçalho...");
            System.out.println("Sistema de monitoramento integrado SENAI");
        } else{
            System.out.println("Apenas a instituição SENAI é permitido ");
        }

    }
}







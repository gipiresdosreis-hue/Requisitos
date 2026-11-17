package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Informe quantas peças cor vermelha o sistema possui: ");
        int vermelho =0;
        vermelho = entrada.nextInt();
        System.out.println("Informe quantas peças cor azul o sistema possui: ");
        int azul =0;
        azul = entrada.nextInt();
        System.out.println("Informe quantas peças cor verde o sistema possui: ");
        int verde =0;
        verde = entrada.nextInt();
        System.out.println("Criando relatório...");
        int total =0;
        total = verde + vermelho + azul;
        System.out.println("Peças vermelhas: " + vermelho);
        System.out.println("Peças verdes: " + verde);
        System.out.println("Peças azuis: " + azul);
        System.out.println("Total de peças: " + total);


        }

            }






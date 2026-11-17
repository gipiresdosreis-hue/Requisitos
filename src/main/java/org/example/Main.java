package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println(" Informe a primeira ação executada pelo robô:   ");
        String acao1;
        acao1 = entrada.nextLine();
        System.out.println("Informe a segunda ação: ");
        String segundaAcao;
        segundaAcao = entrada.nextLine();
        System.out.println("Informe a terceira ação: ");
        String terceiraAcao;
        terceiraAcao = entrada.nextLine();
        System.out.println("Listando eventos no painel LOGS DO ROBÔ...");
        System.out.println("Evento 01: " + acao1);
        System.out.println("Evento 02: " + segundaAcao);
        System.out.println("Evento 03: " + terceiraAcao);


        }

        }




package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Informe qual etapa o robô está: ");
            String etapa = entrada.nextLine();
        System.out.println("Informe a porcentagem que o robô conclusão do processo:  ");
            int porcentagem =0;
            porcentagem = entrada.nextInt();
        System.out.println("Informe a quantidade em horas para a finalização do processo:");
            int horas = 0;
            horas = entrada.nextInt();
        System.out.println("Gerando status do robô...");
        System.out.println("Etapa: " + etapa);
        System.out.println("Processo " + porcentagem + " % concluido");
        System.out.println("Tempo restante: " + horas + " horas");

        }

    }


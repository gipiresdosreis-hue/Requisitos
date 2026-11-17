package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Informe se o robô está funcionando corretamente: ");
        String resposta;
        resposta = entrada.nextLine();
        if (resposta.equalsIgnoreCase("Sim")){
            System.out.println("Qual a porcentagem de funcionamento do robô?");
            int porcentagem =0;
            porcentagem = entrada.nextInt();
            System.out.println("Robô está com um funciomanento de " + porcentagem + "% ");
        }else{
            System.out.println("Qual a porcentagem de funcionamento do robô?");
            int porcentagem2 =0;
            porcentagem2 = entrada.nextInt();
            System.out.println("Robô está com um funciomanento de " + porcentagem2 + "% ");

        }

            }

        }




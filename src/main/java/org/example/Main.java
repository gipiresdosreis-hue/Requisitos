package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.println("O sistema está funcionamento corretamente? (S/N)");
        String resposta1 = entrada.nextLine();
        if (resposta1.equalsIgnoreCase("N")){
            System.out.println("Deseja pressionar o botão de emergência? (S/N) ");
            String resposta2 = entrada.nextLine();
            if (resposta2.equalsIgnoreCase("S")){
                    System.out.println("Botão de emergência foi pressionado!");
                } else {
                    System.out.println("Botão de emergência não foi pressionado. ");
                }
        } else {
            System.out.println("O sistema está funcionando corretamente!");
        }

        }
    }


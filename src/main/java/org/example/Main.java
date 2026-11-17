package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("A câmera está funcionando corretamente?  ");
        String resposta;
        resposta = entrada.nextLine();
        if (resposta.equalsIgnoreCase("Sim")){
            System.out.println("Câmera está funcionando corretamente e está em processo.");
        } else {
            System.out.println("Câmera não está em processamento ");
        }



        }

        }




package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Informe se o estado da conexão do sistema com a célula robótica está habilitado: (S/N) ");
            String resposta = entrada.nextLine();

            if (resposta.equalsIgnoreCase("S")){
                System.out.println("O status de comunicação do sistema com o robô está ONLINE" );

            } else {
                System.out.println("O status de comunicação do sistema com o robô está OFFLINE" );
            }


        }

    }


package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Informe o local que o robô está localizado: ");
            String local = entrada.nextLine();
        System.out.println("Informe o número do local que o robô está localizado : (ex: Rampa 1 )  ");
            int numero =0;
            numero = entrada.nextInt();
            entrada.nextLine();
        System.out.println("Informe se o robô está disponível ou em andamento:");
            String status;
            status = entrada.nextLine();
        System.out.println("Gerando status do programa...");
            if (status.equalsIgnoreCase("andamento")){
                System.out.println("Robô está ativo no momento ! " );
                System.out.println("No local: " + local);
                System.out.println("No número: " + numero);
            } else {
                System.out.println("Robô está disponível! ");
                System.out.println("Encontra-se no local: " + local);
                System.out.println("No número: " + numero);
            }


        }

    }


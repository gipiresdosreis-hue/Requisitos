package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Informe o tempo de ciclo total em minutos por peça:  ");
        int minutos = 0;
        minutos = entrada.nextInt();
        int tempoSegundos =0;
        tempoSegundos = minutos * 60;
        System.out.println("O tempo de ciclo em segundos por peça é de : " +  tempoSegundos  + " segundos ");

        }

    }


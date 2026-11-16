package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Informe a taxa de acerto do processo da cor AZUL:  ");
        int azul1 =0;
        azul1 = entrada.nextInt();

        System.out.println("Informe a taxa de acerto do processo da cor VERDE:  ");
        int verde2 =0;
        verde2 = entrada.nextInt();

        System.out.println("Informe a taxa de acerto do processo da cor VERMELHO:  ");
        int vermelho3 =0;
        vermelho3 = entrada.nextInt();

        System.out.println("TAXA DE ACERTOS");
        System.out.println("Azul = " + azul1 + " % ");
        System.out.println("Verde = " + verde2 + " % ");
        System.out.println("Vermelho = " + vermelho3 + " % ");

        if (azul1 > verde2 && azul1 > vermelho3) {
            System.out.println("A maior taxa do processo foi a cor AZUL:  " + azul1 + "%");

        } else if (verde2 > azul1 && verde2 > vermelho3) {
            System.out.println("A maior taxa do processo foi a cor VERDE : " + verde2 + "%");

        } else if (vermelho3 > azul1 && vermelho3 > verde2) {
            System.out.println("A maior taxa do processo foi a cor VERMELHO:  " + vermelho3 + "%");

        } else {
            System.out.println("Existem números iguais!");
        }

        }

    }


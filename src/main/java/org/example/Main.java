
package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o horário ( inteiro ) que deseja cadastrar: ");
        int horas =0;
        horas = entrada.nextInt();
        System.out.println("Horário " + horas + " horas cadastrado!");

    }
}







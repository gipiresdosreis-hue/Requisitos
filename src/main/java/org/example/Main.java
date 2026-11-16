package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);

        System.out.println("Informe a quantidade de peças processadas no período da manhã:   ");
            int pecasManha =0;
            pecasManha = entrada.nextInt();

        System.out.println("Informe a quantidade de peças processadas no período da tarde :   ");
            int pecasTarde =0;
            pecasTarde = entrada.nextInt();

        System.out.println("Informe a quantidade de peças processadas no período da noite:   ");
            int pecasNoite =0;
            pecasNoite = entrada.nextInt();

            int total =0;
            total = pecasNoite + pecasManha + pecasTarde;

        System.out.println("O total de peças processadas no dia foi de : " +  total );



        }

    }


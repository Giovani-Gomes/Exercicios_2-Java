package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1;
         Scanner scan = new Scanner(System.in);
        System.out.print("Informe o Primeiro número: ");
        num1= scan.nextInt();

        if (num1 < 0){
            System.out.println("Número Negativo");
        }
        else {
            System.out.println("Número Positivo");
        }

    }
}
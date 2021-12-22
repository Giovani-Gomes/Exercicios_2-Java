package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1,num2;

        System.out.print("Informe o Primeiro número: ");
        Scanner NUM1 = new Scanner(System.in);
        num1= NUM1.nextInt();

        if (num1 < 0){
            System.out.println("Número Negativo");
        }
        else {
            System.out.println("Número Positivo");
        }

    }
}
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1,num2;

        System.out.print("Informe o Primeiro número: ");
        Scanner NUM1 = new Scanner(System.in);
        num1= NUM1.nextInt();

        System.out.print("Informe o Segundo número: ");
        Scanner NUM2 = new Scanner(System.in);
        num2= NUM2.nextInt();

        if (num1 > num2 ){
            System.out.println(num1 + " é maior que " + num2);
        }
        else if (num1 == num2){
            System.out.println("Números iguais");
        }
        else {
            System.out.println(num2 + " é maior que " + num1);
        }
    }
}

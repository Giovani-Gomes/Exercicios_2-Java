package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int num1,num2,num3;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite Primeiro do Número: ");
        num1= scan.nextInt();

        System.out.print("Digite Segundo do Número: ");
        num2= scan.nextInt();

        System.out.print("Digite Terceiro do Número: ");
        num3= scan.nextInt();


        if (num1 <= num2 && num1 <= num3 && num2 <= num3){

            System.out.println(num3 + " - " + num2 + " - " + num1);

        } else if (num1 <= num2 && num1 <= num3 && num3 <= num2){

            System.out.println(num2 + " - " + num3 + " - " + num1);

        } else if (num2 <= num1 && num2 <= num3 && num1 <= num3){

            System.out.println(num3 + " - " + num1 + " - " + num2);

        } else if (num2 <= num1 && num2 <= num3 && num3 <= num1){

            System.out.println(num1 + " - " + num3 + " - " + num2);

        } else if (num3 <= num1 && num3 <= num2 && num1 <= num2){

            System.out.println(num2 + " - " + num1 + " - " + num3);

        } else if (num3 <= num1 && num3 <= num2 && num2 <= num1){

            System.out.println(num1 + " - " + num2 + " - " + num3);

        }

    }
}

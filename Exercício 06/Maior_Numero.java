package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int Num1,Num2,Num3;

        Scanner scan = new Scanner(System.in);
        System.out.print("Digite Primeiro do Número: ");
        Num1= scan.nextInt();

        System.out.print("Digite Segundo do Número: ");
        Num2= scan.nextInt();

        System.out.print("Digite Terceiro do Número: ");
        Num3= scan.nextInt();

        if (Num1 > Num2 && Num1 > Num3){
            System.out.println("O Núemro maior é " + Num1 );
        }
        else if (Num2 > Num1 && Num2 > Num3){
            System.out.println("O Núemro maior é " + Num2 );
        }
        else if (Num3 > Num2 && Num3 > Num1) {
            System.out.println("O Núemro maior é " + Num3);
        }
        else {
            System.out.println("Números são iguais ");
        }


    }
}

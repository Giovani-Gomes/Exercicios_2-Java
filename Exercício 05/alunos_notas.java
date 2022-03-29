package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Double nota1,nota2, media;

        System.out.print("Digite a Primeira nota: ");
        Scanner scan = new Scanner(System.in);
        nota1 = scan.nextDouble();
        System.out.print("Digite a Segunda nota: ");
        Scanner scan2 = new Scanner(System.in);
        nota2 = scan.nextDouble();

        media = (nota1 + nota2) / 2;
        if (media == 10){
            System.out.println("Aprovado com Distinção - Nota " + media);
        } else if (media >= 7){
            System.out.println("Aprovado - Nota " + media);
        }else if (media < 7){
            System.out.println("Reprovado - Nota " + media);
        } else {
            System.out.println("Erro!");
        }

        }
    }

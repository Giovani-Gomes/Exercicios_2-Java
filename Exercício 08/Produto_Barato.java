package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com primeiro preço: ");
        double preco1 = scan.nextDouble();

        System.out.print("Entre com segundo preço: ");
        double preco2 = scan.nextDouble();

        System.out.print("Entre com terceiro preço: ");
        double preco3 = scan.nextDouble();

        if (preco1 <= preco2 && preco1 <= preco3){
            System.out.println("Compre o produto 1 - " + preco1);
        } else if (preco2 <= preco1 && preco2 <= preco3){
            System.out.println("Compre o produto 2 - " + preco2);
        } else if (preco3 <= preco1 && preco3 <= preco2){
            System.out.println("Compre o produto 3 - "+ preco3);
        }

    }
}

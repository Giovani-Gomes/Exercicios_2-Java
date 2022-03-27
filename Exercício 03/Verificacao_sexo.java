package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String sexo;
        System.out.print("Digite o seu Sexo: \n M- Masculino \n F- Feminino \n Reposta- ");

        Scanner scanner = new Scanner(System.in);

        sexo = scanner.next();

        switch (sexo){
            case "M": System.out.println("Você é homem.");break;
            case "m": System.out.println("Você é homem.");break;
            case "F":  System.out.println("Você é Mulher.");break;
            case "f":  System.out.println("Você é Mulher.");break;
            default:System.out.println("Valor inváildo.");break;
        }
    }
}

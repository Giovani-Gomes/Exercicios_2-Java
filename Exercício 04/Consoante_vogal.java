package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String letra;
        System.out.print("Digite uma Letra: ");
        Scanner scanner = new Scanner(System.in);
        letra = scanner.next();

        switch (letra){
            case "a": System.out.println("Vogal");break;
            case "A": System.out.println("Vogal");break;
            case "E": System.out.println("Vogal");break;
            case "e": System.out.println("Vogal");break;
            case "i": System.out.println("Vogal");break;
            case "I": System.out.println("Vogal");break;
            case "o": System.out.println("Vogal");break;
            case "O": System.out.println("Vogal");break;
            case "u": System.out.println("Vogal");break;
            case "U": System.out.println("Vogal");break;
            default:
                System.out.println("Consoante");

        }
    }
}

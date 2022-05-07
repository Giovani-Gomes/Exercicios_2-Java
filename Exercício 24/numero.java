    package com.company;

    import java.util.Scanner;

    public class Main {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.print("Digite o primeiro número: ");
            int num1 = scan.nextInt();
            System.out.print("Digite o Segundo número: ");
            int num2= scan.nextInt();
            System.out.print("Qual operação \n1-Soma"+ "\n2-Multiplicação"+"\n3-Subtração"+ "\n4-Divisão");
           int operacao = scan.nextInt();
           int resultado;
           double resto;

            switch (operacao) {
                case 1:
                    resultado = num1 + num2;
                     resto =  num1 % num2;
                    if (resultado % 2 == 0) {
                        System.out.println("É PAR");
                    } else {
                        System.out.println("É IMPAR");
                    }

                    if(resultado > 0){
                        System.out.println("É Positivo");
                    }
                    else{
                        System.out.println("É Negativo");
                    }

                    if( resto != 0){
                        System.out.println("É Decimal");
                    }
                    else {
                        System.out.println("É Inteiro");
                    }
                    break;
                case 2:
                    resultado = num1 * num2;
                     resto =  num1 % num2;
                    if (resultado % 2 == 0) {
                        System.out.println("É PAR");
                    } else {
                        System.out.println("É IMPAR");
                    }

                    if(resultado > 0){
                        System.out.println("É Positivo");
                    }
                    else{
                        System.out.println("É Negativo");
                    }

                    if( resto != 0){
                        System.out.println("É Decimal");
                    }
                    else {
                        System.out.println("É Inteiro");
                    }
                    break;
                case 3:
                    resultado = num1 - num2;
                    resto =  num1 % num2;
                    if (resultado % 2 == 0) {
                        System.out.println("É PAR");
                    } else {
                        System.out.println("É IMPAR");
                    }

                    if(resultado > 0){
                        System.out.println("É Positivo");
                    }
                    else{
                        System.out.println("É Negativo");
                    }

                    if( resto != 0){
                        System.out.println("É Decimal");
                    }
                    else {
                        System.out.println("É Inteiro");
                    }
                    break;
                case 4 :
                    resultado = num1 / num2;
                     resto =  num1 % num2;
                    if (resultado % 2 == 0) {
                        System.out.println("É PAR");
                    } else {
                        System.out.println("É IMPAR");
                    }

                    if(resultado > 0){
                        System.out.println("É Positivo");
                    }
                    else{
                        System.out.println("É Negativo");
                    }

                    if( resto != 0){
                        System.out.println("É Decimal");
                    }
                    else {
                        System.out.println("É Inteiro");
                    }
                    break;
                default:
                    System.out.println("Operação inválida");
                    break;

            }
        }
    }
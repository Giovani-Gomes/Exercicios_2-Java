import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int num1,num2;
        Scanner scan = new Scanner(System.in);
        System.out.print("Informe o Primeiro número: ");
        num1= scan.nextInt();

        System.out.print("Informe o Segundo número: ");
        num2= scan.nextInt();

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

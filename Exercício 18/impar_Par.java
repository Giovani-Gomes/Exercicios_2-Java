 Scanner scan = new Scanner(System.in);
        
        System.out.println("Entre com um número");
        int num = scan.nextInt();
        
        if (num % 2 == 0){
            System.out.println("par");
        } else {
            System.out.println("ímpar");
        }
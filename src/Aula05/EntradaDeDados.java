
package Aula05;

import java.util.Scanner;

public class EntradaDeDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            System.out.println(x);
            System.out.println("Você digito um numero"+x);
        
        sc.close();
    }
}

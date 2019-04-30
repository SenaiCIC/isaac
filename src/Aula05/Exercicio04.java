
package Aula05;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Digite 1º palavra:");
        String palavra = x.nextLine();
        System.out.println("Digite 2° palavra:");
        String palavra2 = x.nextLine();
        System.out.println("Digite 3° palavra");
        String palavra3 = x.nextLine();
        System.out.println(palavra+palavra2+palavra3);
    }
    
}

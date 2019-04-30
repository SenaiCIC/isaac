
package Aula06;

import java.util.Scanner;


public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite um numero inteiro: ");
            int num = sc.nextInt();
            int res = num%2;
    if(res == 0){
        System.out.println("O numer é par");
    }else{
        System.out.println("o numero é impar:");
    }
    }
    
}

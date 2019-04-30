
package Aula06;

import java.util.Scanner;


public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Digite seu nome: ");
            String nome = sc.nextLine();
            System.out.println("Digite sua idade: ");
            int idade = sc.nextInt();
            System.out.println("Digite seu peso: ");
            int peso = sc.nextInt();
            System.out.println("Digite sua altura: ");
            double altura = sc.nextDouble();
            double imc = peso/(altura*altura);
            System.out.printf("seu nome é: %s, idade:%d e seu imc é: %.2f%n",nome,idade,imc);
            
        sc.close();
    }
    
}

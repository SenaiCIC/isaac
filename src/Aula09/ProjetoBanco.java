      /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula09;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class ProjetoBanco {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Deposite um valor: ");
        double saldo = sc.nextDouble();
        double n1;
        int escolha = 0;
        while(escolha != 4){
        System.out.println("-------------------");
        System.out.println("O que deseja?");
        System.out.println("1- Novo deposito");
        System.out.println("2- Saque");
        System.out.println("3- Saldo");
        System.out.println("4- Sair");
        escolha = sc.nextInt();
        boolean e;
        switch(escolha){
            case 1:
                System.out.println("Quanto deseja depositar? "+nome);
                saldo = saldo + (n1 = sc.nextDouble());
                System.out.println(nome+" O saldo atual é: "+saldo);
                break;
            case 2:
                System.out.println("Qunato deseja sacar? "+nome);
                n1 = sc.nextDouble();
                if (saldo<n1) {
                    System.out.println("Alerta saque menor que o saldo!");
                    System.out.println(nome+" O saldo atual é: "+saldo);
                    System.out.println("Deseja fazer um deposito antes? "+nome);
                    System.out.println("(true ou false)");
                    e = sc.nextBoolean();
                    if (true) {
                        System.out.println("Quanto deseja depositar? "+nome);
                        saldo = saldo + (n1 = sc.nextDouble());
                    }
                }else{
                    saldo = saldo - n1;
                }
                    System.out.println(nome+" O saldo atual é: "+saldo);
                    break;
                case 3:
                    System.out.println(nome+" Seu saldo é: "+saldo);
                    break;
                case 4:
                    System.out.println("Você saiu!");
                    break;
                default:
                    System.out.println("Opção Invalida!");
            }
        sc.close();
        }
    }
}


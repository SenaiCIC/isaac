/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula05;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Exercicio03 {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Digite 1º palavra:");
        String palavra = x.next();
        System.out.println("Digite 2° palavra:");
        String palavra2 = x.next();
        System.out.println("Digite 3° palavra");
        String palavra3 = x.next();
        System.out.println(palavra+" "+palavra2+" "+palavra3);
        System.out.println("1° palavrar:"+ palavra);
        System.out.println("2° palavra: "+ palavra2);
        System.out.println("3° palavra: "+ palavra3);
    }    
}

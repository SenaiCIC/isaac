
package Aula03;

public class variaveisprimitivas {
    public static void main(String[] args) {
        String nome = "Isaac";
        int idade = 16;
        boolean escolha = true ;                        // T F
        char sexo = 'm';                               // Caracter
        char letra = '\u0042';                        // Codigo Unicode
        byte n1 = 126;                               // Numero
        int n2 = 1000;                              // Inteiro
        long n4 = 2578945612301234567L;            // Inteiros Maiores
        float n5 = 25.80f;                         // Decimais
        double n6 = 25.51;                       // Decimais Maiores
        System.out.println(escolha);
        System.out.println(sexo);
        System.out.println(letra);
        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);
        System.out.println("==========");
        System.out.printf("%.2f",n5);
        System.out.printf("%.5f",n6);
        System.out.println("Isaac");
        System.out.printf("%s tem %d anos",nome,idade);
    }
}

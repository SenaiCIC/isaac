package Aula04;

public class OperaçãoDeComparção {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        int c = 5;
        boolean result;
        result = a>b;
        System.out.println(result);
        result = a<b;
        System.out.println(result);
        result = a>=b;
        System.out.println(result);
        result = b>=c;
        System.out.println(result);
        result = b==c;
        System.out.println(result);
        result = a!=b;
        System.out.println(result);
        result = b!=a;
        System.out.println(result);
    } 
}
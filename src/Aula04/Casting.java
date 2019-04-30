
package Aula04;


public class Casting {
    public static void main(String[] args) {
        //Exemplo 1
        double a;
       float b;
       
       a = 5.0;
       b = (float)a;
       
        System.out.println(b);
        
        //Exemplo 2
        double c;
        int d;
        
        c = 5.3;
        d = (int)c;
        
        //Exemplo 3
        int e, f;
        double result;
        
        e = 5;
        f = 2;
        
        result = (double) e / f;
        
        System.out.println(result);
    }
}


package Aula06;



public class ExercicioDeFixacao {
    public static void main(String[] args) {
        String produto1 = "computador";
        String produto2 = "mesa";
        int idade = 16;
        int codigo = 3200;
        char sexo = 'M';
        double preco1 = 2100.0;
        double preco2 = 650.50;
        double medida = 53.234567;
        System.out.println("Produtos:");
        System.out.printf("Computador com preço de: R$ %.2f%n",preco1);
        System.out.printf("Mesa com preço de: R$ %.3f%n",preco2);
        System.out.printf("Idade: %d, codigo %d e sexo: %c%n", idade,codigo,sexo);
        System.out.printf("medida com 8 casas decimais: %.8f%n",medida);
        System.out.printf("medida com 3 casas decimais: %.3f%n",medida);
        
    }
        
    
}

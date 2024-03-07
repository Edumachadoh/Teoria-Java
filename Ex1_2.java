/*  Crie um algoritmo que permita fazer três conversões monetárias. O algoritmo deve receber o valor em real(R$) e apresentar os valores convertidos em:
1. Dólar (1 dólar = 5,17 reais)
2. Euro (1 euro = 6,14 reais)
3. Peso argentino (1 peso argentino = 0,05 reais)*/
import java.util.Scanner;
public class Ex1_2 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite um valor: R$");
        float numero = leitor.nextFloat();

        System.out.println("Dolar: USD$" + numero / 5.17);
        System.out.println("Euro: EU$" + numero / 6.14);
        System.out.println("Peso argentino: $" + numero / 0.05);


    }
}

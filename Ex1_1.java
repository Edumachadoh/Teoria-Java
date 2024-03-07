// Escrever um algoritmo que receba a altura e a largura de um retângulo e calcule a sua área.
import java.util.Scanner;
public class Ex1_1 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        
        System.out.println("Altura: ");
        float altura = leitor.nextFloat();

        System.out.println("Largura: ");
        float largura = leitor.nextFloat();

        float area = altura * largura;

        System.out.printf("Area: %.2f", area);
    }
}


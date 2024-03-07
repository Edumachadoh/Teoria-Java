// Receber dois números inteiros e informar qual valor lido é o menor e qual é o maior.
import java.util.Scanner;
public class Ex1_3 {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);        
        
        System.out.println("Digite um numero inteiro: ");
        int num1 = leitor.nextInt();
        
        System.out.println("Digite outro numero inteiro: ");
        int num2 = leitor.nextInt();

        if (num2 > num1) {
            System.out.printf("%d maior que %d", num2,num1);
        }

        else if (num1 > num2) {
            System.out.printf("%d maior que %d", num1,num2);
        } else if (num1 == num2) {
            System.out.printf("Numeros iguais");
        }
    }
}

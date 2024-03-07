/*Desenvolver um algoritmo para ler o valor inteiro da idade de uma pessoa e imprimir uma das mensagens:se idade <= 13: Criança, se idade > 13 e <= 18: Adolescente, se idade > 18 e <= 60: Adulto e se idade > 60:Idoso */
import java.util.Scanner;
public class Ex1_4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite sua idade");
        int idade = leitor.nextInt();

        if (idade <= 13) {
            System.out.printf("Criança");
        }

        else if (idade > 13 && idade <= 18) {
            System.out.printf("Adolescente");
        }

        else if (idade > 18 && idade <= 60) {
            System.out.printf("Adulto");
        } 
        else if (idade > 60) {
            System.out.printf("Idoso");
        } 
    }
}

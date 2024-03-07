import java.util.Scanner;
public class Console {
    public static void main(String[] args) {
        
        
        //aula 2
        Scanner leitor = new Scanner(System.in);
        int[] vetor1; // declaracao 
        int[] vetor2 = new int[3]; // declaracao e inicializacao
        int[] vetor3 = new int[] {1, 5, 2};   // declaracao, inicializacao e atribuicao

        vetor1 = new int[2];
        vetor1[0] = 45;
        vetor1[1] = 51;

        

        int contador = 0;
        do {
            
            System.out.println("Digite um valor: ");
            int vlr = leitor.nextInt();
            vetor2[contador] = vlr;
            contador ++;
        } while(contador < 3);

        int vlrVetor2 = vetor2[1];
        int vlrVetor3 = vetor3[2];

        System.out.printf("Valor vetor 2: %d\n", vlrVetor2);
        System.out.printf("Valor vetor 3: %d", vlrVetor3);
        
        // for (int i = 0; i < vetor1.length; i ++) {
        //     String str = "Valor na pos " + (i + 1) + ":" + (vetor1[i]);
        // }

        // for (int vlr : vetor1) {
        //     String str1 = "Valor:" + vlr; // for avançado
        // }

    }
}

/*  aula 1
        // Scanner leitor = new Scanner(System.in);

        // // leitura de texto digitado
        // System.out.println("Digite um texto: ");
        // String texto = leitor.nextLine();
        // System.out.println("Texto digitado: "+ texto);

        // // leitura de um inteiro digitado
        // System.out.println("Digite um numero inteiro");
        // int numero = leitor.nextInt();
        // System.out.println("Numero inteiro digitado: " + numero); */
import java.util.Scanner;
public class exFixacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int[] matricula = new int[5];
        String[] nome = new String[5];
        String[] status = new String[5];
        float[] nota1 = new float[5];
        float[] nota2 = new float[5];
        float[] notaFinal = new float[5];

        for (int i = 0; i < 5; i ++) {

            System.out.printf("Nome: ");
            nome[i] = leitor.next();

            System.out.printf("Matricula: ");
            matricula[i] = leitor.nextInt();

            System.out.printf("Nota 1: ");
            nota1[i] = leitor.nextFloat();

            System.out.printf("Nota 2: ");
            nota2[i] = leitor.nextFloat();

            notaFinal[i] = (nota1[i] + nota2[i]) / 2;
            if (notaFinal[i] >= 6 ) {
                status[i] = "Aprovado";
            } else if (notaFinal[i] < 6 ) {
                status[i] = "Reprovado";
            }
        }
        System.out.printf("-------------------");
        for (int i = 0; i < 5; i ++) {
            System.out.printf("Aluno %d", i + 1);

            System.out.printf("Nome: %s", nome[i]);
            

            System.out.printf("Matricula: %d", matricula[i]);
            

            System.out.printf("Nota Final: %.1f", notaFinal[i]);
            
            System.out.printf("Aprovado: %sf", status[i]);
           

           


        }

    }
}

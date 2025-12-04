import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantas notas deseja cadastrar: ");
        int notasCadastradas = sc.nextInt();

        Boletim boletim = new Boletim(notasCadastradas);

        for (int i = 0; i < notasCadastradas; i++) {
            System.out.print("Digite a nota " + (i + 1 ) + ": ");
            double valor = sc.nextDouble();
            boletim.addNota(i, valor);
        }

        double media = boletim.media();
        double maiorNota = boletim.maiorNota();

        System.out.println();
        System.out.println("Média: " + media);
        System.out.println("MaiorNota: " + maiorNota);

        sc.close();
    }
}

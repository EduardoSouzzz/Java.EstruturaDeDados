import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Nome do aluno: ");
        String nome = sc.nextLine();

        System.out.print("Quantidade de notas: ");
        int qtd = sc.nextInt();

        Aluno aluno = new Aluno(nome, qtd);

        for (int i = 0; i < qtd; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            double valor = sc.nextDouble();
            aluno.adicionarNota(i, valor);
        }

        double media = aluno.calcularMedia();
        String situacao = aluno.situacao();

        System.out.println("\nAluno: " + aluno.getNome());
        System.out.println("Média: " + media);
        System.out.println("Situação: " + situacao);

        sc.close();
    }
}

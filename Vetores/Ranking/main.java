import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos jogadores terão: ");
        int qntdJogadores = sc.nextInt();
        sc.nextLine();

        Ranking ranking = new Ranking(qntdJogadores);
        System.out.println();

        for (int i = 0; i < qntdJogadores; i++) {
            System.out.print("Digite o nome do jogador da posição " + i + ": ");
            String jogador = sc.nextLine();

            System.out.print("Digite os pontos do jogador da posição " + i + ": ");
            int pontos = sc.nextInt();
            sc.nextLine();

            Score score = new Score(jogador, pontos);
            ranking.add(i, score);
            System.out.println();

        }
        System.out.println("\n Maior pontuação: ");
        ranking.maiorPontuacao();

        System.out.println("\n Jogadores e Pontos LISTADOS: ");
        ranking.listar();


        sc.close();
    }
}

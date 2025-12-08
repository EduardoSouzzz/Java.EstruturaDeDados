import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos livros vc deseja adicionar: ");
        int qntd = sc.nextInt();
        sc.nextLine();

        Biblioteca biblioteca = new Biblioteca(qntd);

        System.out.println();
        for (int i = 0; i < qntd; i++) {
            System.out.print("Digite o titulo do livro da posição " + (i + 1) + ": ");
            String livro = sc.nextLine();

            System.out.print("Digite o autor do livro da posição " + (i + 1) + ": ");
            String autor = sc.nextLine();

            Livro livros = new Livro(livro, autor);
            biblioteca.add(i, livros);
            System.out.println();
        }

        System.out.println("Livros e autores cadastrados: ");
        biblioteca.listar();

        System.out.println();
        System.out.println("Digite qual autor vc deseja buscar: ");
        String autor = sc.nextLine();

        Livro resultado = biblioteca.buscarPorAutor(autor);

        if (resultado != null) {
            System.out.println("Você achou o autor! Livro: " + resultado.getTitulo());
        } else {
            System.out.println("Autor digitado NÃO existe");
        }

        sc.close();
    }
}

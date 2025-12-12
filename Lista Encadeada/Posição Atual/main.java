import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ListaLigada lista = new ListaLigada();

        // Inserindo valores padrão
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);

        System.out.println("Lista inicial:");
        lista.listar();

        System.out.println("\nInserindo 5 na posição 0 (início):");
        lista.posAtual(0, 5);
        lista.listar();

        System.out.println("\nInserindo 25 na posição 3 (meio):");
        lista.posAtual(3, 25);
        lista.listar();

        System.out.println("\nInserindo 50 na posição 6 (final):");
        lista.posAtual(6, 50);
        lista.listar();

        System.out.println("\nTentando inserir na posição inválida 999:");
        try {
            lista.posAtual(999, 999);
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        System.out.println("\nLista final:");
        lista.listar();

        sc.close();
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ListaLigada lista = new ListaLigada();

        System.out.println("Adicionando valores...");
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(50);

        System.out.println("\nLista atual:");
        lista.listar();

        System.out.println("\nRemovendo 30...");
        lista.remover(30);
        lista.listar();

        System.out.println("\nRemovendo 10 (início da lista)...");
        lista.remover(10);
        lista.listar();

        System.out.println("\nTentando remover 999 (não existe)...");
        boolean removeu = lista.remover(999);
        System.out.println("Removeu? " + removeu);
        lista.listar();

        System.out.println("\nRemovendo 50 (último elemento)...");
        lista.remover(50);
        lista.listar();

        sc.close();
    }
}

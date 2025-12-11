import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ListaLigada lista = new ListaLigada();

        System.out.println("Adicionando valores...");
        lista.add(5);
        lista.add(10);
        lista.add(15);
        lista.add(20);
        lista.add(25);
        lista.add(30);

        System.out.print("Digite o valor que deseja procurar: ");
        int valor = sc.nextInt();

        if (lista.contains(valor)) {
            System.out.println("O valor digitado foi encontrado.");
        } else {
            System.out.println("Valor não encontrado.");
        }


        System.out.println("\n Lista atual:");
        lista.listar();



        sc.close();
    }
}

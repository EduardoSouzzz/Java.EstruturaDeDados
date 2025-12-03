import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Tamanho do estoque: ");
        int tamanho = sc.nextInt();
        sc.nextLine(); // limpar buffer

        Estoque estoque = new Estoque(tamanho);

        // cadastrar produtos
        for (int i = 0; i < tamanho; i++) {
            System.out.print("Digite o produto da posição " + i + ": ");
            String nome = sc.nextLine();
            estoque.add(i, nome);
        }

        // listar tudo
        System.out.println("\nProdutos no estoque:");
        estoque.listar();

        // procurar um produto
        System.out.print("\nDigite um produto para procurar: ");
        String procurado = sc.nextLine();

        boolean achou = estoque.existe(procurado);

        if (achou) {
            System.out.println("O produto está no estoque!");
        } else {
            System.out.println("O produto NÃO está no estoque.");
        }


        sc.close();
    }
}

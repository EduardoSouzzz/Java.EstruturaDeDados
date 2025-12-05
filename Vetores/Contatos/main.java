import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos contatos a agenda terá: ");
        int qntCont = sc.nextInt();
        sc.nextLine();


        Agenda agenda = new Agenda(qntCont);
        System.out.println();

        for (int i = 0; i < qntCont; i++) {
            System.out.print("Digite o nome do contato, posição " + i + ": ");
            String nomes = sc.nextLine();

            System.out.print("Digite o telefone do contato, posição " + i + ": ");
            String telefone = sc.nextLine();
            Contato contatos = new Contato(nomes, telefone);

            agenda.addContato(i, contatos);
            System.out.println();

        }

        System.out.println("\n Contatos dentro da agenda: ");
        agenda.listar();

        System.out.print("\nDeseja procurar pelo(s) contato(s) (S/N): ");
        char resposta = sc.next().toUpperCase().charAt(0);
        sc.nextLine();

        if (resposta == 'S') {
            System.out.print("Digite o nome do contato(s) que deseja procurar: ");
            String nome = sc.nextLine();

            boolean achou = agenda.buscar(nome);


            if (achou) {
                System.out.println("O contato está na agenda!");
            } else {
                System.out.println("O contato NÃO está na agenda...");
            }


        } else if (resposta == 'N') {
            System.out.println("Ok, obrigado pela comunicação!");
        } else {
            System.out.println("Digite apenas SIM ou NÃO");
        }


        sc.close();
    }
}

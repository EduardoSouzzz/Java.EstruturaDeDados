import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        TemparaturaSemanal semana = new TemparaturaSemanal(7);

        System.out.println("Digite as temperaturas dos 7 dias da semana:");

        for (int i = 0; i < 7; i++) {
            System.out.print("Dia " + (i + 1) + ": ");
            double valor = sc.nextDouble();
            semana.registrar(i, valor);
        }

        System.out.println();
        System.out.println("Maior temperatura: " + semana.maior());
        System.out.println("Menor temperatura: " + semana.menor());
        System.out.println("Média semanal: " + semana.media());

        sc.close();
    }
}

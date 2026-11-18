package pilhas;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayDeque<Integer> stack = new ArrayDeque<Integer>();
		
		for (int i = 1; i<=5; i++) {
			System.out.println("Digite o número " + i + ": ");
			int n = sc.nextInt();
			
			if (n % 2 == 0) {
				stack.push(n);
			} else {
				
				try {
					Integer desempilhado = stack.pop();
					
					if (desempilhado == null) {
						System.out.println("Pilha está vázia.");
					} else {
						System.out.println("Número desempilhado: " + desempilhado);
					}
					
				} catch (Exception e) {
					System.out.println("PIlha está vazia");
				}
				
			}
		}
			
		
		while (!stack.isEmpty()) {
			System.out.println("Desemepilhando um elemento da pilha: " + stack.pop());
		}
		
	
		System.out.println("Todos os elementos foram desempilhados");
	}	
}

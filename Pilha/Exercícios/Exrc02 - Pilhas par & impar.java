package pilhas;

import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        ArrayDeque<Integer> par = new ArrayDeque<Integer>();
        ArrayDeque<Integer> impar = new ArrayDeque<Integer>();

		for (int i = 1; i<=5; i++) {
			System.out.println("Escreva o número " + i + ": ");
			int n = sc.nextInt();
			
			try {
				
				if (n == 0) {
					System.out.println("Desempilhando na pilha PAR: " + par.pop());
					System.out.println("Desempilhando na pilha IMPAR: " + impar.pop());
					
				} else if (n % 2 == 0) {
					par.push(n);
					System.out.println("Empilhando na pilha PAR.");	
				} else {
					impar.push(n);
					System.out.println("Empilhando na pilha IMPAR.");	

				}
				
			} catch (NoSuchElementException e) {
				System.out.println("Pilha vazia.");
			}
		}
		
		System.out.println();
		System.out.println("Desempilhando as duas pilhas: ");
		
		while (!par.isEmpty()) {
			System.out.println("Pilha PAR: " + par.pop());
		}
		
		System.out.println("Pilha PAR desempilhada!");
		
		
		while (!impar.isEmpty()) {
			System.out.println("Pilha IMPAR: " + impar.pop());
		}
		
		System.out.println("Pilha IMPAR desempilhada!");

		
	}
}

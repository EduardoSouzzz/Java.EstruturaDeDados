package pilhas;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		imprimirResultado(6);
		
		imprimirResultado(9);
		
		imprimirResultado(300);
	}
	
	public static void imprimirResultado(int numero) {
		System.out.println(numero + " em binario é: " + decimalBinario(numero));
	}
	
	
	
	public static String decimalBinario(int numero) {
		
		ArrayDeque<Integer> pilha = new ArrayDeque<Integer>();
		String numBinario = "";
		int restoDivisao;
		
		while (numero > 0) {
			restoDivisao = numero % 2;
			pilha.push(restoDivisao);
			numero /= 2;
		}
		
		while (!pilha.isEmpty()) {
			numBinario += pilha.pop();
		}
		
		return numBinario;
	}
}

package pilhas;

import java.util.ArrayDeque;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        
        ArrayDeque<Livro> pilha = new ArrayDeque<Livro>();
        
        Livro l1 = new Livro("Java", "345", 2010, "James Gosling");
        Livro l2 = new Livro("PHP", "785", 2005, "Ryan Thacker");
        Livro l3 = new Livro("JS - tudo em um livro", "283", 2018, "Khai Havred");
        
        pilha.push(l1);
        pilha.push(l2);
        pilha.push(l3);
        System.out.println("Livros empilhados: ");
        System.out.println("Tamanho da pilha: " + pilha.size());
        
        System.out.println("Pilha está vazia?: " + pilha.isEmpty());
        
        System.out.println("Espiando o topo da pilha: " + pilha.peek());
        
        
        while (!pilha.isEmpty()) {
        	System.out.println("Livros removidos: " + pilha.pop());
        }
        System.out.println("Todos os livros foram desempilhados: ");
        System.out.println("Pilha está vazia?: " + pilha.isEmpty());
	}
}

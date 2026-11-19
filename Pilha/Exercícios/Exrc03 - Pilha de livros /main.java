
void main() {

    Pilha<Livro> livros =  new Pilha<>(20);

    Livro l1 = new Livro("Java Learning", "123456789-2581", 2010, "James Gosling");
    Livro l2 = new Livro("PHP - Tudo que precisamos", "781523879-3956", 2005, "Ryan Kylon");
    Livro l3 = new Livro("DataBase - Where all", "289375746-0341", 2013, "Mark Zambida");

    Livro l4 = new Livro("DOCKER - Nova Ferramenta", "481369319-2490", 2021, "Jannie Dufrein");
    Livro l5 = new Livro("Spring Boot - Framework JAVA", "128341294-8294", 2015, "James Gosling");
    Livro l6 = new Livro("Codigo Limpo", "285899412-3923", 2019, "Francis Gatrynn");


    livros.empilha(l1);
    livros.empilha(l2);
    livros.empilha(l3);
    livros.empilha(l4);

    System.out.println(livros.tamanho() + " livros empilhados.");
    System.out.println(livros);


    System.out.println("Pilha de livros está vazia?: " + livros.isEmpty());


    System.out.println("Desempilhando livros da pilha: ");

    while (!livros.isEmpty()) {
        System.out.println(livros.desempilha());
    }

    System.out.println("Todos os livros foram desempilhados, pilha vazia?: " + livros.isEmpty());
}

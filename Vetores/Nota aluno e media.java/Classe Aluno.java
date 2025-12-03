public class Aluno {

    private String nome;
    private double[] notas;

    public Aluno(String nome, int quantidadeNotas) {
        this.nome = nome;
        this.notas = new double[quantidadeNotas];
    }

    public void adicionarNota(int posicao, double valor) {
        if (posicao >= 0 && posicao < notas.length) {
            notas[posicao] = valor;
        } else {
            System.out.println("Posição inválida.");
        }
    }

    public double calcularMedia() {
        double soma = 0.0;
        for (double n : notas) {
            soma += n;
        }
        return soma / notas.length;
    }

    public String situacao() {
        double media = calcularMedia();
        if (media >= 6.0) {
            return "Aprovado";
        } else {
            return "Reprovado";
        }
    }

    public String getNome() {
        return nome;
    }
}

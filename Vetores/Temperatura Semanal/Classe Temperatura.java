public class TemparaturaSemanal {

    private double[] temps;

    public TemparaturaSemanal(int sete) {
        this.temps = new double[sete];
    }

    public void registrar(int dia, double valor) {
        temps[dia] = valor;
    }

    public double maior() {
        double maior = temps[0]; // começa com o primeiro valor do vetor
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] > maior) { // compara se cada um do vetor é maior que todos
                maior = temps[i]; // atualiza quem foi a maior temp
            }
        }
        return maior;
    }

    public double menor() {
        double menor = temps[0]; // começa com o primeiro valor do vetor
        for (int i = 1; i < temps.length; i++) {
            if (temps[i] < menor) { // compara se cada um do vetor é menor que todos
                menor = temps[i]; // atualiza quem foi a menor temp
            }
        }
        return menor;
    }

    public double media() {
        double soma = 0.0;
        for (double t : temps) {
            soma += t;
        }
        return soma / temps.length;
    }

}

public class Boletim {

    private double[] notas;

    public Boletim(int quantidadeNotas) {
        this.notas = new double[quantidadeNotas];
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void addNota(int pos, double valor) {
        if (pos >= 0 && pos < notas.length) {
            notas[pos] = valor;
        }
    }

    public double media() { // media das notas
        double soma = 0.0;
        for (double m : notas) {
            soma += m;
        }
        return soma / notas.length;
    }

    public double maiorNota() {
        double maiorNota = notas[0];
        for (int i = 1; i < notas.length; i++) {
            if (notas[i] > maiorNota) {
                maiorNota = notas[i];
            }
        }
        return maiorNota;
    }
}

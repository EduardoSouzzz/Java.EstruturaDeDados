public class Agenda {

    private Contato[] contato;

    public Agenda(int tamanho) {
        this.contato = new Contato[tamanho];
    }

    public Contato[] getContato() {
        return contato;
    }

    public void setContato(Contato[] contato) {
        this.contato = contato;
    }

    public void addContato(int pos, Contato c) {
        contato[pos] = c;
    }

    public void listar() {
        for (int i = 0; i < contato.length; i++) {
            if (contato[i] != null) {
                System.out.println(i + " - "
                + contato[i].getNome()
                + " | "
                + contato[i].getTelefone());
            } else {
                System.out.println(i + " - [Vazio]");
            }
        }
    }

    public boolean buscar(String nome) {
        for (int i = 0; i < contato.length; i++) {
            if (contato[i] != null && contato[i].getNome().equalsIgnoreCase(nome)) {
                return true;
            }
        }
        return false;
    }
}

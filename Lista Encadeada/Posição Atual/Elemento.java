public class Elemento {

    private int valorNaLista;
    private Elemento elementoNaLista;

    public Elemento(int valorNaLista) {
        this.valorNaLista = valorNaLista;
    }

    public int getValorNaLista() {
        return valorNaLista;
    }

    public void setValorNaLista(int valorNaLista) {
        this.valorNaLista = valorNaLista;
    }

    public Elemento getElementoNaLista() {
        return elementoNaLista;
    }

    public void setElementoNaLista(Elemento elementoNaLista) {
        this.elementoNaLista = elementoNaLista;
    }
}

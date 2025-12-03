public class Estoque {

    private String[] produtos;

    public Estoque(int tamanho) {
       this.produtos = new String[tamanho];
    }

    public void add(int posicao, String nome) {
        produtos[posicao] = nome;
    }

    public void listar() {
        for (int i = 0; i < produtos.length; i++) {
            System.out.println("Posição " + i + ": " + produtos[i]); // Lista OS produtos
        }
    }

    public boolean existe(String nome) {
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null && produtos[i].equals(nome)) {
                // Se existe um produto guardado na posição i (não é null)
                // E esse produto é igual ao nome que estou procurando
                // Então esse produto existe no estoque
                return true;
            }
        }
        return false;
    }
}

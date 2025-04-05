public abstract class ItemCardapio {
    private int numItem;
    private String nomeItem;
    private String descricao;
    private double preco;

    public ItemCardapio(int numItem, String nomeItem, String descricao, double preco) {
        this.numItem = numItem;
        this.nomeItem = nomeItem;
        this.descricao = descricao;
        this.preco = preco;
    }

    public void atualizarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void exibirDetalhes() {
        System.out.println("Item: " + nomeItem + " - Descrição: " + descricao + " - Preço: " + preco);
    }

    public double getPreco() {
        return preco;
    }

    public int getNumItem() {
        return numItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }
}

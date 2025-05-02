public abstract class ItemCardapio {
    private int numItem;
    private String nome;
    private String descricao;
    private double preco;

    public ItemCardapio(int numItem, String nome, String descricao, double preco) {
        this.numItem = numItem;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
    }

    public void atualizarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public void exibirDetalhes() {
        System.out.println("Item: " + nome + " - Descrição: " + descricao + " - Preço: " + preco);
    }

    public double getPreco() {
        return preco;
    }

    public int getNumItem() {
        return numItem;
    }

    public String getNome() {
        return nome;
    }
}

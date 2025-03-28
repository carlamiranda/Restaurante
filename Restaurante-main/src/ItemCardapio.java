public abstract class ItemCardapio {
    private int numItem;
    private String nomeItem;
    private String descricao;
    private double preco;

    // Construtor
    public ItemCardapio(int numItem, String nomeItem, String descricao, double preco) {
        this.numItem = numItem;
        this.nomeItem = nomeItem;
        this.descricao = descricao;
        this.preco = preco;
    }

    // Método para atualizar o preço
    public void atualizarPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    // Método para exibir detalhes do item
    public void exibirDetalhes() {
        System.out.println("Item: " + nomeItem + " - Descrição: " + descricao + " - Preço: " + preco);
    }

    // Getter para o preço
    public double getPreco() {
        return preco;
    }

    // Adicionando os métodos getter para os campos 'numItem' e 'nomeItem'
    public int getNumItem() {
        return numItem;
    }

    public String getNomeItem() {
        return nomeItem;
    }
}

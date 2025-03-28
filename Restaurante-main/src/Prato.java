public class Prato extends ItemCardapio {

    public Prato(int numItem, String nomeItem, String descricao, double preco) {
        super(numItem, nomeItem, descricao, preco);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Prato: " + super.getPreco());
    }
}

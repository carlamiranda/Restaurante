public class Prato extends ItemCardapio {

    public Prato(int numItem, String nome, String descricao, double preco) {
        super(numItem, nome, descricao, preco);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Prato: " + super.getPreco());
    }
}

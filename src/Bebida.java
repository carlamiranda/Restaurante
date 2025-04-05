public class Bebida extends ItemCardapio {

    public Bebida(int numItem, String nomeItem, String descricao, double preco) {
        super(numItem, nomeItem, descricao, preco);
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Bebida: " + super.getPreco());
    }
}

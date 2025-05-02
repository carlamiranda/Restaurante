public class Bebida extends ItemCardapio {

    // Construtor padrão com todos os parâmetros
    public Bebida(int numItem, String nome, String descricao, double preco) {
        super(numItem, nome, descricao, preco);
    }

    // Novo construtor simplificado para usar na fábrica
    public Bebida(String nome, double preco) {
        super(0, nome, "", preco); // valores padrão para os campos faltantes
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Bebida: " + super.getPreco());
    }
}

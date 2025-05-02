public class PratoFactory implements ItemFactory {
    @Override
    public ItemCardapio criarItem(String nome, double preco) {
        return new Prato(1, nome, "Sem descrição", preco);
    }
}

public class BebidaFactory implements ItemFactory {
    @Override
    public ItemCardapio criarItem(String nome, double preco) {
        return new Bebida(nome, preco);
    }
}
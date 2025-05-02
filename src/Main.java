public class Main {
    public static void main(String[] args) {
        ItemFactory pratoFactory = new PratoFactory();
        ItemFactory bebidaFactory = new BebidaFactory();

        ItemCardapio feijoada = pratoFactory.criarItem("Feijoada", 25.90);
        ItemCardapio suco = bebidaFactory.criarItem("Suco de Laranja", 5.00);

        System.out.println("Item criado: " + feijoada.getNome() + " - R$" + feijoada.getPreco());
        System.out.println("Item criado: " + suco.getNome() + " - R$" + suco.getPreco());
    }
}

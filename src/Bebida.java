public class Bebida extends ItemCardapio {

    
    public Bebida(int numItem, String nome, String descricao, double preco) {
        super(numItem, nome, descricao, preco);
    }

   
    public Bebida(String nome, double preco) {
        super(0, nome, "", preco); 
    }

    @Override
    public void exibirDetalhes() {
        System.out.println("Bebida: " + super.getPreco());
    }
}

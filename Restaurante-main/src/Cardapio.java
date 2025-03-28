import java.util.ArrayList;
import java.util.List;

public class Cardapio {
    private int numCardapio;
    private List<ItemCardapio> itensCardapio;

    public Cardapio(int numCardapio) {
        this.numCardapio = numCardapio;
        this.itensCardapio = new ArrayList<>();
    }

    public void exibirDetalhes() {
        System.out.println("Detalhes do Cardápio: Número do Cardápio: " + numCardapio);
    }

    public void listarItens() {
        System.out.println("Itens do Cardápio:");
        for (ItemCardapio item : itensCardapio) {
            item.exibirDetalhes();
        }
    }

    public void adicionarItem(ItemCardapio item) {
        itensCardapio.add(item);
    }

    public List<ItemCardapio> getItensCardapio() {
        return itensCardapio;
    }
}

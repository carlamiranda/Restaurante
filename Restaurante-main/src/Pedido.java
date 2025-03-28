import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numPedido;
    private String situacaoPedido;
    private Cliente cliente;
    private List<ItemCardapio> itensCardapio;

    public Pedido(int numPedido, Cliente cliente) {
        this.numPedido = numPedido;
        this.cliente = cliente;
        this.situacaoPedido = "Em andamento";
        this.itensCardapio = new ArrayList<>();
    }

    public void addItemCardapio(ItemCardapio item) {
        itensCardapio.add(item);
    }

    public void removerItemCardapio(ItemCardapio item) {
        itensCardapio.remove(item);
    }

    public List<ItemCardapio> getItensCardapio() {
        return itensCardapio;
    }

    public int getNumPedido() {
        return numPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public String getSituacaoPedido() {
        return situacaoPedido;
    }

    public void setSituacaoPedido(String situacaoPedido) {
        this.situacaoPedido = situacaoPedido;
    }
}

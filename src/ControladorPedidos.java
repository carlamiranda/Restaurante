import java.util.ArrayList;
import java.util.List;

public class ControladorPedidos {
    private List<Pedido> pedidos;

    public ControladorPedidos() {
        this.pedidos = new ArrayList<>();
    }

    public void criarNovoPedido(Pedido pedido) {
        pedidos.add(pedido);
        System.out.println("Novo pedido criado.");
    }

    public void finalizarPedido(Pedido pedido) {
        System.out.println("Pedido finalizado.");
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }
}

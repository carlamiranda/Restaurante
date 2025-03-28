import java.util.ArrayList;
import java.util.List;

public class ControladorPagamento {
    private List<Conta> contas;

    public ControladorPagamento() {
        this.contas = new ArrayList<>();
    }

    public void realizarPagamento(Conta conta) {
        System.out.println("Pagamento realizado.");
    }

    public void cancelarPagamento(Conta conta) {
        System.out.println("Pagamento cancelado.");
    }

    public List<Conta> getContas() {
        return contas;
    }
}

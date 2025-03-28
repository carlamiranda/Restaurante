public class Cliente {
    private String nomeCliente;
    private int numCliente;

    public Cliente(String nomeCliente, int numCliente) {
        this.nomeCliente = nomeCliente;
        this.numCliente = numCliente;
    }

    public void alterarPedido() {
    }

    public void cancelarPedido() {
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public int getNumCliente() {
        return numCliente;
    }
}

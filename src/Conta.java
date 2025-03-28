public class Conta {
    private int numConta;
    private int numCliente;
    private String tipoPagamento;

    public Conta(int numConta, int numCliente, String tipoPagamento) {
        this.numConta = numConta;
        this.numCliente = numCliente;
        this.tipoPagamento = tipoPagamento;
    }

    public void pagamento() {
    }

    public void cancelarPagamento() {
    }

    public int getNumConta() {
        return numConta;
    }

    public int getNumCliente() {
        return numCliente;
    }

    public String getTipoPagamento() {
        return tipoPagamento;
    }
}

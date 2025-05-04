public class Conta {
    private int numConta;
    private int numCliente;
    private FormaPagamentoStrategy formaPagamento;

    public Conta(int numConta, int numCliente, FormaPagamentoStrategy formaPagamento) {
        this.numConta = numConta;
        this.numCliente = numCliente;
        this.formaPagamento = formaPagamento;
    }

    public void pagamento(double valor) {
        formaPagamento.pagar(valor);
    }

    public void cancelarPagamento() {
        System.out.println("Pagamento cancelado para a conta " + numConta);
    }

    public int getNumConta() {
        return numConta;
    }

    public int getNumCliente() {
        return numCliente;
    }
}

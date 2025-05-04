public class PagamentoCredito implements FormaPagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado no cartão de **crédito**.");
    }
}
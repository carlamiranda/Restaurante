public class PagamentoDebito implements FormaPagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado no cartão de **débito**.");
    }
}
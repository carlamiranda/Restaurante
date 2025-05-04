public class PagamentoDinheiro implements FormaPagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado em **dinheiro**.");
    }
}
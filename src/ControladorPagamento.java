public class ControladorPagamento {
    public void realizarPagamento(Conta conta, double valor) {
        conta.pagamento(valor);
        System.out.println("Pagamento registrado no sistema.");
    }

    public void cancelarPagamento(Conta conta) {
        conta.cancelarPagamento();
    }
}

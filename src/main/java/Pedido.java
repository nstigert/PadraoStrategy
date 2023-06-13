public class Pedido {
    public Pedido() {
    }

    public String pagar(Pagamento pagamento) {
        return pagamento.pagar();
    }
}

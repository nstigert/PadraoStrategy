public class Cliente {
    private String tipoPagamento;

    public String getTipoPagamento() {
        return tipoPagamento;
    }

    public void pagarComPix() {
        Pedido pedido = new Pedido();
        tipoPagamento = pedido.pagar(new PagamentoPix());
    }

    public void pagarComCartaoCredito() {
        Pedido pedido = new Pedido();
        tipoPagamento = pedido.pagar(new PagamentoCartaoCredito());
    }

    public void pagarComCartaoDebito() {
        Pedido pedido = new Pedido();
        tipoPagamento = pedido.pagar(new PagamentoCartaoDebito());
    }

    public void pagarComDinheiro() {
        Pedido pedido = new Pedido();
        tipoPagamento = pedido.pagar(new PagamentoDinheiro());
    }
}

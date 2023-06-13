import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
    @Test
    void devePagarComPix() {
        Cliente cliente = new Cliente();
        cliente.pagarComPix();
        assertEquals("Pagamento via Pix", cliente.getTipoPagamento());
    }

    @Test
    void devePagarComCartaoCredito() {
        Cliente cliente = new Cliente();
        cliente.pagarComCartaoCredito();
        assertEquals("Pagamento com Cartão de Crédito", cliente.getTipoPagamento());
    }

    @Test
    void devePagarComCartaoDebito() {
        Cliente cliente = new Cliente();
        cliente.pagarComCartaoDebito();
        assertEquals("Pagamento com Cartão de Débito", cliente.getTipoPagamento());
    }

    @Test
    void devePagarComDinheiro() {
        Cliente cliente = new Cliente();
        cliente.pagarComDinheiro();
        assertEquals("Pagamento em Dinheiro", cliente.getTipoPagamento());
    }

}
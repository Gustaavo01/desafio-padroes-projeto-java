interface PagamentoStrategy {
    void pagar(double valor);
}

class PagamentoPix implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento realizado via PIX no valor de R$ " + valor);
    }
}

class PagamentoCartao implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento realizado via Cartao no valor de R$ " + valor);
    }
}

class PagamentoBoleto implements PagamentoStrategy {
    @Override
    public void pagar(double valor) {
        System.out.println("Pagamento realizado via Boleto no valor de R$ " + valor);
    }
}

class ConfiguracaoBanco {
    private static ConfiguracaoBanco instancia;

    private ConfiguracaoBanco() {
    }

    public static ConfiguracaoBanco getInstancia() {
        if (instancia == null) {
            instancia = new ConfiguracaoBanco();
        }
        return instancia;
    }

    public void conectar() {
        System.out.println("Conectando ao sistema do ByteBank...");
    }
}

class PagamentoFacade {
    public void realizarPagamento(PagamentoStrategy formaPagamento, double valor) {
        ConfiguracaoBanco.getInstancia().conectar();
        formaPagamento.pagar(valor);
        System.out.println("Operacao finalizada com sucesso!");
        System.out.println("------------------------------");
    }
}

public class Main {
    public static void main(String[] args) {
        PagamentoFacade pagamentoFacade = new PagamentoFacade();

        pagamentoFacade.realizarPagamento(new PagamentoPix(), 150.00);
        pagamentoFacade.realizarPagamento(new PagamentoCartao(), 300.00);
        pagamentoFacade.realizarPagamento(new PagamentoBoleto(), 500.00);
    }
}
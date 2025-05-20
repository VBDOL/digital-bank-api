public class GerenciadorTransacao {
    private ConexaoBanco conexao;
    private TaxaTransacao taxa;

    public GerenciadorTransacao(TaxaTransacao taxa) {
        this.conexao = ConexaoBanco.getInstancia();
        this.taxa = taxa;
    }

    public void processarPagamento(double valor) {
        double taxaAplicada = taxa.calcularTaxa(valor);
        double valorFinal = valor - taxaAplicada;

        conexao.executarConsulta("INSERT INTO transacoes (valor) VALUES (" + valorFinal + ")");
        System.out.println("Pagamento de R$ " + valor + " processado com taxa de R$ " + taxaAplicada);
    }
}

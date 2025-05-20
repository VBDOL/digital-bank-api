public class Main {
    public static void main(String[] args) {
        GerenciadorTransacao transacao1 = new GerenciadorTransacao(new TaxaBancaria());
        transacao1.processarPagamento(1000);

        GerenciadorTransacao transacao2 = new GerenciadorTransacao(new TaxaPremium());
        transacao2.processarPagamento(2000);
    }
}

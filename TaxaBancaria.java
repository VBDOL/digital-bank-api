public class TaxaBancaria implements TaxaTransacao {
    @Override
    public double calcularTaxa(double valor) {
        return valor * 0.02; // 2% de taxa
    }
}

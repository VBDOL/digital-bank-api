public class ConexaoBanco {
    private static ConexaoBanco instancia;

    private ConexaoBanco() {
        System.out.println("Conexão estabelecida com o banco.");
    }

    public static ConexaoBanco getInstancia() {
        if (instancia == null) {
            instancia = new ConexaoBanco();
        }
        return instancia;
    }

    public void executarConsulta(String sql) {
        System.out.println("Executando consulta: " + sql);
    }
}

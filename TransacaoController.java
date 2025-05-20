import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/transacoes")
public class TransacaoController {
    @PostMapping("/pagamento")
    public ResponseEntity<String> processarPagamento(@RequestParam double valor, @RequestParam String tipo) {
        TaxaTransacao taxa = tipo.equalsIgnoreCase("premium") ? new TaxaPremium() : new TaxaBancaria();
        GerenciadorTransacao gerenciador = new GerenciadorTransacao(taxa);
        
        gerenciador.processarPagamento(valor);
        return ResponseEntity.ok("Pagamento de R$ " + valor + " processado com sucesso!");
    }
}

# 🚀 Banco Digital API com Padrões de Projeto

Este projeto implementa os padrões de projeto **Singleton**, **Strategy** e **Facade** utilizando **Java** e posteriormente aplicados em **Spring Boot** para expor uma API REST.

## 📌 Objetivo

O objetivo é demonstrar como os padrões de projeto podem ser aplicados a um sistema bancário e simplificados por meio da API REST.

## 🛠️ Funcionalidades

1. **Gerenciamento de Conexão Singleton** → Apenas uma instância da conexão com banco.
2. **Cálculo de Taxas usando Strategy** → Escolha dinâmica de taxas de transação.
3. **Uso de Facade** → Simplifica a interação com múltiplos componentes.
4. **Exposição de API REST** → Permite processar pagamentos via requisições HTTP.

## 📂 Estrutura do Projeto - Futura estrutura

📦 banco-digital-api 
┣ 📂 src 
┃ ┣ 📂 main 
┃ ┃ ┣ 📂 java/com/banco 
┃ ┃ ┃ ┣ 📜 ConexaoBanco.java 
┃ ┃ ┃ ┣ 📜 TaxaTransacao.java 
┃ ┃ ┃ ┣ 📜 TaxaBancaria.java 
┃ ┃ ┃ ┣ 📜 TaxaPremium.java 
┃ ┃ ┃ ┣ 📜 GerenciadorTransacao.java 
┃ ┃ ┃ ┣ 📜 TransacaoController.java 
┃ ┃ ┗ 📜 Main.java 
┣ 📜 README.md 
┣ 📜 application.properties 
┣ 📜 pom.xml 
┗ 📜 .gitignore


## 🚀 Como Rodar o Projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/banco-digital-api.git
2. Importe em uma IDE Java (Eclipse, IntelliJ).

3. Execute Main.java para testar a lógica inicial.

4. Se estiver rodando Spring Boot, execute:
Bash
mvn spring-boot:run

5. Teste a API REST com:
Bash
curl -X POST "http://localhost:8080/transacoes/pagamento?valor=1000&tipo=premium"

##📝 Melhorias Futuras

Implementação de Banco de Dados com JPA

Autenticação via JWT

Adicionar Spring Security

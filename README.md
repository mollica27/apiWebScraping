# LinkedIn Job Scraper and Email Notifier

## Descrição do Projeto

Este projeto consiste em um web scraping em Java que coleta dados de vagas no LinkedIn e envia alertas via e-mail sobre novas vagas disponíveis. Ele usa a biblioteca JSoup para fazer o web scraping e a API JavaMail para enviar e-mails.

## Pré-requisitos

Antes de executar o projeto, certifique-se de ter as seguintes ferramentas instaladas:

- Java (versão 8 ou superior)
- Maven
- Conta de e-mail para enviar notificações (Gmail é recomendado)

## Configuração

1. Clone este repositório:

   ```bash
   git clone git@github.com:mollica27/apiWebScraping.git
   ```

2. Navegue até o diretório do projeto:

   ```bash
   cd apiWebScraping
   ```

3. Abra o arquivo `config.properties` e configure as informações necessárias:

   ```properties
   linkedin.username=seu_usuario
   linkedin.password=sua_senha
   email.username=seu_email@gmail.com
   email.password=sua_senha_do_email
   ```

   Substitua `seu_usuario`, `sua_senha`, `seu_email@gmail.com` e `sua_senha_do_email` pelas suas informações.

## Execução

Execute o seguinte comando Maven para compilar e executar o projeto:

```bash
mvn clean install
mvn exec:java
```

O aplicativo iniciará o web scraping no LinkedIn e enviará alertas por e-mail sobre novas vagas disponíveis.

## Notas Importantes

- Este projeto é apenas para fins educacionais. Certifique-se de cumprir os termos de serviço do LinkedIn ao usá-lo.
- Recomenda-se o uso de uma conta de e-mail temporária ou dedicada para enviar notificações, pois as credenciais serão armazenadas no arquivo de configuração.

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir problemas ou enviar solicitações de pull.

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).

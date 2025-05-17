# Spring Boot para Iniciantes

Este projeto foi desenvolvido como parte do curso de Spring Boot para iniciantes ministrado pelo professor Matheus Leandro Ferreira (https://www.youtube.com/watch?v=SqU9v_V32RA&t=1924s). Ele demonstra conceitos básicos de criação de APIs REST utilizando Spring Boot, integração com banco de dados PostgreSQL, e organização de camadas (Controller, Service, Repository).

## Funcionalidades

- API REST para gerenciamento de produtos (`Produto`)
- Endpoint de mensagem simples
- Integração com banco de dados PostgreSQL usando Spring Data JPA

## Endpoints

- `GET /api/hello` — Mensagem de teste ("Hello, World!")
- `GET /api/mensagem` — Mensagem vinda do repositório
- `GET /api/produtos` — Lista todos os produtos
- `GET /api/produtos/{id}` — Busca produto por ID
- `POST /api/produtos` — Cria um novo produto
- `DELETE /api/produtos/{id}` — Remove um produto

## Configuração

1. **Banco de Dados:**  
   Certifique-se de ter um banco PostgreSQL rodando e configure o arquivo [`src/main/resources/application.properties`](src/main/resources/application.properties) conforme necessário:
   ```
   spring.datasource.url=jdbc:postgresql://localhost:5432/meubanco
   spring.datasource.username=postgres
   spring.datasource.password=admin
   ```

2. **Build e Execução:**  
   Para rodar o projeto:
   ```sh
   ./mvnw spring-boot:run
   ```
   O servidor irá iniciar na porta 8081.

## Estrutura do Projeto

- `controller/` — Endpoints REST
- `service/` — Lógica de negócio
- `repository/` — Acesso a dados
- `model/` — Entidades JPA

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3.x
- Spring Data JPA
- PostgreSQL
- Maven

## O que eu aprendi

Durante o desenvolvimento deste projeto, aprendi:

Aprendi como estruturar uma aplicação Spring Boot desde o início, organizando o código em camadas bem definidas, como controller, service, repository e model. 
Compreendi como criar e expor endpoints RESTful, realizar operações de cadastro, consulta e remoção de dados utilizando o Spring Data JPA, além de configurar a conexão com um banco de dados PostgreSQL. 
Também entendi a importância das anotações do Spring para facilitar a injeção de dependências e o mapeamento das entidades, e como as propriedades de configuração ajudam a adaptar a aplicação para diferentes ambientes. 
Esse processo me proporcionou uma visão clara do ciclo de vida de uma requisição em uma API e me deu confiança para criar projetos mais avançados utilizando o ecossistema Spring.

Esses conhecimentos são fundamentais para o desenvolvimento de aplicações Java modernas e servem como base para projetos mais avançados com Spring.

## Autor

Projeto desenvolvido durante o curso de Spring Boot para iniciantes.

---

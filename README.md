# Projeto DIO - Bootcamp Claro Java com Spring Boot - API RESTful

Este repositório é destinado a um projeto da DIO no Bootcamp Claro Java, desenvolvido com Spring Boot. O objetivo do projeto é criar uma API RESTful para monitoramento de equipamentos.

## Estrutura do Projeto

- **Controllers**: Gerenciam as requisições HTTP e interagem com os serviços.
  - `AlertaController`: Gerencia alertas.
  - `DesempenhoController`: Gerencia desempenhos.
  - `EquipamentoController`: Gerencia equipamentos.
  - `UsuarioController`: Gerencia usuários.

- **Models**: Representam as entidades do banco de dados.
  - `Alerta`: Entidade para alertas.
  - `Desempenho`: Entidade para desempenhos.
  - `Equipamento`: Entidade para equipamentos.
  - `Usuario`: Entidade para usuários.

- **Repositories**: Interfaces para acesso ao banco de dados.
  - `AlertaRepository`
  - `DesempenhoRepository`
  - `EquipamentoRepository`
  - `UsuarioRepository`

- **Services**: Contêm a lógica de negócios e interagem com os repositórios.
  - `AlertaService`
  - `DesempenhoService`
  - `EquipamentoService`
  - `UsuarioService`



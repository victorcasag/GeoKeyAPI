# GeoKeyAPI

GeoKeyAPI é uma API desenvolvida em Java com Spring Boot, que fornece informações sobre países, estados e cidades. A API permite buscar dados geográficos de forma eficiente, suportando consultas de todos os países, estados por país e cidades por estado e país.

## Funcionalidades

- **Listar todos os países**: A API permite obter uma lista de todos os países disponíveis, incluindo informações como nome, código telefônico, emoji da bandeira, moeda e símbolo da moeda.
- **Listar estados por país**: A API permite obter uma lista de todos os estados disponíveis de um determinado país, retornando o nome dos estados.
- **Listar cidades por estado e país**: A API permite buscar todas as cidades de um estado específico dentro de um determinado país.

## Endpoints

- `GET /locales/country/all` - Retorna uma lista com todos os países.
- `GET /locales/state/findAllStatesByCountry/{country}` - Retorna uma lista com todos os estados de um determinado país.
- `GET /locales/city/findAllCityByCountryAndStates/{country}/{state}` - Retorna uma lista de cidades de um determinado estado e país.

## Fonte de Dados

Os dados de países, estados e cidades utilizados pela API foram extraídos do seguinte repositório: [dr5hn/countries-states-cities-database](https://github.com/dr5hn/countries-states-cities-database). Este repositório contém uma base de dados completa com informações geográficas atualizadas, fornecendo uma ampla gama de dados de países, estados e cidades.

## Tecnologias Utilizadas

- **Java 17**: Linguagem de programação utilizada no desenvolvimento.
- **Spring Boot 3.3.4**: Framework usado para construir a API REST.
- **PostgreSQL**: Banco de dados utilizado para armazenar as informações de países, estados e cidades.
- **Spring Data JPA**: Para realizar operações no banco de dados de forma simplificada.
- **HikariCP**: Para gerenciamento de conexões com o banco de dados.

## Instalação

1. Clone este repositório:

   ```bash
   git clone https://github.com/seu-usuario/GeoKeyAPI.git
   ```
2. Navegue até o diretório do projeto:
   ```bash
   cd GeoKeyAPI
   ```
3. Configure seu banco de dados PostgreSQL com os dados fornecidos no [repositório de dados](https://github.com/dr5hn/countries-states-cities-database). Para isso, baixe o conteúdo do repositório e importe os arquivos SQL para o seu banco de dados PostgreSQL.

4. Configure as propriedades do banco de dados no arquivo application.properties:
   ```bash
   spring.datasource.url=jdbc:postgresql://localhost:5432/seu-banco
   spring.datasource.username=seu-usuario
   spring.datasource.password=sua-senha
   spring.jpa.hibernate.ddl-auto=update
   ```

## Contribuição

Contribuições são bem-vindas! Se você deseja contribuir com o projeto, faça um fork do repositório, crie um branch com suas alterações e envie um pull request.

## Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo [LICENSE](./LICENSE) para mais informações.

## Créditos

- [dr5hn/countries-states-cities-database](https://github.com/dr5hn/countries-states-cities-database): Base de dados usada no projeto.

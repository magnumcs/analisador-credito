# Analisador de créditos

## Descrição

Projeto de um sistema para análise de créditos pessoal, baseado em informações cadastrais. 
Ao clicar na opção "Nova Proposta", inserir as informações na página de cadastro e clicar no botão 
"Analisar" a proposta de crédito será aprovado ou recusada. Caso seja aprovado será mostrada a faixa 
de crédido. Caso seja reprovada exibirá o motivo.

## Tecnololigas utilizadas

- O projeto foi desenvolvido utilizando no front-end react.js com o framework mdb-bootstrap-material;
No back-end foi utilizado spring-boot v2.2 com java 8;
- Para persistência dos dados em memória o banco de dados H2;
- Para publicação e integração dos ambientes foi utilizado o docker para cada serviço e o docker-compose
para orquestração de todo o ecossistema.

## Instruções de uso

Para executar o projeto é necessário seguir os requisitos:

- Sistema operacional Linux
- Docker instalado;
- Docker-compose instalado.
- Git

Clonar o projeto localmente e rodar o sequinte comando:

### `sh start.sh`

Após todos os procedimentos serem executados com sucesso, acessar a seguinte url:

### `http://localhost:4200`

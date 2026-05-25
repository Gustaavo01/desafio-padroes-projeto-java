# Desafio Padrões de Projeto em Java

Projeto desenvolvido para o desafio da Digital Innovation One com o objetivo de aplicar na prática os principais padrões de projeto utilizando Java puro.

## Sobre o projeto

O sistema simula um pequeno módulo de pagamentos do ByteBank, utilizando diferentes padrões de projeto para organizar melhor a estrutura do código, facilitar manutenção e aumentar reutilização.

## Padrões utilizados

### Singleton

O padrão Singleton foi utilizado na classe `ConfiguracaoBanco`, garantindo que exista apenas uma instância responsável pela conexão do sistema.

### Strategy

O padrão Strategy foi utilizado para representar diferentes formas de pagamento:

- PIX
- Cartão
- Boleto

Cada forma de pagamento possui sua própria implementação.

### Facade

O padrão Facade foi utilizado na classe `PagamentoFacade`, simplificando o processo de pagamento e escondendo a complexidade das operações internas.

---

## Estrutura do projeto

```text
src/
 └── Main.java

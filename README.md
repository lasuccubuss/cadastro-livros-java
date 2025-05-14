# Cadastro de Livros – Simulado de Prova

Este projeto foi desenvolvido como simulação prática da prova de Linguagem de Programação.

## Estrutura do Projeto

A aplicação foi escrita em Java e segue os seguintes critérios:

- Classe `Livro` com três atributos privados:
  - `int codigo`
  - `String titulo`
  - `double preco`

- Três construtores:
  - Construtor vazio
  - Construtor com parâmetros
  - Construtor cópia

- Métodos `get` e `set` para todos os atributos

- Método `boolean livroCaro()` para identificar livros com preço acima de R$ 200

## Classe de Teste

A classe `TestaLivro` demonstra o uso dos três construtores com três objetos:

1. `l1` – criado com o construtor vazio e preenchido com `set`
2. `l2` – criado com o construtor com parâmetros
3. `l3` – criado com o construtor cópia, baseado no `l2`

O programa imprime os dados dos livros e informa se cada um é caro ou tem preço acessível.

## Execução

O código foi compilado e testado via CMD com o Notepad++, seguindo as diretrizes da professora para a prova prática.

---

**Obs:** Esse simulado foi elaborado com apoio de estudos, revisões guiadas e até uma tiragem de tarot para prever a estrutura da questão (spoiler: acertou).

---

> Desenvolvido por [Susana Garcia](https://github.com/lasuccubuss)

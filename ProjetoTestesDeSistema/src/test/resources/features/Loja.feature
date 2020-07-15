Feature: Como consumidor desejo utilizar as funcionalidades da loja para efetuar compras

@ts-prj-final @RemoverProdutoSacola
  Scenario: Remover produto da sacola
    Given o usuario acessa a Sacola de compras
    And exista um produto na Sacola
    When usuario clicar no link Remover 
    Then e exibida tela com a mensagem "Sua sacola esta vazia."


@ts-prj-final @AdicionarProdutoSacola
  Scenario: Adicionar produto na sacola
    Given o usuario acesse o produto "Music"
    And selecione o produto "AirPods Pro"
    When usuario clicar no botao Comprar
    And clicar no botao Colocar na sacola
    Then tela e exibida com o Produto selecionado.


@ts-prj-final @ValidarBotãoDesabilitado
  Scenario: Validar que o botao Colocar na sacola nao habilita se um campo obrigatorio nao estiver preenchido
    Given o usuario acesse o produto "iPhone"
    And selecione o produto "iPhone 11 Pro"
    When usuario clicar no botao Comprar
    And escolher o "Modelo"
    And escolher a "Cor"
    And nao escolher a "Capacidade"
    Then o botao ‘Colocar na sacola’ nao e exibido


@ts-prj-final @AlterarQuantidadeProdutoSacola
  Scenario: Alterar quantidade de produtos da sacola
    Given o usuario acesse a Sacola de compras
    And exista um produto na Sacola
    When o usuario alterar a quantidade desejada do produto
    Then o valor total da compra e alterado
    And a quantidade de itens da Sacola da navbar e alterada.
x
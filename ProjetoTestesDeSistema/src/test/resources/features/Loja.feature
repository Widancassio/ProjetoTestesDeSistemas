Feature: Como consumidor desejo utilizar as funcionalidades da loja para efetuar compras

  Background: 
    Given usuario acesse o site Apple

  @ts-prj-final @RemoverProdutoSacola
  Scenario: Remover produto da sacola
    Given exista um produto na Sacola
    When usuario clicar no link Remover
    Then e exibida tela com alerta de sacola vazia

  @ts-prj-final @AdicionarProdutoSacola
  Scenario: Adicionar produto na sacola
    Given o usuario acesse o produto "Music"
    And selecione o produto "AirPods Pro" do Music
    When usuario clicar no botao Comprar
    And clicar no botao Colocar na sacola
    Then tela e exibida com o Produto selecionado

  @ts-prj-final @ValidarBotaoHabilitado
  Scenario: Validar que o botao Colocar na sacola habilita quando todos os campos obrigatorios estao preenchidos
    Given o usuario acesse o produto "iPhone"
    And selecione o produto "iPhone 11 Pro" do iPhone
    When usuario clicar no botao Comprar
    And selecionar as informacoes do produto
    Then o botao Colocar na sacola e exibido

  @ts-prj-final @AlterarQuantidadeProdutoSacola
  Scenario: Alterar quantidade de produtos da sacola
    Given exista um produto na Sacola
    And o usuario acessa a Sacola de compras
    When o usuario alterar a quantidade desejada do produto
    Then o valor total da compra e alterado
    And a quantidade de itens da Sacola da navbar e alterada

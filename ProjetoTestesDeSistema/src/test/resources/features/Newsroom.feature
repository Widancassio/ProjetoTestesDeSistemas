Feature: Como profissional de imprenssa desejo obter informações de 
        artigos publicados nos arquivos da apple para uma melhor visualização


@ts-prj-final @ResetarFiltros
  Scenario: Limpar filtros de exibicao do Newsroom
    Given o usuario acesse a pagina de Newsroom
    And o usuario realiza algum filtro
    When o usuario clica no botao resetar
    Then os filtros serao resetados 
    And serao exibidos todos os topicos
    And o botao resetar sera removido da tela
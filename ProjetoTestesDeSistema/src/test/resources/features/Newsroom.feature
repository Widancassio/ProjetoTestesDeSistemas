Feature: Como profissional de imprenssa desejo obter informa��es de 
        artigos publicados nos arquivos da apple para uma melhor visualiza��o


@ts-prj-final @ResetarFiltros
  Scenario: Limpar filtros de exibicao do Newsroom
    Given o usuario acesse a pagina de Newsroom
    And o usuario realiza um filtro
    When o usuario clica no botao resetar
    Then os filtros sao resetados 
    And sao exibidos todos os topicos
    And o botao resetar sera removido da tela
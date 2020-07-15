Feature: Como profissional de imprenssa desejo obter informações de 
        artigos publicados nos arquivos da apple para uma melhor visualização


@ts-prj-final @ResetarFiltros
  Scenario: Limpar filtros de exibicao do Newsroom
    Given o usuario acesse a pagina de Newsroom
    And clica em Arquivo
    And clica em um filtro por topico
                                                    #Será habilitado o botão resetar 
    When o usuario clica no botao resetar
    Then os filtros serao resetados 
    And sera exibido todos os topicos
    And o botao sera removido da tela
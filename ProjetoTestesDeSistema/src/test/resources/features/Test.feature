Feature: Como usuário Apple eu quero acessar o Manual do iPhone 
	para ter obter guia de uso do aparelho. 

@ts-prj-final @ManualiPhone
  Scenario: Visualizar manual do iPhone
	  Given o usuário acessa o site "apple.com.br"
	  When usuário clica no botão suporte
	  And clica no ícone iPhone    
	  And o usuário clica no botão Manual do usuário do iPhone
		Then é exibido o manual do iPhone. 

Feature: Como usuário Apple eu quero acessar a lista de programas de reparo e troca
	para saber quais programas estão disponíveis

@ts-prj-final @ListaProgramadeReparo
	Scenario: Visualizar lista de programas de extensão de reparo e troca
		Given: o usuário acessa a área de suporte
		When: o usuário clica no botão todos os programas
		Then: é exibida a lista dos Programas de extensão de reparo e troca

Feature: Como usuário Apple eu quero alterar o produto que receberá o suporte
	para que eu tenha o atendimento correto

@ts-prj-final @AlterarProdutoSuporte
  Scenario: Alterar produto que receberá suporte
	  Given o usuário acessa "https://getsupport.apple.com/"
	  And seleciona o produto ‘Mac’
	  When usuário clica no link Alterar produto               
	  And seleciona o novo produto
	  Then tela de suporte do novo produto é exibida
		
		
Feature: Alerta para suporte limitado nas terceirizadas 

@ts-prj-final @BuscaAssistenciaAutorizada
	Scenario: busca por assistências autorizadas
		Given o usuário acessa a área de suporte
		When clica no botão Centro de Serviço Autorizado Apple (AASP)
		And clica no botão serviço e suporte
		Then é exibida a mensagem “As opções de suporte da Apple estão limitadas no momento. Agradecemos sua paciência e compreensão.”.

Feature: Como usuário Apple eu quero acessar a lista de lojas para 
	saber quais lojas estão disponíveis no Brasil

@ts-prj-final @BuscaPorLojas
  Scenario: Buscar por lojas no Brasil
	  Given o usuário realiza a busca por loja             
	  When o usuário clica no botão Encontre uma loja  
	  And clica em lista completa de lojas
	  Then é exibida a lista de lojas do brasil 

Feature: Como cliente Apple eu quero remover um produto da Sacola de compras
	para que a minha Sacola fique vazia

@ts-prj-final @RemoverProdutoSacola
  Scenario: Remover produto da sacola
    Given o usuário acessa a Sacola de compras
    And exista um produto na Sacola
    When usuário clicar no link Remover 
    Then é exibida tela com a mensagem ‘’Sua sacola está vazia.’

Feature: Como cliente Apple eu quero adicionar um produto na Sacola de compras
	para que a minha Sacola seja preenchida com um produto

@ts-prj-final @AdicionarProdutoSacola
  Scenario: Adicionar produto na sacola
    Given o usuário acesse o produto Music
    And selecione o produto AirPods Pro
    When usuário clicar no botão Comprar
    And clicar no botão Colocar na sacola
    Then tela é exibida com o ‘Produto selecionado’.

Feature: Como cliente Apple eu quero selecionar apenas 2 personalizações ao produto
	para validar que o produto não ficará disponível para ser inserido a Sacola de compras

@ts-prj-final @ValidarBotãoDesabilitado
  Scenario: Validar que o botão ‘Colocar na sacola’ não habilita se um campo obrigatório não estiver preenchido
    Given o usuário acesse o produto iPhone
    And selecione o produto iPhone 11 Pro
    When usuário clicar no botão Comprar
    And escolher o ‘Modelo’
    And escolher a ‘Cor’
    And não escolher a ‘Capacidade’
    Then o botão ‘Colocar na sacola’ não é exibido

Feature: Como cliente Apple eu quero alterar a quantidade de produtos da Sacola de compras 
	para verificar o incremento no preço total

@ts-prj-final @AlterarQuantidadeProdutoSacola
  Scenario: Alterar quantidade de produtos da sacola
    Given o usuário acesse a Sacola de compras
    And exista um produto na Sacola
    When o usuário alterar a quantidade desejada do produto
    Then o valor total da compra é alterado
    And a quantidade de itens da Sacola da navbar é alterada.

Feature: Como cliente Apple eu quero limpar os filtros inseridos para que
	possa ser realizado um novo filtro

@ts-prj-final @ResetarFiltros
  Scenario: Limpar filtros de exibição do Newsroom
    Given o usuário acesse a pagina de Newsroom
    And clica em Arquivo
    And clica em um filtro por tópico
                                                    #Será habilitado o botão resetar 
    When o usuário clica no botão resetar
    Then os filtros serão resetados 
    And será exibido todos os tópicos
    And o botão será removido da tela
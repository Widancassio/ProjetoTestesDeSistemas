Feature: Como usu�rio Apple eu quero acessar o Manual do iPhone 
	para ter obter guia de uso do aparelho. 

@ts-prj-final @ManualiPhone
  Scenario: Visualizar manual do iPhone
	  Given o usu�rio acessa o site "apple.com.br"
	  When usu�rio clica no bot�o suporte
	  And clica no �cone iPhone    
	  And o usu�rio clica no bot�o Manual do usu�rio do iPhone
		Then � exibido o manual do iPhone. 

Feature: Como usu�rio Apple eu quero acessar a lista de programas de reparo e troca
	para saber quais programas est�o dispon�veis

@ts-prj-final @ListaProgramadeReparo
	Scenario: Visualizar lista de programas de extens�o de reparo e troca
		Given: o usu�rio acessa a �rea de suporte
		When: o usu�rio clica no bot�o todos os programas
		Then: � exibida a lista dos Programas de extens�o de reparo e troca

Feature: Como usu�rio Apple eu quero alterar o produto que receber� o suporte
	para que eu tenha o atendimento correto

@ts-prj-final @AlterarProdutoSuporte
  Scenario: Alterar produto que receber� suporte
	  Given o usu�rio acessa "https://getsupport.apple.com/"
	  And seleciona o produto �Mac�
	  When usu�rio clica no link Alterar produto               
	  And seleciona o novo produto
	  Then tela de suporte do novo produto � exibida
		
		
Feature: Alerta para suporte limitado nas terceirizadas 

@ts-prj-final @BuscaAssistenciaAutorizada
	Scenario: busca por assist�ncias autorizadas
		Given o usu�rio acessa a �rea de suporte
		When clica no bot�o Centro de Servi�o Autorizado Apple (AASP)
		And clica no bot�o servi�o e suporte
		Then � exibida a mensagem �As op��es de suporte da Apple est�o limitadas no momento. Agradecemos sua paci�ncia e compreens�o.�.

Feature: Como usu�rio Apple eu quero acessar a lista de lojas para 
	saber quais lojas est�o dispon�veis no Brasil

@ts-prj-final @BuscaPorLojas
  Scenario: Buscar por lojas no Brasil
	  Given o usu�rio realiza a busca por loja             
	  When o usu�rio clica no bot�o Encontre uma loja  
	  And clica em lista completa de lojas
	  Then � exibida a lista de lojas do brasil 

Feature: Como cliente Apple eu quero remover um produto da Sacola de compras
	para que a minha Sacola fique vazia

@ts-prj-final @RemoverProdutoSacola
  Scenario: Remover produto da sacola
    Given o usu�rio acessa a Sacola de compras
    And exista um produto na Sacola
    When usu�rio clicar no link Remover 
    Then � exibida tela com a mensagem ��Sua sacola est� vazia.�

Feature: Como cliente Apple eu quero adicionar um produto na Sacola de compras
	para que a minha Sacola seja preenchida com um produto

@ts-prj-final @AdicionarProdutoSacola
  Scenario: Adicionar produto na sacola
    Given o usu�rio acesse o produto Music
    And selecione o produto AirPods Pro
    When usu�rio clicar no bot�o Comprar
    And clicar no bot�o Colocar na sacola
    Then tela � exibida com o �Produto selecionado�.

Feature: Como cliente Apple eu quero selecionar apenas 2 personaliza��es ao produto
	para validar que o produto n�o ficar� dispon�vel para ser inserido a Sacola de compras

@ts-prj-final @ValidarBot�oDesabilitado
  Scenario: Validar que o bot�o �Colocar na sacola� n�o habilita se um campo obrigat�rio n�o estiver preenchido
    Given o usu�rio acesse o produto iPhone
    And selecione o produto iPhone 11 Pro
    When usu�rio clicar no bot�o Comprar
    And escolher o �Modelo�
    And escolher a �Cor�
    And n�o escolher a �Capacidade�
    Then o bot�o �Colocar na sacola� n�o � exibido

Feature: Como cliente Apple eu quero alterar a quantidade de produtos da Sacola de compras 
	para verificar o incremento no pre�o total

@ts-prj-final @AlterarQuantidadeProdutoSacola
  Scenario: Alterar quantidade de produtos da sacola
    Given o usu�rio acesse a Sacola de compras
    And exista um produto na Sacola
    When o usu�rio alterar a quantidade desejada do produto
    Then o valor total da compra � alterado
    And a quantidade de itens da Sacola da navbar � alterada.

Feature: Como cliente Apple eu quero limpar os filtros inseridos para que
	possa ser realizado um novo filtro

@ts-prj-final @ResetarFiltros
  Scenario: Limpar filtros de exibi��o do Newsroom
    Given o usu�rio acesse a pagina de Newsroom
    And clica em Arquivo
    And clica em um filtro por t�pico
                                                    #Ser� habilitado o bot�o resetar 
    When o usu�rio clica no bot�o resetar
    Then os filtros ser�o resetados 
    And ser� exibido todos os t�picos
    And o bot�o ser� removido da tela
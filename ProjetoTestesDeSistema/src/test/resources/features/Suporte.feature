Feature: Como usuario Apple eu quero acessar a area de suporte para obter ajuda. 


	Background: 
		Given o usuario acessa o site Apple
		And o usuario esteja na area de suporte

@ts-prj-final @ManualiPhone
  Scenario: Visualizar manual do iPhone
	  Given o usuario escolha o produto "IPhone"
	  When o usuario clica no botao Manual do usuario do iPhone
		Then e exibido o manual do iPhone. 


@ts-prj-final @ListaProgramadeReparo
	Scenario: Visualizar lista de programas de extensao de reparo e troca
		Given: 
		When: o usuario clica no botao todos os programas
		Then: e exibida a lista dos Programas de extensao de reparo e troca


@ts-prj-final @AlterarProdutoSuporte
  Scenario: Alterar produto que recebera suporte
	  Given o usuario escolha o produto "Mac"
	  And inicie uma solicitacao de servico
	  When usuario clica no link Alterar produto               
	  And seleciona o produto "IPad"
	  Then tela de suporte do "IPad" e exibida
		

@ts-prj-final @BuscaAssistenciaAutorizada
	Scenario: busca por assistencias autorizadas
		When usuario clica no botao Centro de Servico Autorizado Apple AASP
		And clica no botao servico e suporte
		Then e exibida uma mensagem de alerta






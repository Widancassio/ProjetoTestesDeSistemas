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
	  And seleciona o novo produto
	  Then tela de suporte do novo produto e exibida
		

@ts-prj-final @BuscaAssistenciaAutorizada
	Scenario: busca por assistencias autorizadas
		Given 
		When clica no botao Centro de Servico Autorizado Apple (AASP)
		And clica no botao servico e suporte
		Then e exibida a mensagem "As opcoes de suporte da Apple estao limitadas no momento. Agradecemos sua paciencia e compreensao."






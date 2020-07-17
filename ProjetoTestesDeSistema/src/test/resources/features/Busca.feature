
Feature: Como usuário Apple eu quero realizar buscas no site para facilitar o acesso mais rápido a itens.

@ts-prj-final @BuscaPorLojas
  Scenario: Buscar por lojas no Brasil
	  Given o usuario acessa o campo de busca             
	  When o usuario clica no link Encontre uma loja  
	  And clica em lista completa de lojas
	  Then e exibida a lista de lojas do brasil 
package stepDefinitions;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebDriver;

import auxiliares.Constantes;
import auxiliares.MetodosAuxiliares;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObjects.LojaPageObject;
import runner.GerenciadorDeDriver;

public class LojaStepDefinitions {

	private WebDriver driver = GerenciadorDeDriver.getDriver();
	private LojaPageObject lojaPageObj;
	private MetodosAuxiliares metValida = new MetodosAuxiliares();

	/**
	 * Backgrouds
	 * 
	 * Passos que são utilizados em todos os cenários da funcionalidade Suporte
	 */
	// esse step será executado sempre antes dos próximos pois o mesmo está definido
	// como background.
	@Given("usuario acesse o site Apple")
	public void usuarioAcessaSiteApple() {
		lojaPageObj = new LojaPageObject(driver);
		lojaPageObj.acessarPagina();
	}

	/**
	 * Metodos do cenário: Remover produto da sacola
	 * 
	 * @RemoverProdutoSacola
	 */
	@Given("exista um produto na Sacola")
	public void inserePdtSacola() {
		lojaPageObj.inserirProdutoSacola();
	}

	@Given("o usuario acessa a Sacola de compras")
	public void acessarSacola() {
		lojaPageObj.abrirSacola();
	}

	@When("usuario clicar no link Remover")
	public void removerItemSacola() {
		lojaPageObj.clicarLinkRemoverDaSacola();
	}

	@Then("e exibida tela com alerta de sacola vazia")
	public void validaSacolaVazia() throws InterruptedException {
		assertEquals("Sua sacola não está vazia", Constantes.MSG_SACOLA_VAZIA, lojaPageObj.alertaSacola());
	}

	/**
	 * Metodos do cenário: Adicionar produto na sacola
	 * 
	 * @AdicionarProdutoSacola
	 */
	// OBS: esse step é usado também no cenário @ValidarBotaoHabilitado
	@Given("o usuario acesse o produto {string}")
	public void acessarProduto(String produto) {
		lojaPageObj.selecionarProduto(produto);
	}

	@Given("selecione o produto {string} do Music")
	public void selecionarProdutoMusic(String produto) {
		lojaPageObj.selecionarPdtsMusic(produto);
	}

	@When("usuario clicar no botao Comprar")
	public void clicarComprarProduto() {
		lojaPageObj.clicarBtComprarPagDemo();
	}

	@When("clicar no botao Colocar na sacola")
	public void adicionarPdtSacola() {
		lojaPageObj.clicarBtColocarNaSacola();
	}

	@Then("tela e exibida com o Produto selecionado")
	public void validarProdutoSacola() {
		assertEquals("Header diferente do esperado!", Constantes.HEADER_SACOLA_COM_AIR_PODS_PRO,
				lojaPageObj.validaHeaderSacola());
		assertEquals("Produto diferente do esperado!", Constantes.PRODUTO_AIR_PODS_PRO_SACOLA,
				lojaPageObj.validaProdutoSacola());
	}

	/**
	 * Metodos do cenário: Validar que o botao Colocar na sacola habilita quando
	 * todos os campos obrigatorios estao preenchidos
	 * 
	 * @ValidarBotaoHabilitado
	 */
	@Given("selecione o produto {string} do iPhone")
	public void selecionarProdutoIPhone(String produto) {
		lojaPageObj.selecionarPdtsIPhone(produto);
	}

	@When("selecionar as informacoes do produto")
	public void selecionarInfoProdutoIPhone11() throws InterruptedException {
		lojaPageObj.personalizarIPhone11Pro();
	}

	@Then("o botao Colocar na sacola e exibido")
	public void validarBotaoColocarSacolaExibido() throws InterruptedException {
		lojaPageObj.validaBtColocaSacolaExibido();
	}

	/**
	 * Alterar quantidade de produtos da sacola
	 * 
	 * @AlterarQuantidadeProdutoSacola
	 */
	@When("o usuario alterar a quantidade desejada do produto")
	public void alterarQtdItens() {
		lojaPageObj.alterarQtdItensSacola();
	}

	@Then("o valor total da compra e alterado")
	public void validaValorTotalCompra() throws InterruptedException {
		assertEquals("Valor diferente do esperado", Constantes.VALOR_TOTAL_SACOLA, lojaPageObj.validarValorTotal());
	}

	@Then("a quantidade de itens da Sacola da navbar e alterada")
	public void validaQtdItensSacola() {
		assertEquals("Valor diferente do esperado", Constantes.QTD_ITENS_SACOLA, lojaPageObj.validarQtdItensSacola());
	}
}

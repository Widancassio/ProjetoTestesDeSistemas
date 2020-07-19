package auxiliares;

public class MetodosValidadores {

	String msgProduto;

	public String validaMsgProdutoSuporte(String produto) {
		if (produto.equals("Mac")) {
			msgProduto = Constantes.expectedMsgNovoPdtSuporteMac;
		} else if (produto.equals("IPad")) {
			msgProduto = Constantes.expectedMsgNovoPdtSuporteIPad;
		} else if (produto.equals("IPhone")) {
			msgProduto = Constantes.expectedMsgNovoPdtSuporteIPhone;
		} else if (produto.equals("Apple Watch")) {
			msgProduto = Constantes.expectedMsgNovoPdtSuporteAppleWatch;
		} else if (produto.equals("AirPods")) {
			msgProduto = Constantes.expectedMsgNovoPdtSuporteAirPods;
		}
		return msgProduto;
	}

}

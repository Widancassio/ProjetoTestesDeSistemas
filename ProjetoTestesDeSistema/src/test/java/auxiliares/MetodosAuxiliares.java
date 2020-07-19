package auxiliares;

import java.util.ArrayList;
import java.util.List;

public class MetodosAuxiliares {

	String msgProduto;
	List<String> programas = new ArrayList<String>();

	public String validaMsgProdutoSuporte(String produto) {
		if (produto.equals("Mac")) {
			msgProduto = Constantes.MsgNovoPdtSuporteMac;
		} else if (produto.equals("IPad")) {
			msgProduto = Constantes.MsgNovoPdtSuporteIPad;
		} else if (produto.equals("IPhone")) {
			msgProduto = Constantes.MsgNovoPdtSuporteIPhone;
		} else if (produto.equals("Apple Watch")) {
			msgProduto = Constantes.MsgNovoPdtSuporteAppleWatch;
		} else if (produto.equals("AirPods")) {
			msgProduto = Constantes.MsgNovoPdtSuporteAirPods;
		}
		return msgProduto;
	}

	public void preencherListaDeProgramas() {
		programas.add(Constantes.descricaoPrograma1);
		programas.add(Constantes.descricaoPrograma2);
		programas.add(Constantes.descricaoPrograma3);
		programas.add(Constantes.descricaoPrograma4);
		programas.add(Constantes.descricaoPrograma5);
		programas.add(Constantes.descricaoPrograma6);
		programas.add(Constantes.descricaoPrograma7);
		programas.add(Constantes.descricaoPrograma8);
		programas.add(Constantes.descricaoPrograma9);
		programas.add(Constantes.descricaoPrograma10);
		programas.add(Constantes.descricaoPrograma11);
		programas.add(Constantes.descricaoPrograma12);
		programas.add(Constantes.descricaoPrograma13);
		programas.add(Constantes.descricaoPrograma14);
	}

	public List<String> getProgramas() {
		return programas;
	}

}

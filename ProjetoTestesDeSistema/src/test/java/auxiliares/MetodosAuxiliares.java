package auxiliares;

import java.util.ArrayList;
import java.util.List;

public class MetodosAuxiliares {

	String msgProduto;
	List<String> programas = new ArrayList<String>();
	List<String> lojasBrasil = new ArrayList<String>();

	/**
	 * Metodos auxiliares para os cenários da funcionalidade Suporte
	 * 
	 * 
	 */
	public String validaMsgProdutoSuporte(String produto) {
		if (produto.equals("Mac")) {
			msgProduto = Constantes.MSG_NOVO_PDT_SUPORTE_MAC;
		} else if (produto.equals("IPad")) {
			msgProduto = Constantes.MSG_NOVO_PDT_SUPORTE_IPAD;
		} else if (produto.equals("IPhone")) {
			msgProduto = Constantes.MSG_NOVO_PDT_SUPORTE_IPHONE;
		} else if (produto.equals("Apple Watch")) {
			msgProduto = Constantes.MSG_NOVO_PDT_SUPORTE_APPLE_WATCH;
		} else if (produto.equals("AirPods")) {
			msgProduto = Constantes.MSG_NOVO_PDT_SUPORTE_AIRPODS;
		}
		return msgProduto;
	}

	public void preencherListaDeProgramas() {
		programas.add(Constantes.DESCRICAO_PROGRAMA_1);
		programas.add(Constantes.DESCRICAO_PROGRAMA_2);
		programas.add(Constantes.DESCRICAO_PROGRAMA_3);
		programas.add(Constantes.DESCRICAO_PROGRAMA_4);
		programas.add(Constantes.DESCRICAO_PROGRAMA_5);
		programas.add(Constantes.DESCRICAO_PROGRAMA_6);
		programas.add(Constantes.DESCRICAO_PROGRAMA_7);
		programas.add(Constantes.DESCRICAO_PROGRAMA_8);
		programas.add(Constantes.DESCRICAO_PROGRAMA_9);
		programas.add(Constantes.DESCRICAO_PROGRAMA_10);
		programas.add(Constantes.DESCRICAO_PROGRAMA_11);
		programas.add(Constantes.DESCRICAO_PROGRAMA_12);
		programas.add(Constantes.DESCRICAO_PROGRAMA_13);
		programas.add(Constantes.DESCRICAO_PROGRAMA_14);
	}

	public List<String> getProgramas() {
		return programas;
	}

	/**
	 * Metodos auxiliares para os cenários da funcionalidade Loja
	 * 
	 * 
	 */
	public void preencherListaLojasBrasil() {
		lojasBrasil.add(Constantes.LOJA_RJ);
		lojasBrasil.add(Constantes.LOJA_SP);
	}

	public List<String> getLojasBrasil() {
		return lojasBrasil;
	}
}

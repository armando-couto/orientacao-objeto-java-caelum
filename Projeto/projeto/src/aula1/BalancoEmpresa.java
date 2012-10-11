package aula1;

import java.util.HashMap;

public class BalancoEmpresa {

	private HashMap<String, Divida> dividas = new HashMap<String, Divida>();
	
	public void registrarDivida(String credor, String cnpjCredor, double valor) {
		Divida divida = new Divida();
		divida.setCredor(credor);
		divida.setCnpjCredor(cnpjCredor);
		divida.setTotal(valor);
		dividas.put(cnpjCredor, divida);
		dividas.put(cnpjCredor, divida);
	}
	
	public void pagaDivida(String cnpjCredor, double valor, String pagador, String cnpjPagador) {
		Divida divida = dividas.get(cnpjCredor);
		if (divida != null) {
			Pagamento pagamento = new Pagamento();
			pagamento.setPagador(pagador);
			pagamento.setCnpjPagador(cnpjPagador);
			pagamento.setValor(valor);
			divida.registra(pagamento);
		}
	}
	
	public void pagaDivida(String cnpjCredor, double valor) {
		Divida divida = dividas.get(cnpjCredor);
		if (divida != null) {
//			divida.paga(valor);
		}
	}
}

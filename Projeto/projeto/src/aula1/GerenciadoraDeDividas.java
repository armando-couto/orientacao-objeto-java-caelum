package aula1;

public class GerenciadoraDeDividas {

	public void efetuaPagamento(Divida divida, double valor, String pagador, String cnpjPagador) {
		Pagamento pagamento = new Pagamento();
		pagamento.setPagador(pagador);
		pagamento.setCnpjPagador(cnpjPagador);
		pagamento.setValor(valor);
		divida.registra(pagamento);
	}
	
	public void atualizaValorPagoDivida(Divida divida, double valor, String pagador, String cnpjPagador) {
		Pagamento pagamento = new Pagamento();
		pagamento.setPagador(pagador);
		pagamento.setCnpjPagador(cnpjPagador);
		pagamento.setValor(valor);
		divida.atualizar(pagamento, 0);
	}
}

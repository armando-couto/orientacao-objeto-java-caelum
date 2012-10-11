package aula1;

import java.util.ArrayList;
import java.util.HashMap;

public class Divida {

	private double total;
	private double valorPago;
	private String credor;
	private String cnpjCredor;
	private ArrayList<Pagamento> pagamentos = new ArrayList<Pagamento>();

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	// N�o pode ter o setValorPago, pois quebra encapilulamento.
	public double getValorPago() {
		return valorPago;
	}

	public String getCredor() {
		return credor;
	}

	public void setCredor(String credor) {
		this.credor = credor;
	}

	public String getCnpjCredor() {
		return cnpjCredor;
	}

	public void setCnpjCredor(String cnpjCredor) {
		this.cnpjCredor = cnpjCredor;
	}

	// N�o pode ter o setValorPago, pois quebra encapilulamento.
	public ArrayList<Pagamento> getPagamentos() {
		return pagamentos;
	}

	/**
	 * M�todo paga.
	 * 
	 * @param valor
	 */
	private void paga(double valor) {
		if (valor < 0) {
			throw new IllegalAccessError("Valor inv�lido para pagamento.");
		}
		if (valor > 100) {
			valor = valor - 8;
		}
		this.valorPago += valor;
	}

	/**
	 * M�todo registra
	 * 
	 * @param pagamento
	 */
	public void registra(Pagamento pagamento) {
		this.pagamentos.add(pagamento);
		this.paga(pagamento.getValor());
	}

	/**
	 * M�todo que atualiza valorPago.
	 * 
	 * @param pagamento
	 */
	public void atualizar(Pagamento pagamento, int posicao) {
		this.pagamentos.set(posicao, pagamento);
	}
}
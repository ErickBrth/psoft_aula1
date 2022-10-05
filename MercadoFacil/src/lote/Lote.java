package lote;
import java.util.Date;

import produto.Produto;

public class Lote {
	
	private int quantidade;
	private Date dataValidade;
	Produto produto;
	
	public Lote(int quantidade, Date dataValidade, Produto produto) {
		this.quantidade = quantidade;
		this.dataValidade = dataValidade;
		this.produto = produto;
	}
	
	public int getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
	public Date getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	@Override
	public String toString() {
		return "Lote [quantidade=" + quantidade + ", dataValidade=" + dataValidade + ", produto=" + produto + "]";
	}
	
	
}

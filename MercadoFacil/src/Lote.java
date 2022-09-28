

public class Lote {
	
	private int quantidade;
	private String dataValidade;
	Produto produto;
	
	public Lote(int quantidade, String dataValidade, Produto produto) {
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
	public String getDataValidade() {
		return dataValidade;
	}
	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	@Override
	public String toString() {
		return "Lote [quantidade=" + quantidade + ", dataValidade=" + dataValidade + ", produto=" + produto + "]";
	}
	
	
}

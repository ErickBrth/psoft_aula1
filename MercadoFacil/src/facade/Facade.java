package facade;
import java.util.Date;

import lote.Lote;
import produto.Produto;
import services.LoteService;
import services.ProdutoService;

public class Facade {
	private LoteService loteService = new LoteService();
	private ProdutoService prodService = new ProdutoService();
	
	public Produto criarProduto(String nome, String fabricante, double preco) {
		return this.prodService.criarProduto(nome, fabricante, preco);
	}
	
	public void salvarProduto(Produto produto) {
		this.prodService.salvarProduto(produto);
	}
	
	public String listarProdutos() {
		return this.prodService.listarProduto();
	}
	
	public Lote criarLote(int qtd, Date data, Produto prod) {
		return this.loteService.criarLote(qtd, data, prod);
	}
	
	public void salvarLote(Lote lote) {
		this.loteService.salvarLote(lote);
	}
	
	public void listarLote() {
		this.loteService.listarLotes();
	}
}

package services;
import repository.ProdutoRepository;
import produto.Produto;

public class ProdutoService {
	
	ProdutoRepository prodRepo = new ProdutoRepository();
	
	public Produto criarProduto(String nome, String fabricante, double preco) {
		Produto p = new Produto(nome,fabricante,preco);
		prodRepo.salvarProduto(p);
		return p;
	}
	
	public void salvarProduto(Produto produto) {
		this.prodRepo.salvarProduto(produto);
	}
	
	public String listarProduto() {
		return this.prodRepo.listarProdutos();
	}
}

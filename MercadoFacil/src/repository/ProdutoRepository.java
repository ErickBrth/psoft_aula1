package repository;
import java.util.HashSet;
import produto.Produto;

public class ProdutoRepository {
	HashSet<Produto> prodRepo;
	Produto prod;
	
	
	public ProdutoRepository() {
		prodRepo = new HashSet<Produto>();
	}
	
	
	public void salvarProduto(Produto prod){
		this.prodRepo.add(prod);
	}

	public String listarProdutos() {
		return "ProdutoRepository [prodRepo=" + prodRepo.toString() + "]";
	}	

}

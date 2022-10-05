package repository;

import java.util.HashSet;
import lote.Lote;


public class LoteRepository {
	HashSet<Lote> loteRepo;
	
	public LoteRepository() {
		loteRepo = new HashSet<Lote>();
	}
	
	
	public void salvarLote(Lote lote){
		this.loteRepo.add(lote);
	}

	public String listarLotes() {
		return "ProdutoRepository [prodRepo=" + loteRepo.toString() + "]";
	}	
}

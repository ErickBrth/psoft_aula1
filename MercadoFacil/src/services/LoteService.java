package services;
import repository.LoteRepository;

import java.util.Date;

import lote.Lote;
import produto.Produto;

public class LoteService {
	LoteRepository loteRepo = new LoteRepository();
	
	public Lote criarLote(int qtd, Date data, Produto prod) {
		Lote l = new Lote(qtd, data, prod);
		this.loteRepo.salvarLote(l);
		return l;
	}
	
	public void salvarLote(Lote lote) {
		this.loteRepo.salvarLote(lote);
	}
	public String listarLotes() {
		return this.loteRepo.listarLotes();
	}
}

package MercadoFacil;
import java.util.Date;

import facade.Facade;
import lote.Lote;
import produto.Produto;

public class Main {
	public static void main(String[] args) {
		
		Facade facade = new Facade();
		
		Produto p1 = facade.criarProduto("bike", "caloi", 100);
		
		Lote l1 = facade.criarLote(10, new Date(), p1);
		
		System.out.println(p1);
		System.out.println(l1);
		
		
		
		
	}
}

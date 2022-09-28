
public class Main {
	public static void main(String[] args) {
		Produto p1 = new Produto("Bike","caloi", 249);
		Lote l1 = new Lote(10,"26/01/2024",p1);
		System.out.println(p1);
		System.out.println(l1);
	}
}

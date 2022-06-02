
public class Escopo_e_inicializacao {

	public static void main(String[] args) {
		
		double price = 400.00; // price iniciado
		double discount; // discont não iniciado 
		
		if(price < 200.00) {
			discount = price *0.1;
		}
		else {
			discount = 0;
		}
		
		System.out.println(discount);
	}

}

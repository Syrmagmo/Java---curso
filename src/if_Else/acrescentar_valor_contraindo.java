package if_Else;
import java.util.Scanner;

public class acrescentar_valor_contraindo {

	public static void main(String[] args) {
			
			Scanner sc = new Scanner (System.in);
			
			int minutos = sc.nextInt();
			
			double conta = 50.0;
			
			if (minutos > 100) {
				conta += (minutos - 100) * 2.0;
				
				//conta = conta + (...)*2.0 e igual a 
				//conta += (...) *2.0
			}
			
			System.out.printf("Valor da conta = R$ %.2f%n", conta);
			
		}


}

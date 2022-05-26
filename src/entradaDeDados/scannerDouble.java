package entradaDeDados;
import java.util.Scanner;

public class scannerDouble {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double y;
		y = sc.nextDouble();
	
		System.out.println("Voce digitou: " + y);
		
		sc.close();
	}

}

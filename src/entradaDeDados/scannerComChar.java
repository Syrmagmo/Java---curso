package entradaDeDados;
import java.util.Scanner;

public class scannerComChar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		char y;
		y = sc.next().charAt(0);
	
		System.out.println("Voce digitou: " + y);
	}

}

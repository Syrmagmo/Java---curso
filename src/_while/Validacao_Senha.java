package _while;
import java.util.Scanner;

public class Validacao_Senha {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		x = sc.nextInt();
		
		while (x != 2002) {
			System.out.println("Senha Invalida");
			x = sc.nextInt();
			}
	
			System.out.println("Acesso Permitido");
	}

}

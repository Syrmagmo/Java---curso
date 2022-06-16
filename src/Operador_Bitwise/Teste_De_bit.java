package Operador_Bitwise;
import java.util.Scanner;

public class Teste_De_bit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int mask = 32; // cujo numero é 
					   // 0b<Numero binario>
					   // 0b00100000 <32>
		int n = sc.nextInt();
		
		if ((n & mask) != 0 ) {
			System.out.println("6th bit is true!");
		} else {
			System.out.println("6th bit is false!");
		}
	}

}

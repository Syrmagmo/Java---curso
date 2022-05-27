package if_Else;

import java.util.Scanner;

public class if_Else {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.println("bom dia");
		}
		else {
			System.out.println("boa tarde");
		}
	}
}

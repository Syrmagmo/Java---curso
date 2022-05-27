package if_Else;

import java.util.Scanner;

public class encadea_Mento_De_If_Else {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int hora;
		
		System.out.println("Quantas horas?");
		hora = sc.nextInt();
		
		if(hora < 12) {
			System.out.println("bom dia");
		}
		else if(hora < 18 ) { // como temos um encadeamento pode-se apagar as chaves do else e juntar com a linha do if
			System.out.println("boa tarde");
		}
		else {
			System.out.println("boa noite");
		}
		
		
		
		sc.close();
	}

}

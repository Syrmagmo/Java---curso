package expressao_condicional_ternaria;

import java.io.InputStream;
import java.util.Scanner;

public class atribuindo_desconto {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double preco = 34.5;
		double desconto = (preco < 20) ? preco * 0.1 : preco * 0.05;
		// A Forma de escrever contraido 
		// é possivel atraves da formula 
		// double NOME = (Valor < ou > Valor)? valorVerdade : ValorMentira
		// é preciso colocar o )? para poder realizar a formula  
		System.out.println(desconto);
	}
}

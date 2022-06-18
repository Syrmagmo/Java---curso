package Extras;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Olá mundo!");
		System.out.println("Bom dia!");

		int y = 32;
		System.out.println(y);
		
		double x = 10.35784;
		System.out.printf("%.2f\n", x);
		System.out.printf("%.4f\n", x);
		
		Locale.setDefault(Locale.US); // para mudar a formatação de , para . 
		System.out.printf("%.4f\n", x);
		
		System.out.println("Resultado = " + x + " metros");
		System.out.printf("Resultado = %.2f metros %n", x); // serve para concatenar varios elementos em um mesmo comando de escrita, o valor entra no lugar da %f
		
		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;
		System.out.printf("%s tem %d anos e ganha R$ %.2f%n", nome, idade, renda);
		//%f para pontos flutuantes 
		//%d inteiros
		//%s texto
		//%n quebra de linha
		
	}

}

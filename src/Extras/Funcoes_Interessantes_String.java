package Extras;

public class Funcoes_Interessantes_String {

	public static void main(String[] args) {
		
		String original = "abcde FGHIJ ABC abc DEFG";
		
		String s01 = original.toLowerCase();
		// <Serve para deixar todas letras minusculas>
		String s02 = original.toUpperCase();
		//<Serve para deixar todas letras maiusculas>
		String s03 = original.trim();
		// <Serve para apagar os espaços a mais >
		String s04 = original.substring(2);
		//<Serve para utilizar a String a partir da casa decimal no caso 2>
		String s05 = original.substring(2, 9);
		// <Serve para utilizar a String a partir da casa decimal no caso 2, com o limite de 9 casas>
		String s06 = original.replace('a', 'x');
		String s07 = original.replace("abc", "xyz");		
		// <Serve para substituir os caracteres indicados no caso 'a' por 'x'>
		int s08 = original.indexOf("bc");
		int s09 = original.lastIndexOf('a', 'x');
		//  <Serve para acusar a ocorrencia do caracter >

		System.out.println("Original: - "+ original + " - ");
		System.out.println("toLowerCase: - " + s01+ " - ");
		System.out.println("toUpperCase: - " + s02+ " - ");
		System.out.println("Trim: - " + s03 + " - ");	
		System.out.println("substring(2): - " + s04 + " - ");
		System.out.println("substring(2,9): - " + s05 + " - ");
		System.out.println("Replace('a', 'x'): - " + s06 + " - ");
		System.out.println("Replace('abc', 'xyz'): - " + s07+ " - ");
		System.out.println("Index of 'bc: - " + s08+ " - ");
		System.out.println("Last Index of 'bc: - " + s09+ " - ");
		
	}

}

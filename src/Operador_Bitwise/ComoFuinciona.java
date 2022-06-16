package Operador_Bitwise;

public class ComoFuinciona {

	public static void main(String[] args) {
		
		// & "e" bit a bit
		// c1 c2  c1 E c2
		// F   F     F
		// F   V     F
		// V   F     F
		// V   V     V
		
		// | "ou" bit a bit
		// c1 c2  c1 E c2
		// F   F     F
		// F   V     V
		// V   F     V
		// V   V     V
		
		// ^ "ou-exclusivo"bit a bit
		// c1 c2  c1 E c2
		// F   F     F
		// F   V     V
		// V   F     V
		// V   V     F
		
		int n1 = 89;
		int n2 = 60;
		System.out.println(n1 & n2);
		System.out.println(n1 | n2);
		System.out.println(n1 ^ n2);
	}

}

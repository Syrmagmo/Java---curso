package ordenacao;
import java.util.Arrays;
public class ordenacao {

	public static void main(String[] args) {
		/*
		 * ConcatenaVetorPrimitivoMesmoTamanho.java
		 * 
		 *       0  1  2  3
		 * a = { 1, 3, 5, 7 } // 4
		 * b = { 2, 4, 6, 8 } // 4
		 * 
		 * c = { 1, 3, 5, 7, 2, 4, 6, 8 } // 8 ( 4 + 4 )
		 *       0  1  2  3  4  5  6  7
		 *      a0 a1 a2 a3  b0 b1 b2 b3 
		 * 
		 */

				int[] a = { 1, 3, 5, 7 };
				int[] b = { 2, 4, 6, 8, 10, 12 };
				
				imprime ( a );
				imprime ( b );
				
				int[] c = concatena ( a, b );
				
				imprime ( c );
				
			}
			
			//
			static int[] concatena ( int[] a, int[] b ) {
				
				int[] c = new int[a.length * 2];
				
				for ( int atual = 0, posicao = 0 ; atual < a.length ; atual++ ) {
					
					c[atual]            = a[posicao];
					c[atual + a.length] = b[posicao];
					//         offset (deslocamento)
					
					posicao++;
				}
				
				return c;
			}

			
			//
			static void imprime ( int[] vetor ) {
				
				System.out.print("(" + vetor.length + ") ");
				System.out.println( Arrays.toString( vetor ) );
				
				System.out.println();
			}

	}


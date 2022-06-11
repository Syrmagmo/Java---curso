package ordenacao;

/*
 * OrdenaNovoQuantidadeDeAlunoEmSala.java
 * 
 */
 
import java.util.Arrays;

public class OrdenaNovoQuantidadeDeAlunoEmSala {
	
	static int contador = 0;
	
	public static void main (String[] args) {
		
		//int[] alunos = { 47, 27, 27, 17, 17 };
		int[] alunos = { 800, 19, 32, 21, 25, 1 };
		
		imprime ( alunos );
		
		ordena ( alunos, 0, alunos.length );
		
		imprime ( alunos );
		
		System.out.println("\nQuantidade de iteracoes: " + contador );
	}
	
	//
	static void ordena ( int[] vetor, int inicio, int termino ) {
		
		for ( int atual = inicio ; atual < termino - 1 ; atual++ ) {
			
			for ( int posicao = inicio ; posicao < termino - 1 ; posicao++ ) {
				
				contador++;
				
				// LOG
				System.out.print("\tvetor[" + posicao + "]: " + vetor [posicao] +
								 " > vetor[" + (posicao + 1) + "]: " + vetor[posicao+1]);
				
				if ( vetor [ posicao ] > vetor [ posicao + 1 ]) {
					
					// LOG
					System.out.print("\t ### TROCOU!!!");
					
					troca ( vetor, posicao, posicao + 1 );
				}
				
				
				// LOG
				System.out.print("\n> ");
				imprime ( vetor );
			}
			System.out.println("-------------\n");
		}
		
	}
	
	//
	static void troca ( int[] vetor, int origem, int destino ) {
		
		int valorOrigem  = vetor [ origem ];
		int valorDestino = vetor [ destino ];
		
		vetor [ origem ]  = valorDestino;
		vetor [ destino ] = valorOrigem;
	}
	
	//
	static void imprime ( int[] vetor ) {
		
		System.out.println( Arrays.toString( vetor ) );
		
		System.out.println();
	}
}

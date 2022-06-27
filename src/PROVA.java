import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class PROVA {

	public static void main(String[] args) {
		//	int array[] = new int [100];
		//	int array[] = new int [1000];
		//	int array[] = new int [100000];
			int array[] = new int [500000];
		//	int array[] = new int [1000000];


		int valorDoElemento = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			// array[i] = (int) (Math.random() * 1000) + 1;
			// array[i] = i; //CRESCENTE
			 array[i] = valorDoElemento--; //DECRESCENTE
		}

		Instant instantInicial = Instant.now();

		// selection(array);
		// selectionDecrescente(array);
		// insertion(array);
		// insertionDecrescente(array);
		// bubble(array);
		// bubbleDecrescente(array);
		// mergeSort(array, array, 0, array.length -1);
		// quickSort(array, 0, array.length -1); // Um dos metodos mais rapidos de ordenação
		 arraySort(array);

		Instant instantFinal = Instant.now();
		Duration duracao = Duration.between(instantInicial, instantFinal);
		//imprime(array);
		System.out.println("Executado em = " + duracao.toMillis() + "MS");

	}

	static void imprime(int[] lista) {
		System.out.println(Arrays.toString(lista));
	}
	
	public static void selection(int array[]) {
		  for (int fixo = 0; fixo < array.length - 1; fixo++) {
			    int menor = fixo;

			    for (int i = menor + 1; i < array.length; i++) {
			       if (array[i] < array[menor]) {
			          menor = i;
			       }
			    }
			    if (menor != fixo) {
			      int t = array[fixo];
			      array[fixo] = array[menor];
			      array[menor] = t;
			    }
			  }
			}
	
	public static void selectionDecrescente(int array[]) {
			for (int fixo = 0; fixo < array.length - 1; fixo++) {
				  int menor = fixo;
		  for (int i = menor + 1; i < array.length; i++) {
				 if (array[i] > array[menor]) {
					menor = i;
				 }
			  }
			  if (menor != fixo) {
				int t = array[fixo];
				array[fixo] = array[menor];
				array[menor] = t;
			  }
			}
		  }
			
	public static void insertion(int array[]) {
		 int j;
		    int key;
		    int i;

		    for (j = 1; j < array.length; j++)
		    {
		      key = array[j];
		      for (i = j - 1; (i >= 0) && (array[i] > key); i--)
		      {
		    	  array[i + 1] = array[i];
		       }
		      array[i + 1] = key;
		    }
		}
		
	public static void insertionDecrescente(int array[]) {
		 int j;
		    int key;
		    int i;

		    for (j = 1; j < array.length; j++)
		    {
		      key = array[j];
		      for (i = j - 1; (i >= 0) && (array[i] < key); i--)
		      {
		    	  array[i + 1] = array[i];
		       }
		      array[i + 1] = key;
		    }
		}

	public static void bubble(int[] vetor) {

		boolean controle;
		for (int i = 0; i < vetor.length; i++) {
			controle = true;
			for (int j = 0; j < (vetor.length - 1); j++) {

				if (vetor[j] > vetor[j + 1]) 
				{
					int aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
					controle = false;
				}
				;
			}			
		}
	}

	public static void bubbleDecrescente(int[] vetor) {

		boolean controle;
		for (int i = 0; i < vetor.length; i++) {
			controle = true;
			for (int j = 0; j < (vetor.length - 1); j++) {

				if (vetor[j] < vetor[j + 1]) 
				{
					int aux = vetor[j];
					vetor[j] = vetor[j + 1];
					vetor[j + 1] = aux;
					controle = false;
				}
				;
			}			
		}
	}

	public static void mergeSort(int[] vetor, int[] aux, int inicio, int fim) {
		if(inicio<fim)
		{
			int meio = (inicio + fim) / 2;
			mergeSort(vetor, aux, inicio, meio);
			mergeSort(vetor, aux, meio+1, fim);
			intercalar(vetor, aux, inicio, meio, fim);
		}
	}
		private static void intercalar(int[] vetor, int[] aux, int inicio, int meio, int fim) {
			for(int i = inicio; i <= fim; i++)
			{
				aux[i] = vetor[i];
			}
			int esq = inicio;
			int dir = meio+1;

			for(int i=inicio; i<=fim; i++)
			{
				if(esq > meio)
				{
					vetor[i] = aux[dir++];
				} 
				else if (dir > fim)
				{
					vetor[i] = aux[esq++];
				}
				else if(aux[esq] < aux[dir])
				{
					vetor[i] = aux[esq++];
				}
				else
				{
					vetor[i] = aux[dir++];
				}
			}
		}

	public  static void quickSort ( int[] vetor, int inicio, int termino ) {
			if(inicio < termino){
			int q = particao(vetor, inicio, termino);
			  quickSort(vetor, inicio, q);
			  quickSort(vetor, q + 1 , termino);
			}
		  }
	public static void troca ( int[] vetor, int origem, int destino ) {
		int aux = vetor[origem];
		vetor[origem] = vetor[destino];
		vetor[destino] = aux;
		}	
		public static int particao(int vetor[], int inicio, int termino){
		int pivo = vetor[(inicio + termino)/2];
		int i = inicio - 1;
		int aux = termino + 1;
			while( i < aux){
				do
				{
					aux = aux - 1;
			  	}
			  while (vetor[aux] > pivo);
				do
				{
				  i = i + 1;
				}
				while (vetor[i] < pivo );
				  if(i < aux ) troca (vetor , i , aux );
				}
				return aux;
			}
	
	public static void arraySort(int[] vetor) {
		Arrays.sort(vetor);
	}
}

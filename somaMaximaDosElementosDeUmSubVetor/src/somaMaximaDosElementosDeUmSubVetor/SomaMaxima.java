package somaMaximaDosElementosDeUmSubVetor;

public class SomaMaxima {
	
	
		public  int SomaMaximaSubVet( int tamanhoSubVetor,int valoresDovetPrincipal[]) { // metodo que rretorna um array
					
			 // Vetor para armazenar os resultados da média móvel
				       
			int [] vetorDosValoresSomados = new int[valoresDovetPrincipal.length - tamanhoSubVetor + 1];
			
			int somaMax=Integer.MIN_VALUE; // essa inicialização da variavel, permiti que ela aceite valores menor que 0, ja que ela vai ser usada em um teste, pra achar o maior valor, e o retultado maior valor pode ser menor que 0, e isso dependendo do teste pode causar um erro, 
			// exemplo if(somaMax < -5){somaMax = -5} porem nesse teste somaMax vale 0, que é maior que -5 então ela não faria essa atribuição de valor de -5 a somaMax
			
			int somaMaxDeRetorno = 0;
			int somaProvisoriaDeSaida= 0;
			
			 
			
			
	     
	       
	       
	     
	        // Calculando a média móvel para cada posição no vetor
			
	        for (int i = 0; i <= valoresDovetPrincipal.length - tamanhoSubVetor; i++) {
	            int soma = 0; // essa linha sempre vai zerar a variavel soma, caso ela ja tenha algum valor, antes dela entrar no laço do for com j
	            
	            for (int j = i; j < i + tamanhoSubVetor; j++) { // obs: j sempre começa valendo i, mais durante a iteração no for(2) ou  for com j, j vai mudar de valor e i vai continuar com o valor definido na iteração do primeiro for até que o loop desse laço  do primeiro for se conclua, assim havera a iteração em i e acontecera i++ e i mudara de valor
	            	System.out.println("o valor do veotor na posição "+ j + "=" + valoresDovetPrincipal[j] );
	            	
	                soma += valoresDovetPrincipal[j]; // fara a soma dos dos valores do do vetor principal,de acordo com a quantidade de indice do subvetor e o resultado sera armazenado na variavel soma
	                System.out.println("o valor da variavel soma na iteração J = "+j+" = " + soma);
	            }
	            vetorDosValoresSomados[i] = soma ; // o resultado da soma sera armazenado na posição i do vetor
	            
	            
	        }
	        
	        // aqui vamos testar os valores para encontrar a soma maxima, de um sub vetor
	        for(int i = 0; i < vetorDosValoresSomados.length ;i++) {
				
				
	        	somaProvisoriaDeSaida = vetorDosValoresSomados[i];
	        	System.out.println("o valor da varivel somaProvisoriaDeSaida  na iteração i = " +i+" do teste para encontrar a soma maxima = " + somaProvisoriaDeSaida);
		
					
				
				if(somaMax < somaProvisoriaDeSaida ) { // compara se o valor armazenado em maiormedia é menor que o valor armazenado em media, caso sim:
					somaMax = somaProvisoriaDeSaida; // atribuo  o valor de media em maiormedia
				}else {
					somaMax = somaMax;
					
				}
								
							
							
			}
	       
	        somaMaxDeRetorno = somaMax;
	        return somaMaxDeRetorno;
			
			

		}
}
	


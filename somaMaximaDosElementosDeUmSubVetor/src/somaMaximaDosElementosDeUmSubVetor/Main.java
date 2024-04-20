package somaMaximaDosElementosDeUmSubVetor;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SomaMaxima somamaxSubVet = new SomaMaxima();
		System.out.println("Soma Maxima");
		
		
				// TODO Auto-generated method stub
			double valoresDoVetorPrincipal [];
			int tamanhoDovetorPrincipal, tamanhoDoSubVetor = 0  ;
			
			
			
			
			Scanner entrada = new Scanner(System.in);
			System.out.println("soma maxima dos dos valore de uma vetor separados em subvetores ");
			
			// aqui sera recebido o valor que definira o tamanho do vetor, pois o tamanho do vetor representara a quantidade de medições que sera feito da temperatura
			System.out.println("\n informea o tamanho do veotor principal");
			tamanhoDovetorPrincipal = entrada.nextInt();
			valoresDoVetorPrincipal = new double[tamanhoDovetorPrincipal];
			
			System.out.println("agora informe os valores de que sera armazenado no vetor principal, pode ser positivos ou negativos ou ambos");
			
			for(int i = 0; i < tamanhoDovetorPrincipal;i++) {
				System.out.println("informe o valor do indic "+ i);
				valoresDoVetorPrincipal[i]=entrada.nextDouble();
			}
			
	System.out.println("\n informe o tamanho do sub vetor");
			
			 tamanhoDoSubVetor  = entrada.nextInt();
			
			double result =  somamaxSubVet.SomaMaximaSubVet(tamanhoDoSubVetor,valoresDoVetorPrincipal);
			
			
			System.out.println("o retorno da função SomaMaximaSubVet para a soma maxima de um sub vetor é = "+ result);
			
		}
	}



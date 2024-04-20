package conjecturaDeCollatz;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		ConjecturaDeCollatz proximoElement = new ConjecturaDeCollatz();
		
		System.out.println("CONJECTURA DE COLLATZ \n");
		
		System.out.println("informe um numero natural para a entrada:");
		int entrada = scanner.nextInt();
		
		int result = proximoElement.RecebeValorIndicadoDevolveQuantNumeroDaSequenciaGerada(entrada);
		
	
		System.out.println("resultado da conjectura de collatz para a entrada "+ entrada + " é " +  result +"\n");
		
		System.out.println("Maior numero da sequencia gerada da CONJECTURA DE COLLATZ");
		
		int maiorNumero = proximoElement.RecebeValorInicialDevolveMaiorNumeroDaSequenciaGerada(entrada);
		
		System.out.println("maior numero da sequenci gerada pela entrada "+entrada+ " é " +maiorNumero);
		

	}

}

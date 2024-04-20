package cifraDeCesar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Solução para o probléma Cifra de Cesar");
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("informe a mensagem encriptada");
		String mensagemEncriptada = scanner.nextLine();
		
		System.out.println("informe a palavra conhecida");
		String palavraConhecida = scanner.nextLine();
		
		
		/* teste para ver se a entrada de dados esta funcionando bem*/
		//System.out.println("msg encipt = " + mensagemEncriptada + "\n palavra conhecida = " + palavraConhecida);
		
		CesarBreaker breaker = new  CesarBreaker();
		String mensagemOriginal = breaker.QuebrarCodigo(mensagemEncriptada, palavraConhecida);
		
		 
	 System.out.println(mensagemOriginal);	
	 
	 // palavras encriptada para teste  
	 
	 // mensagem: acelere sua carreira  emcriptada  = Zbdkdqd  rtz bzqqdhqz
	 // palavra conhecida = sua
	 
	 // mensagem: me chamo jairo = zr punzb wnveb
	 // palavra conhecida = me 
		
	}
	
	
	
}

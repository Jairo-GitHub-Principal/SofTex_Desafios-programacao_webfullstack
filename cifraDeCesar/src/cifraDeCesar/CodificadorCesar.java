package cifraDeCesar;

public class CodificadorCesar implements Codificador {

	public CodificadorCesar() {
		// TODO Auto-generated constructor stub
	}
	
	// metodo  Encriptador
@Override	
public String encriptar(String mensagem, int deslocamento) { // metodo codigicador que fara a encriptação da mensagem
	char c;
	StringBuilder cifrado = new StringBuilder();
	
	for (char letra:mensagem.toCharArray()) {
		if(Character.isUpperCase(letra)) {
			c = (char)(Math.floorMod(letra -'A'+ deslocamento, 26)+'A');
		}else if(Character.isLowerCase(letra)) {
			c = (char)(Math.floorMod(letra -'a'+ deslocamento, 26)+'a');
		}else { 
			c= letra;
		}
			
		cifrado.append(c);
		
		//System.out.println(cifrado);
	}
	return cifrado.toString(); // retorna uma string com o texto cifrado
}
	
// Metodo desencriptador
@Override
	public String decriptar(String mensagemCodificada, int deslocamento) {// metodo fara a decodificação da mensagem encriptada , pega o retonr de encriptar, vais o processo reverso para descriptografa a msg criptografada
			
		String retorno = encriptar(mensagemCodificada, deslocamento * -1);
		
		//System.out.println(retorno);
		

		return encriptar(mensagemCodificada, -1 * deslocamento);
	} 
}

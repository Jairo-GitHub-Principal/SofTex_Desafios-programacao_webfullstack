package cifraDeCesar;

public interface Codificador { // interface codificador que tera seus metodos implementados na classe CodificadorCesar
	
	 String encriptar(String mensagem, int chave); // metodo que fara a encriptação da mensagem ou seja recebera a msg e fara a encriptação da mesma
	
	 String decriptar(String mensagemCodificada, int chave); // metodo fara a decodificação da mensagem encriptada 
	
}

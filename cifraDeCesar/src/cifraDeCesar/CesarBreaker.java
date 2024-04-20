 package cifraDeCesar;

public class CesarBreaker {

	
	
	public String QuebrarCodigo(String mensagemEncriptada,String palavraConhecida) {
		
		CodificadorCesar cesar = new CodificadorCesar();
		
		for(int i = 0;i < 26;i++) {
			String mensagemOriginal = cesar.decriptar(mensagemEncriptada, i);
			if(mensagemOriginal.contains(palavraConhecida)) {
				return mensagemOriginal;
			}
		}
		return "";
		
		
		
	}

}

package conjecturaDeCollatz;

public class ConjecturaDeCollatz {
	
	SequenciageradaMaiorNumeroDaSequencia saida = new SequenciageradaMaiorNumeroDaSequencia();
	
	
	int saidaSequenciaGerada, maiorNumeroDaSequencia = 0;
	int quantSaida = 0;
	
	
	public int RecebeValorIndicadoDevolveQuantNumeroDaSequenciaGerada(int n) {
		int entrada = n;
		


			
				
				
				 saidaSequenciaGerada = saida.SequenciaGerada(entrada);
									
				
			
			
		
		
		
		 
				
			return saidaSequenciaGerada;
			
		
	}
		
	
	
	
		
		
		public int RecebeValorInicialDevolveMaiorNumeroDaSequenciaGerada(int entrada){
			maiorNumeroDaSequencia = saida.MaiorNumeroDaSequenciaGerada(entrada);
			
		return maiorNumeroDaSequencia ;
		
	}

}

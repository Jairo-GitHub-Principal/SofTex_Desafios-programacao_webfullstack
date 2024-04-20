package conjecturaDeCollatz;

public class SequenciageradaMaiorNumeroDaSequencia {
	int proximoElemento,elementodesaida = 0;
	int  maiorNumeroDaSequencia,numerosGeradosDaSequencia = 10;
	
	int saidaGerada = 1;
	
	public int SequenciaGerada( int entrada) {
		proximoElemento = entrada;
		
		for(saidaGerada = 1; proximoElemento > 1 ;) {
		
			if(proximoElemento % 2 !=0) {
			proximoElemento = (3 * proximoElemento)+ 1;
			
			elementodesaida = proximoElemento;
			
			 System.out.println("elemento atual= " + elementodesaida);
			
		}else{
			proximoElemento = proximoElemento/2;
			
			elementodesaida = proximoElemento;
			
			 System.out.println("elemento atual= " + elementodesaida);
			
		}
		 
		
		 saidaGerada++;
		 
		 System.out.println(" quantidade de saidaas geradas = " + saidaGerada);
		
		
		}
		
				
		return elementodesaida;
			
	}
	
	
	
	public int MaiorNumeroDaSequenciaGerada(int entrada) {
		
		proximoElemento = entrada;
		
		
		for(saidaGerada = 1; proximoElemento > 1 ;) {
		
			if(proximoElemento % 2 !=0) {
			proximoElemento = (3 * proximoElemento)+ 1;
								
			elementodesaida = proximoElemento;
			
			
			numerosGeradosDaSequencia = elementodesaida;
			
			
		}else{
			proximoElemento = proximoElemento/2;
			
			elementodesaida = proximoElemento;
			
			
			numerosGeradosDaSequencia = elementodesaida;
			
			
		}
			
			
			if(maiorNumeroDaSequencia > numerosGeradosDaSequencia) {
				maiorNumeroDaSequencia = maiorNumeroDaSequencia;
			}else {
				maiorNumeroDaSequencia = numerosGeradosDaSequencia;
			}
		 
			
			
		 saidaGerada++;
		 
		
		
		
		}
		
		
		return maiorNumeroDaSequencia;
		
	}

}

package mediaMoveltemperatura;

public class Main {
	
    public static void main(String[] args) {
        // Vetor de entrada
        double[] vetor = {3, 4, 8, 9, -2, -1, -3};

        // Tamanho da janela da média móvel
        int tamanhoJanela = 3;
        
        // Calculando a média móvel
        double[] mediaMovel = calcularMediaMovel(vetor, tamanhoJanela);

        // Imprimindo a média móvel
        System.out.println("Média móvel:");
        for (double valor : mediaMovel) {
            System.out.println(valor);
        }
    }

    public static double[] calcularMediaMovel(double[] vetor, int tamanhoJanela) {
        // Vetor para armazenar os resultados da média móvel
        double[] mediaMovel = new double[vetor.length - tamanhoJanela + 1];
        double mediaMax = 0;
        double mediaMin = 10/0.0;
        double media = 0;
        double[]mediaSaida = new double[2];

        // Calculando a média móvel para cada posição no vetor
        for (int i = 0; i <= vetor.length - tamanhoJanela; i++) {
            double soma = 0; // essa linha sempre vai zerar a variavel soma, caso ela ja tenha algum valor, antes dela entrar no laço do for com j
            for (int j = i; j < i + tamanhoJanela; j++) { // obs: j sempre começa valendo i, mais durante a iteração no for(2) ou  for com j, j vai mudar de valor e i vai continuar com o valor definido na iteração do primeiro for até que o loop desse laço  do primeiro for se conclua, assim havera a iteração em i e acontecera i++ e i mudara de valor 
                soma += vetor[j];
            }
            mediaMovel[i] = soma / tamanhoJanela;
            
            
        }
        
        for(int i = 0; i < mediaMovel.length ;i++) {
			
			
			media = mediaMovel[i];
	
				
			
			if(mediaMax < media) { // compara se o valor armazenado em maiormedia é menor que o valor armazenado em media, caso sim:
				mediaMax = media; // atribuo  o valor de media em maiormedia
			}else {
				mediaMax = mediaMax;
				
			}
			
			
			if(mediaMin > media) { // aqui é o contrario do de cima, aqui sera encontrado a menor media
				mediaMin = media;
			}else {
				mediaMin = mediaMin;
				
			}
						
						
		}
        mediaSaida[0]= Math.floor(mediaMax);
        mediaSaida[1] = Math.floor(mediaMin);
        return mediaSaida;
    }
}
 
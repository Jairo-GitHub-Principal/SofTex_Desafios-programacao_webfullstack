package mediaDeTemperaturasAcada3minutos;

import java.util.Scanner;

public class Main {
	
	public static CalcularMediaDeTemperatura calcmediatemp = new CalcularMediaDeTemperatura();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double vetTemperaturas [];
		
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Média de temperatura que sera lida em um determinado periodo,\n durante uma quandidade finita de vzs ");
		
		// aqui sera recebido o valor que definira o tamanho do vetor, pois o tamanho do vetor representara a quantidade de medições que sera feito da temperatura
		System.out.println("\n informea quantidade de medições");
		
		int tamanhoDoVetor = entrada.nextInt();
		vetTemperaturas = new double[tamanhoDoVetor];
		
		System.out.println("agora informe os valores de temperaturas");
		
		for(int i = 0; i < tamanhoDoVetor;i++) {
			System.out.println("informe a temperatura do indic"+ i);
			vetTemperaturas[i]=entrada.nextDouble();
		}
		
System.out.println("\n informe o tempo esperado entre as leituras de temperaduta exemplo: 3 para 3 minutos");
		
		int tempoEntreAsLeituras  = entrada.nextInt();
		
		double[] result =  calcmediatemp.CalcularMediaTemp(tempoEntreAsLeituras,vetTemperaturas);
		
		System.out.println("o retorno da função CalcularMediaDeTemperatura para Maior Média = "+ result[0]);
		System.out.println("o retorno da função CalcularMediaDeTemperatura par menor Média = "+ result[1]);
		
	}

}

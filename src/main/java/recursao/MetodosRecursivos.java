package recursao;

import java.util.Arrays;

public class MetodosRecursivos {

	public int calcularSomaArray(int[] array){
		if (array.length == 1) {
			return array[0];
		} else {
			return (array[0] + calcularSomaArray(Arrays.copyOfRange(array, 1, array.length)));
		}
	}
	
	
	public long calcularFatorial(int n) {
		if (n == 0) {
			System.out.println(n + "! = " + 1);
			return 1;
		} else {
			long resp = (n * calcularFatorial(n - 1));
			System.out.println(n + "! = " + resp);
			return resp;
		}
	}

	public int calcularFibonacci(int n) {
		int resp;
		if (n == 0 || n == 1) {
			resp = 1;
		} else {
			resp = calcularFibonacci(n - 1) + calcularFibonacci(n - 2);
		}
		
		return resp;
		
		// TODO ESCREVA AQUI O CÓDIGO (USANDO RECURSAO) PARA CALCULAR E IMPRIMIR
		// O N-ESIMO TERMO
		// DA SEQUENCIA DE FIBONACCI, QUE TEM A SEGUINTE LEI DE FORMACAO: O
		// PRIMEIRO E SEGUNDO NUMEROS
		// DA SEQUENCIA SÃO 1. A PARTIR DO TERCEIRO TERMO, CADA TERMO DA
		// SEQUENCIA É DADO
		// PELA SOMA DOS OUTROS DOIS ANTERIORES. OBSERVE QUE SENDO O METODO
		// RECURSIVO, O FIBONACCI DOS NUMEROS ANTERIORES TAMBEM VAO SER
		// IMPRESSOS
		
	}

	public int countNotNull(Object[] array) {
		int soma = 0;
		int resp = countNotNullRec(array, soma);
		return resp;
		// TODO IMPLEMENTE AQUI O CODIGO QUE CONTA (USANDO RECURSAO) A
		// QUANTIDADE DE ELEMENTOS NAO NULOS
		// DE UM ARRAY DE OBJETOS RECEBIDO COMO PARAMETRO
	}
	
	public int countNotNullRec(Object[] array , int soma) {
		if (array.length == 1) {
			soma += incrementaNnulo(array[0]);
		} else {
			soma += countNotNullRec(Arrays.copyOfRange(array, 1, array.length), soma);
		}
		return soma;
	}

	private int incrementaNnulo(Object object) {
		int resp = -1;
		
		if (object == null) {
			resp = 0;
		} else if (object != null){
			resp = 1;
		}
		return resp;
	}

	public long potenciaDe2(int expoente) {
		if (expoente == 1) {
			return 2;
		} else {
			return (2* potenciaDe2(expoente - 1));
		}
		
		// TODO IMPLEMENTE (USANDO RECURSAO) O CODIGO PARA PRODUZIR A N-ESIMA
		// POTENCIA
		// DE 2
	}

	public double progressaoAritmetica(double termoInicial, double razao, int n) {
		if (n == 1) {
			return termoInicial;
		} else {
			return razao + progressaoAritmetica(termoInicial, razao, n - 1);
		}
		
		// TODO IMPLEMENTE SEU CODIGO (USANDO RECURSAO) DE ENCONTRAR O n-ESIMO
		// TERMO
		// DA PROGRESSAO ARITMETICA, DADO O TERMO INICIAL E A RAZAO
		
	}

	public double progressaoGeometrica(double termoInicial, double razao, int n) {
		if (n == 1) {
			return termoInicial;
		} else {
			return razao * progressaoGeometrica(termoInicial, razao, n - 1);
		}
		
		// TODO IMPLEMENTE SEU CODIGO (USANDO RECURSAO) DE ENCONTRAR O n-ESIMO
		// TERMO
		// DA PROGRESSAO GEOMETRICA, DADO O TERMO INICIAL E A RAZAO
	}
	
	
}

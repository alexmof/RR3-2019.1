package recursao;

import recursao.MetodosRecursivos;

public class Main {

	public static void main(String[] args) {
		MetodosRecursivos mr = new MetodosRecursivos();
		
		/*//Soma Array
		int[] array = {1};
		System.out.println(mr.calcularSomaArray(array));
		
		//Fatorial
		System.out.println(mr.calcularFatorial(5));
		
		//Fibonacci
		System.out.println(mr.calcularFibonacci(5));
		
		//Conta não nulos
		Object[] obj = {7, 2};
		System.out.println(mr.countNotNull(obj));
		
		//Potencia2
		System.out.println(mr.potenciaDe2(4));
		
		//PA
		System.out.println(mr.progressaoAritmetica(1, 5, 4));*/
		
		//PG
		System.out.println(mr.progressaoGeometrica(1, 2, 4));
	}

}

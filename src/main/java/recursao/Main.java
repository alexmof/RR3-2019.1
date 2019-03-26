package recursao;

import recursao.MetodosRecursivos;

public class Main {

	public static void main(String[] args) {
		MetodosRecursivos mr = new MetodosRecursivos();
		
		/*//Soma Array
		int[] array = {1};
		System.out.println(mr.calcularSomaArray(array));
		
		//Fatorial
		System.out.println(mr.calcularFatorial(5));*/
		
		//Fibonacci
		mr.calcularFibonacci(3);
	}

}

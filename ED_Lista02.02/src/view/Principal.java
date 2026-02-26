/*
 * Criar uma função recursiva que receba o dividendo e o divisor de uma operação de divisão e, por 
subtrações, exiba o resto da divisão. Os números de entrada devem ser números inteiros.
 */

package view;

import controller.Operacoes;

public class Principal {

	public static void main(String[] args) {
		// Instânciando os métodos da classe Operações
		Operacoes metodo = new Operacoes();
		
		// num1 = divisor, num2 = dividendo
		int num1 = 7, num2 = 76, resto;
		
		resto=metodo.Divisao(num1, num2);
		
		System.out.println("O resto da divisão de "+num2+" por "+num1+" é: "+resto);

	}

}

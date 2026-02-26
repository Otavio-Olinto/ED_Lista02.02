package controller;

public class Operacoes {

	public Operacoes() {
		super();
	}
	
	public int Divisao(int num1, int num2) {
		
		// Uma divisão é quantas vezes podemos subtrair um número de outro
		// Como queremos apenas o resto, logo o ponto de parada é quando o
		// Dividendo(num2) for menor que o Divisor(num1)
		if(num2<num1) return num2;
		
		return Divisao(num1, num2-num1);
	}

}

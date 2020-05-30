package controller;

public class Calculadora {
	
	
	public double soma(double num1, double num2) {
		return num1 + num2;
	}
	
	public double subtracao(double num1, double num2) {
		double novoNum1 = num1;
		double novoNum2 = num2;
		
		return novoNum1 - novoNum2;
	}
	
	public double divisao(double num1, double num2) {
		double novoNum1 = 0;
		double novoNum2 = 0;
		
		novoNum1 = num1;
		novoNum2 = num2;
		
		return novoNum1 / novoNum2;
	}
	
	public double multiplicacao(double num1, double num2) {
		double novoNum1 = 0;
		double novoNum2 = 0;
		double total = 0;
		
		novoNum1 = num1;
		novoNum2 = num2;	
		total = novoNum1 * novoNum2;
		
		return total;
	}

}

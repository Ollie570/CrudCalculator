package main;

//Importando a calculador:
import view.Calcular;

/* 
 * CrudCalculator (MVC)
 * A aplicacao deve ser uma calculadora desenvolvida usando o padrao MVC
 * View sera responsavel por exibir todos os dados para o usuario
 * Controller sera responsavel por fazer calculos e pela cominocacao model/view
 * Model responsavel pela parte pesada dos calculos e a comunicacao com o banco de dados
 */

public class Main {

	public static void main(String [] args) {
		
		//Como instanciar uma classe:
		Calcular calcular = new Calcular();
		calcular.calculadora();
	}
}

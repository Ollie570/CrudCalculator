package view;

//Importando classe:
import controller.Calculadora;

//Importando scanner:
import java.util.Scanner;

//Importando as classes necessárias para o banco de dados:
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;


public class Calcular {
	
	public void calculadora( ) {
		
		int op = 0;
		double n1 = 0;
		double n2 = 0;
		double total = 0;
		String[] opVet = new String[4];
		opVet[0] = "+";
		opVet[1] = "-";
		opVet[2] = "/";
		opVet[3] = "*";
		
		//Enviando parâmentro de entrada:
		Scanner scanner = new Scanner(System.in);
		
		//Instanciando funções de cálculo:
		Calculadora calculadora = new Calculadora();
		
		System.out.print("Bem-vindo(a) a calculadora CrudCalculator!");
		System.out.print("Digite 1 para soma, 2 para subtração, 3 para divisão, e 4 para multiplicação.");
		op = scanner.nextInt();
		
		switch(op) {
		
		case 1:
			System.out.print("Digite o primeiro valor: ");
			n1 = scanner.nextDouble();
			System.out.print("Digite o segundo valor: ");
			n2 = scanner.nextDouble();
			total = calculadora.soma(n1, n2);
			break;
			
		case 2:
			System.out.print("Digite o primeiro valor: ");
			n1 = scanner.nextDouble();
			System.out.print("Digite o segundo valor: ");
			n2 = scanner.nextDouble();
			total = calculadora.subtracao(n1, n2);
			break;
			
		case 3:
			System.out.print("Digite o primeiro valor: ");
			n1 = scanner.nextDouble();
			System.out.print("Digite o segundo valor: ");
			n2 = scanner.nextDouble();
			total = calculadora.divisao(n1, n2);
			break;
			
		case 4:
			System.out.print("Digite o primeiro valor: ");
			n1 = scanner.nextDouble();
			System.out.print("Digite o segundo valor: ");
			n2 = scanner.nextDouble();
			total = calculadora.multiplicacao(n1, n2);
			break;
			
		default:
			System.out.print("Digite somente números entre 1 e 4!");
			break;
	
		}
		
		try {

            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/CrudCalculator", "root", "");
            Statement stm = con.createStatement();
            if (stm.executeUpdate("INSERT INTO historico(valor1, valor2, operacao, total)VALUES('" + n1 + "','" + n2 + "','" + opVet[op-1] + "','" + total + "')") != 0) {
                System.out.print("Cadastro efetuado com sucesso!");

            } else {
                System.out.print("Erro no cadastro!");
            }

        } catch (SQLException e) {
            System.out.print("Erro!!! " + e.getMessage());
        }
		
		System.out.print("Total: " + total);
	}

}

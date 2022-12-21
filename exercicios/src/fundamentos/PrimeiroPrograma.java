package fundamentos;

import java.util.Scanner;

//import javax.swing.JButton;

public class PrimeiroPrograma {
	public static void main(String[] args) {
//		System.out.println("Hello, Steve Jobs!");
		Integer a;
		a = 2;
		int b = 2;
		Integer c = a - b;
		System.out.print(a);
		System.out.println(b);
		System.out.println(a + " - " + b + " = " + c);
		System.out.println(a + " - " + b + " = " + c);
		/*
		 * JButton Ctrl + espaço complementa com imports, e dá dicas de código
		 */
		System.out.printf("valores: %d %f %.3f %s %n", 10, 5., 5.111111, "iae");
		Scanner s = new Scanner(System.in);
		System.out.print("Entre seu nome: ");
		String nome = s.nextLine();
		System.out.print("Entre sua idade: ");
		Integer idade = s.nextInt();
		s.nextLine(); // limpa buffer do teclado como em C
		s.close(); // fecha o scanner
		System.out.printf("Nome: %s Idade: %d", nome.toUpperCase(), idade);
	}
}
// ctrl + 7 comentar/descomenta
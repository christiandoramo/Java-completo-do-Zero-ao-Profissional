package fundamentos;

import java.util.Scanner;

public class D_ModFundamentos {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Double a,b, r = 0.0;
		System.out.println("Entre com a variavel 'a'");
		a = s.nextDouble();
		System.out.println("Entre com a variavel 'b'");
		b = s.nextDouble();
		System.out.println("Entre com a operação \nadicao: '+'\nsubtracao: '-'\nmultiplicacao: '*'\ndivisao: '/'modulo: '%'\n");
		String op = s.next();
		s.close();
		r = op.equals("+") ? a+b : r;
		r = op.equals("-") ? a-b : r;
		r = op.equals("*") ? a*b : r;
		r = op.equals("/") ? a/b : r;
		r = op.equals("%") ? a%b : r;
		System.out.println("resultado: "+ r);
	}
}

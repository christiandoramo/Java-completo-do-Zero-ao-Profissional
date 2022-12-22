package fundamentos;

import java.util.Scanner;

public class D_VariaveisEConst {
	public static void main(String[] args) {
		final double pi = 3.14159265359;
		float c, d;
		Scanner s = new Scanner(System.in);
		System.out.println("Entre com o diametro");
		d = s.nextFloat();
		s.nextLine();
		System.out.printf("A area do circulo é de %.2fcm�%n%n", d * d / 4 * pi);
		System.out.println("Entre com a temperatura em Celsius");
		c = s.nextFloat();
		s.nextLine();
		s.close();
		System.out.printf("A temperatura em Fahrenheit é %.2fF%n", (9. / 5.) * c + 32);
	}
}

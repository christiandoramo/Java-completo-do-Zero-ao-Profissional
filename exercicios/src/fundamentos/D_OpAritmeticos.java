package fundamentos;

public class D_OpAritmeticos {
	public static void main(String[] args) {
		double sup, supA, supB, numA, numB, denA, denB, den, result;
		numA = 6 * (3 + 2);
		numB = (1 - 5) * (2 - 7);
		denA = 3 * 2;
		denB = 2;
		den = 10;
		System.out.printf("  ((%.2f)² - (%.2f)²)³%n", numA, numB);
		System.out.println("  _____        _____   ");
		System.out.printf("  %.2f       (%.2f)²%n", denA, denB);
		System.out.println("___________________");
		System.out.printf("       %.2f³", den);
		numA = Math.pow(6 * (3 + 2), 2);
		numB = Math.pow((1 - 5) * (2 - 7), 2);
		denA = 1.0 / (3 * 2);
		denB = 1.0 / (Math.pow(2, 2));
		supA = numA * denA;
		supB = numB * denB;
		sup = Math.pow(supA - supB, 3);
		den = 1.0 / Math.pow(10, 3);
		result = sup * den;
		System.out.println("\n\nResultado = "+result);
	}
}

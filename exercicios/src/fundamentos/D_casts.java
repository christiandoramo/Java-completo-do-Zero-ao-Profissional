package fundamentos;

//import java.utils.Locale;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class D_casts {
	public static void main(String[] args) {
//	#Locale.setDefault(new Locale("en", "US")); //para trocar as entradas aceitarem , em flutu. 

		String sal1 = JOptionPane.showInputDialog("Entre com o Salario 1");
		double val1 = Double.parseDouble(sal1.replace(",", "."));

		Scanner scan = new Scanner(System.in);
		System.out.println("Entre com o Salario 2");
		String sal2 = scan.next().replace(",", ".");
		double val2 = Double.parseDouble(sal2);

		System.out.println("Entre com o Salario 3");
		String sal3 = scan.next().replace(",", ".");
		double val3 = Double.parseDouble(sal3);

		double media = (val1 + val2 + val3) / 3;
		scan.close();
		System.out.println("A m�dia dos 3 sal�rios � R$" + media);
	}
}

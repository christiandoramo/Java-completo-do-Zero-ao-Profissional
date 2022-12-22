package fundamentos;

public class D_OpLogicos {
	public static void main(String[] args) {
		Boolean t1 = false, t2 = true; // trabalhou 1 e trabalhou 2
		Boolean ctv60 = t1 && t2; // 60 polegadas
		Boolean ctv30 = t1 ^ t2; // 30 polegadas
		Boolean csvt = t1 || t2; // sorvete
		Boolean nsvt = !csvt; // sorvete
		// ^ ou exclusivo XOR
		// escreve-se \" com o barra para ter " como saída
		
		System.out.println("Comprou tv 60\" - " + ctv60);
		System.out.println("Comprou tv 30\" - " + ctv30);
		System.out.println("Comprou sorvete\" - " + csvt);
		System.out.println("nao comprou sorvete0\" - " + nsvt);
	}
}

import java.util.Scanner;

public class Main {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int testes = s.nextInt();
		double qtdeComida;

		for (int i = 0; i < testes; i++) {
			qtdeComida = s.nextDouble();
			int dias = contagemDias(qtdeComida, 0);
			System.out.println(dias + " dias");
		}

	}

	public static int contagemDias(double qtdeComida, int dias ) {
		if(qtdeComida<=1) {
			return dias;
		} else {
		    dias++;
			return contagemDias(qtdeComida/2, dias);
			
		}

	}
}

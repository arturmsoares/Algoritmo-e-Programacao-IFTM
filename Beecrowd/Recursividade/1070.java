import java.util.Scanner;

public class Main {

	static int sequencia = 6;
	static Scanner s = new Scanner(System.in);


	public static void main(String[] args) {

		int valor = s.nextInt();
		impares(valor);

	}

	public static void impares(int valor) {
		if(sequencia == 0) {
			return;
		}
		
		if (valor % 2 ==1){
		    System.out.println(valor);
		    sequencia --;
		}
		
		impares(valor+1);
    }
}

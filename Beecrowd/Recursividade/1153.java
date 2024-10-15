import java.util.Scanner;

public class Main {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int n = s.nextInt();
		int resultado = fatorial(n);
		System.out.println(resultado);
		s.close();

	}

	public static int  fatorial( int n ) {

		if(n<=1) {
			return 1;
		}
		else {
			return n * fatorial(n-1);
		}
	}
}
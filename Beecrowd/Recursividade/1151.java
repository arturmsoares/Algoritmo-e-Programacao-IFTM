import java.util.Scanner;

public class Main {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

		int n = s.nextInt();
		int contador = 0;
		fibonacci( 0, 1, n, contador);
		System.out.println();

	}

	public static void  fibonacci( int a, int b, int n, int contador) {

		if(contador == n) {
			return;
		}
		
		if(contador == 0){
		    System.out.print(a);
		}
		else {
		    System.out.print(" " + a);
		}
		
		fibonacci(b, a+b, n, contador +1);
			
	}
}
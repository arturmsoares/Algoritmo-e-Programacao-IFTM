import java.util.Scanner;

public class Main {

	static Scanner s = new Scanner(System.in);



	public static void main(String[] args) {

		int n = s.nextInt();
		int contador = 0;
		resto(n, contador);

	}

	public static void resto(int n, int contador) {
		if(contador > 10000) {
			return;
		}
		
		else if (contador%n==2){
		    System.out.println(contador);
		}
		
	    resto(n, contador+1);
    }
}

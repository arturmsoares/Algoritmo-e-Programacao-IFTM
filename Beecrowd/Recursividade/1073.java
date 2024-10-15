import java.util.Scanner;

public class Main {

	static int inicio = 1;
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
        
        int valorTeto = s.nextInt();
        
        quadrado(inicio, valorTeto);
	}

	public static void quadrado(int inicio,int valorTeto) {
		if(valorTeto ==1){
		    return;
		}
		if(inicio > valorTeto){
		    return;
		}
		if(inicio%2==0){
		    System.out.println(inicio + "^2 = " + (long)inicio*inicio);
		}
		quadrado(inicio + 1, valorTeto);

    }
}
import java.util.Scanner;

public class Main {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {

    int entrada = s.nextInt();
    int aux = 0;
    
    imprimeVetor(entrada, aux);
    
	}

	public static void imprimeVetor( int entrada, int aux ) {
		if(aux ==1000){
		    return;
		}
		else {
		    System.out.println("N[" + aux + "] = " + (aux%entrada));
		}
		
		imprimeVetor (entrada, aux+1);

	}
}

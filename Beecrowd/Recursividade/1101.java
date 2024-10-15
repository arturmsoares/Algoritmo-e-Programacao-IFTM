import java.util.Scanner;

public class Main {


	static Scanner s = new Scanner(System.in);
	static int soma;

	public static void main(String[] args) {
	    

        while (true){
            int M = s.nextInt();
	        int N = s.nextInt();
        
            if (M <=0 || N <= 0){
            break;
            }
            
            int menor = Math.min(M,N);
            int maior = Math.max(M,N);
            
            soma = 0;

            sequencia (menor, maior);
            System.out.println("Sum=" + soma);
        }
        
	}

	public static void sequencia(int menor, int maior) {
		

		if(menor > maior){
		    return;
		}
		else{
		    System.out.print(menor + " ");
		    soma += menor;
		    sequencia(menor + 1, maior);
		}
		
	}
}
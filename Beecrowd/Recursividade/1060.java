import java.util.Scanner;

public class Main {

	
	static Scanner s = new Scanner(System.in);
	static int PA;
	static int PB;
	static double G1;
	static double G2;

	public static void main(String[] args) {
        
        int testes = s.nextInt();

        for (int i = 0; i< testes; i++){
            PA = s.nextInt();
            PB = s.nextInt();
            G1 = s.nextDouble();
            G2 = s.nextDouble();
            
            int ano = contagemAnos(0);

            if(ano> 100){
                System.out.println("Mais de 1 seculo.");
            }
            else{
            System.out.println(ano + " anos.");
            }
        }
	}

	public static int contagemAnos(int ano) {
	    
	    if(PA > PB){
	        return ano;
	    }
	    
	    if (ano > 100){
	        return ano;
	    }

	    else{
	        PA+= (int)(PA*G1/100);
    	    PB+= (int) (PB*G2/100);
    	    return contagemAnos(ano + 1);
	    }
	    

    }
}
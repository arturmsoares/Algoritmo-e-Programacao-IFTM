import java.util.Scanner;

public class Main {

    static int chamadas;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int n = s.nextInt();
        
        for (int i = 0; i < n; i++) {
            int x = s.nextInt();
            
            chamadas =-1;
            
            int resultado = calcularFib(x);
            
            System.out.println("fib(" + x + ") = " + chamadas + " calls = " + resultado);
        }
        
        s.close();
    }

    public static int calcularFib(int n) {
        chamadas++;
        
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return calcularFib(n - 1) + calcularFib(n - 2);
        }
    }
}

import java.util.Scanner;

public class main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        double x = s.nextDouble();
        double y = s.nextDouble();
        double resposta = maiorNumero(x, y);

        System.out.println("O maior numero é " + resposta);

        s.close();
    }

    static double maiorNumero(double x, double y) {
        double maior = 0;

        if (x > y) {
            maior = x;
        } else {
            maior = y;
        }
        return maior;
    }
}


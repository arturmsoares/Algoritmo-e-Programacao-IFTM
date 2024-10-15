import java.util.Scanner;

public class main {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {

        int qtde = s.nextInt();
        double notas[] = new double[qtde];

        imprimeMedia(qtde, notas);

        s.close();
    }

    static void imprimeMedia( int qtde, double notas[]) {

        double media = 0;
        double notaTotal = 0;

        for(int i=0; i< qtde; i++){
            notas[i] = s.nextDouble();
            notaTotal += notas[i];
        }

        media = notaTotal/qtde;

        System.out.println( "A média das notas é " + media );

    }
}

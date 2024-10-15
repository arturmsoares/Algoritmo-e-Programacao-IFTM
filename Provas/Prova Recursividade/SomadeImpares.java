/* Escreva uma função recursiva que retorne o somatório dos números impares de 1 até N. O valor de N será um valor entre 1 e 10000.



Faça um programa em Java que utilize a função recursiva criada.



obs.: a solução obrigatoriamente precisa ser recursiva.





Entrada
Um número inteiro N que indica a quantidade de números a serem analisados.



Saída
Imprimir os números impares conforme exemplo dado na tabela abaixo.
 */
import java.util.Scanner;

public class Main {

    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        
        int qtde = s.nextInt();
        int sequencia = 1;
        int soma = impares(qtde, sequencia);
        System.out.println(" = " + soma);

    }

    public static int impares(int qtde, int sequencia) {
        
        if(sequencia>qtde ){
            return 0;
        }
        
        if(sequencia % 2 !=0){
            if(sequencia == 1){
                System.out.print(sequencia);
            }else{
            System.out.print(" + " + sequencia); 
            }
            
            return  sequencia + impares(qtde, sequencia + 1); //somatório
        }
        
        return impares(qtde, sequencia +1);
    }
}

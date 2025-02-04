/* Faça uma função recursiva em java, que dado um número inteiro positivo N, some todos os dígitos de N. Se o resultado da soma for maior que 9, a função deve continuar somando os dígitos desse novo número até que o resultado seja um único dígito. São dois processos que podem ser implementados de modo recursivo: somar os dígitos e repetir a soma desses dígitos. Pode implementar duas funções recursivas ou utilizar um While para uma delas.

Crie um programa que utilize a(s) função(es).

Dicas:
Você pode utilizar a operação de módulo (%) para obter o último dígito de um número e a operação de divisão inteira (/) para remover o último dígito.
A ideia principal é fazer a soma dos dígitos e, caso o resultado tenha mais de um dígito, chamar a função recursivamente com esse novo número.

Explicação: para o número N = 9875
9+8+7+5=29
2+9=11
1+1=2

Entrada
A entrada será composta por um número inteiro N.

Saída
Imprima o resultado da soma recursiva dos dígitos de N, que será sempre um número entre 1 e 9.
 */



import java.util.Scanner;

public class Main {

	static Scanner s = new Scanner(System.in);



	public static void main(String[] args) {

		int n = s.nextInt();
		int resultado = continuaSoma(n);
		
		System.out.println(resultado);
		

	}

	public static int somaDigito(int n) {
	    
	    if(n == 0){
	        return 0;
	    }
	    
	    return (n % 10) + somaDigito(n/10);
	}
	
	public static int continuaSoma(int n){
	    int soma = somaDigito(n);
	    
	    if(soma>9){
	        return continuaSoma(soma);
	    }else{
	        return soma;
	    }
	}
	
package arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int longitud;
		int fin;
		System.out.println("Introduce la longitud del array");
		longitud= teclado.nextInt();
		System.out.println("Introduce hasta que numero quieres los pares");
		fin=teclado.nextInt();
		teclado.close();
		int[] numPares= rellenarPares(longitud,fin);
		Arrays.sort(numPares);
		System.out.println(Arrays.toString(numPares));
	}
	
	public static int[] rellenarPares(int longitud, int fin) {
		int[] numeros = new int[longitud];
		Random rand = new Random();
		int cont=0;
		int num;
		while(cont<longitud) {
			num=rand.nextInt(fin)+2;
			if(num%2==0) {
				numeros[cont]=num;
				cont++;
			}
		}
		return numeros;
	}
	
}

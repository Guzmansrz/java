package nNumerosPares;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Random rand = new Random();
		int pares=0;
		int impares=0;
		System.out.println("Introduce la cantidad de numeros que quieres");
		int n = teclado.nextInt();
		int[] numeros = new int[n];
		for(int i=0; i<n; i++) {
			numeros[i]= rand.nextInt(100);
			if(numeros[i]%2==0) {
				pares++;
			}
			else
				impares++;
		}
		int[] numPares = new int[pares];
		int[] numImpares = new int[impares];
		int paresCont =0;
		int impCont =0;
		for(int i =0; i<n; i++) {
			if(numeros[i]%2==0) {
			numPares[paresCont]=numeros[i];
			paresCont++;
			}
			else {
				numImpares[impCont]=numeros[i];
				impCont++;
			}
		}
		System.out.println("La cantidad de numeros impares es:");
		System.out.println(Arrays.toString(numImpares));
		System.out.println("La cantidad de numeros pares es:");
		System.out.println(Arrays.toString(numPares));
	}
}

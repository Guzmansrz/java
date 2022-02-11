package entregaJava;

import java.util.Scanner;

public class DAW_GuzmanSuarezAlvarez_Practica21 {
	private static Scanner teclado;

	public static void main(String[] args) {
		//Pregunto el numero e imprimo los pares hasta ese numero
		teclado = new Scanner(System.in);
		int num1;
		System.out.println("Introduce hasta el numero que quieres los pares");
		num1= teclado.nextInt();
		for (int i =2; i<=num1; i=i+2) {
				System.out.print(i + "-");
		}
		//Cambio de programa 
		System.out.println("\nPulsa una tecla para continuar...");
		teclado.nextLine();
		teclado.nextLine();
		
		//Programa que imprime los 10 primeros numeros pares
		System.out.println("Voy a imprimir los 10 primeros numeros pares");
		for (int i =2; i<=20; i=i+2) {
				System.out.print(i + "-");
		}
		
		//Cambio de programa 
		System.out.println("\nPulsa una tecla para continuar...");
		teclado.nextLine();
				
		//Programa que imprime los 10 primeros numeros pares con un blucle while
		System.out.println("Voy a imprimir los 10 primeros numeros pares con un bucle while");
		for (int i =2; i<=20; i=i+2) {
				System.out.print(i + "-");
		}
		
		//Cambio de programa 
		System.out.println("\nPulsa una tecla para continuar...");
		teclado.nextLine();
		
		//Programa que imprime los n primeros numeros pares, leido n por teclado, con un bucle while
		System.out.println("Introduce el numero de pares que quieres");
		num1= teclado.nextInt();
		System.out.println("Voy a imprimir los " + num1 + " primeros numeros pares");
		int cont=2;
		while(cont<=num1*2) {
			System.out.println(cont);
			cont+=2;
		}
	}
}












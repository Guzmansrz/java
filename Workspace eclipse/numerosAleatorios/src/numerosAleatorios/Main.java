package numerosAleatorios;

import java.util.Random;
import java.util.Scanner;

public class Main {

	private static Scanner teclado;

	public static void main(String[] args) {

		teclado = new Scanner(System.in);
		int primerVal, segundoVal, total;
		System.out.println("¿Cuantos numeros aleatorios quieres?");
		total = teclado.nextInt();
		System.out.println("¿Entre que valores quieres los numeros aleatorios?");
		System.out.println("Introduce el primero");
		primerVal = teclado.nextInt();
		System.out.println("Introduce el segundo");
		segundoVal = teclado.nextInt();
		generaAleatorios(total, primerVal, segundoVal);
	}

	private static void generaAleatorios(int total, int primerVal, int segundoVal) {
		Random rand = new Random();
		System.out.println(segundoVal);
		for (int i = 0; i < total - 1; i++) {
			System.out.println(rand.nextInt(segundoVal - primerVal) + primerVal);
		}
	}

}
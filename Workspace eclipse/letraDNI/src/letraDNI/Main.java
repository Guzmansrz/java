package letraDNI;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce tu numero del DNI sin letra");
		int numeroDNI = teclado.nextInt();
		System.out.println("Tu letra del DNI es " + letraDNI(numeroDNI));
		teclado.close();

	}

	public static char letraDNI(int numeroDNI) {
		char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };
		int cociente = numeroDNI / 23;
		int valor = numeroDNI - (cociente * 23);
		return letras[valor];
	}

}

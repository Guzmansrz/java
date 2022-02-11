package claveCesar;

import java.util.Scanner;

public class Main {
	public static final int NUM = 3;

	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		char[] alfabeto = new char[36];
		for (int i = 65; i <= 90; i++) {
			int cont = 0;
			alfabeto[cont] = (char) i;
			cont++;
		}
		System.out.println("Introduce la contraseņa");
		String contraseņa = teclado.next();
		char[] palabra = new char[contraseņa.length()];
		for (int i = 0; i < contraseņa.length(); i++) {
			palabra[i] = contraseņa.charAt(i);
			;
		}
		for (int i = 0; i < contraseņa.length(); i++) {
			if ((int) palabra[i] != 32) {
				if ((int) palabra[i] + NUM < 90) {
					palabra[i] = (char) (palabra[i] + NUM);
				} else {
					palabra[i] = (char) (palabra[i] + NUM - 90 + 64);
				}
			}
		}
		String fraseEncriptada = "";
		for (int i = 0; i < contraseņa.length(); i++) {
			fraseEncriptada += palabra[i];
		}
		System.out.println("La contraseņa encriptada es: ");
		System.out.println(fraseEncriptada);
	}

}

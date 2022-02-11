package cambioMoneda;

import java.util.Scanner;

public class Main {

	public static final double LIBRA = 0.86;
	public static final double DOLAR = 1.28611;
	public static final double YEN = 129.852;
	private static Scanner teclado;
	

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		String moneda;
		int valor;
		System.out.println("¿Cuanto es el valor en euros?");
		valor = teclado.nextInt();
		System.out.println("¿A que moneda quieres que haga el cambio?");
		moneda=teclado.next();
		moneda = moneda.toLowerCase();
		cambioMoneda(valor, moneda);
	}

	private static void cambioMoneda(double valor, String moneda) {
		switch (moneda) {
		case "dolares", "$", "dolar":
			System.out.println("El valor en dolares es " + valor*DOLAR);
			break;
		case "yenes", "yen":
			System.out.println("El valor en yenes es " + valor*YEN);
			break;
		case "libras", "libra":
			System.out.println("El valor en libras es " + valor*LIBRA);
			break;

		default:
			System.out.println("Parametros incorrectos");
			break;
		}
		
	}

}

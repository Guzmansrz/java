import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Random rand = new Random();
		Scanner teclado = new Scanner(System.in);
		System.out.println("Introduce la longitud de la contraseña a adivinar");
		int longitud = teclado.nextInt();
		int[] contraseña = new int[longitud];
		for (int i = 0; i < longitud; i++) {
			contraseña[i] = rand.nextInt(5) + 1;
		}
		System.out.println(Arrays.toString(contraseña));
		int[] intento = new int[longitud];
		int cont =1;
		while (!Arrays.equals(contraseña, intento)) {
			for (int i = 0; i < longitud; i++) {
				System.out.println("Introduce el digito " + (i + 1));
				intento[i] = teclado.nextInt();
			}
			for (int i = 0; i < longitud; i++) {
				if (contraseña[i] > intento[i]) {
					System.out.println("El numero " + (i + 1) + " correcto es mayor al introducido");
				} else if (contraseña[i] < intento[i]) {
					System.out.println("El numero " + (i + 1) + " correcto es menor al introducido");
				} else
					System.out.println("El numero " + (i + 1) + " es correcto");
			}
			cont++;
			if(cont>2) {
				System.out.println("Has superado el limite de intentos");
				break;
			}
		}
		teclado.close();
	}

}

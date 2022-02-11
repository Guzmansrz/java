package primitiva;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		int[] premiada = { 4, 10, 14, 15, 22, 45 };
		int[] miPrimitiva =generarPrimitiva();
		System.out.println(Arrays.toString(miPrimitiva));
		System.out.println(comprobarPrimitiva(premiada, miPrimitiva));
	}

	public static int[] generarPrimitiva() {
		int[] primitiva = new int[6];
		for (int i = 0; i < primitiva.length; i++) {
			primitiva[i] = (int)(Math.random()*48+1);
		    for (int j = 0; j < i; j++) {
		        if (primitiva[i] == primitiva[j]) {
		            i--;
		            break;
		        }
		    }  
		}
		Arrays.sort(primitiva);
		return primitiva;
	}

	public static int comprobarPrimitiva(int[] premiada, int[] primitiva) {
		int aciertos = 0;
		for (int i = 0; i < primitiva.length; i++) {
			for (int j = 0; j < premiada.length; j++) {
				if (premiada[j] == primitiva[i]) {
					aciertos++;
				}
			}
		}
		return aciertos;
	}
}

package contraseņa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		Password con1 = new Password();
		System.out.println(con1.toString());
		System.out.println("Introduce una longitud para la contraseņa");
		int lon = teclado.nextInt();
		Password con2 = new Password(lon);
		System.out.println(con2.toString());
		System.out.println(con1.esFuerte());
		System.out.println(con2.esFuerte());
		System.out.println("Introduce una contraseņa y te dire si es segura");
		teclado.nextLine();
		String contra= teclado.nextLine();
		Password comprobar = new Password(contra);
		if(comprobar.esFuerte()) {
			System.out.println("La contraseņa es segura");
		}else 
			System.out.println("La contraseņa no es segura");
		teclado.close();
	}


}

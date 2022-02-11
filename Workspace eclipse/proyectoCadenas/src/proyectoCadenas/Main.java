package proyectoCadenas;

import java.util.Scanner;


/**
 * 
 * @author guzman
 *
 */
public class Main {

	private static Scanner teclado;

	public static void main(String[] args) {
		int opc;
		teclado = new Scanner(System.in);
		do {
			menu();
			opc = teclado.nextInt();
			calculadora(opc);
		}while(opc !=6);
	}
	
	private static void calculadora(int opc) {
		String cad1, cad2;
		char letra;
		if(opc ==6){
			System.out.println("Adios");
		}
		else {
			switch (opc) {
			case 1:
				System.out.println("Introduzca la palabra");
				cad1=teclado.nextLine();
				cad1=teclado.nextLine();
				System.out.println(inversa(cad1));
				break;
			case 2:
				System.out.println("Introduzca la palabra");
				cad1=teclado.nextLine();
				cad1=teclado.nextLine();
				System.out.println(polindromo(cad1));
				break;
			case 3:
				System.out.println("Introduzca la palabra");
				cad1=teclado.nextLine();
				cad1=teclado.nextLine();
				System.out.println("Introduzca la otra palabra");
				cad2=teclado.nextLine();
				System.out.println(intercalar(cad1, cad2));
				break;
			case 4: 
				System.out.println("Introduzca la palabra");
				cad1=teclado.nextLine();
				cad1=teclado.nextLine();
				System.out.println(contarVocales(cad1));
				break;
			case 5: 
				System.out.println("Introduzca la palabra");
				cad1=teclado.nextLine();
				cad1=teclado.nextLine();
				System.out.println("Introduzca la letra");
				letra=teclado.nextLine().charAt(0);
				System.out.println(contarLetra(cad1,letra));
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		}
	}

	private static void menu() {
		System.out.println("****CALCULADORA**** \n1.Inversa \n2.Polindromo \n3.Intercalar \n4.Contar vocales \n5.Contar Letra "
				+ "\n6.Salir \nSeleccione la opcion que desea: ");
		
	}

	private static String inversa(String cad1) {
		String aux = "";
		for (int i = cad1.length()-1; i>=0; i--) {
			aux += cad1.charAt(i);
		}
		return aux;
	}
	private static String polindromo(String cad1) {
		cad1 = cad1.toLowerCase();
		String inv = inversa(cad1);
		if(inv.equals(cad1))
			return "La cadena es polindroma";
		else 
			return "La cadena no es polindroma";
	}
	private static String intercalar(String cad1, String cad2) {
		String aux = "";
		for (int i = 0; i<=cad1.length()-1; i++) {
			aux += cad1.charAt(i);
			aux += cad2.charAt(i);
		}
		return "El resultado de intercalar las cadenas es: " + aux;
	}
	private static String contarVocales(String cad1) {
		int numVoc=0;
		for (int i = 0; i<=cad1.length()-1; i++) {
			if(cad1.charAt(i)== 'a' || cad1.charAt(i)== 'e' || cad1.charAt(i)== 'i' || cad1.charAt(i)== 'o' || cad1.charAt(i)== 'u') {
				numVoc++;
			}
		}
		return "El numero de vocales es " + numVoc;
	}
	private static String contarLetra(String cad1, char letra) {
		int numLetr=0;
		for (int i = 0; i<=cad1.length()-1; i++) {
			if(cad1.charAt(i)== letra) {
				numLetr++;
			}
		}
		return "El numero de veces que sale la letra " + letra + " es " + numLetr;
	}
	

}

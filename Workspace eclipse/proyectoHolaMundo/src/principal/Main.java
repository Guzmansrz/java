package principal;

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
		}while(opc !=7);
	}
	
	private static void calculadora(int opc) {
		double num1, num2;
		if (opc==5) {
			System.out.println("Introduzca un valor");
			num1=teclado.nextInt();
			System.out.println("Su cuadrado es "+ cuadrado(num1));
		}
		else if(opc ==7){
			System.out.println("Adios");
		}
		else {
			System.out.println("Introduzca un valor");
			num1=teclado.nextDouble();
			System.out.println("Introduzca el segundo valor");
			num2=teclado.nextDouble();
			switch (opc) {
			case 1:
				System.out.println("El resultado de la suma es " + suma(num1, num2));
				break;
			case 2:
				System.out.println("El resultado de la resta es " + resta(num1, num2));
				break;
			case 3:
				System.out.println("El resultado de la multiplicacion es " + multiplicacion(num1, num2));
				break;
			case 4: 
				if(num2==0) {
					System.out.println("No se puede dividir entre 0");
				}
				else {
					System.out.println("El resultado de la division es " + division(num1, num2));
				}
				break;
			case 6:
				System.out.println("El resultado de la potencia es " + potencia(num1, num2));
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
		}
	}

	private static void menu() {
		System.out.println("****CALCULADORA**** \n1.Suma \n2.Resta \n3.Multiplicacion \n4.Division \n5.Cuadrado "
				+ "\n6.Potencia \n7.Salir \nSeleccione la opcion que desea: ");
		
	}

	private static double suma(double num1, double num2) {
		return num1+num2;
	}
	private static double resta(double num1, double num2) {
		return num1-num2;
	}
	private static double multiplicacion(double num1, double num2) {
		return num1*num2;
	}
	private static double division(double num1, double num2) {
		return num1/num2;
	}
	private static double cuadrado(double num1) {
		return num1*num1;
	}
	private static double potencia(double num1, double num2) {
		return Math.pow(num1, num2);
	}
}

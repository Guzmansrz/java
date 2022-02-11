package clases;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);
//
//		System.out.println("Introduce el nombre");
//		String nombre=scanner.next();
//		System.out.println("Introduce la edad");
//		int edad=scanner.nextInt();
//		System.out.println("Introduce el sexo");
//		char sexo=scanner.next().charAt(0);
//		System.out.println("Introduce el peso");
//		double peso=scanner.nextDouble();
//		System.out.println("Introduce la altura");
//		double altura=scanner.nextDouble();
//		//Persona 1
//		Persona persona1=new Persona(nombre, edad, sexo, peso, altura);
//		System.out.println(persona1.toString());
//		//Persona 2
//		Persona persona2=new Persona(nombre, edad, sexo);
//		System.out.println(persona2.toString());
//		//Persona 3
//		Persona persona3=new Persona();
//		//Persona 4 copia de persona 1
//		Persona persona4 = new Persona(persona1);
//		//Comprobar peso
//		System.out.println(pesoIdeal(persona1));
//		System.out.println(pesoIdeal(persona4));
//		System.out.println(pesoIdeal(persona2));
//		System.out.println(pesoIdeal(persona3));
//		//Comprobar edad
//		System.out.println(comprobarMayorEdad(persona1));
//		System.out.println(comprobarMayorEdad(persona2));
//		System.out.println(comprobarMayorEdad(persona3));
//		scanner.close();
		
		Persona p = new Persona("Juan", "Fernandez");
		System.out.println(p.toString());
	}

	private static String pesoIdeal(Persona p) {
		if(p.calcularIMC()==-1) {
			return "Estas por debajo del peso ideal";
		}
		else if(p.calcularIMC()==0) {
			return "Estas en el peso ideal";
		}
		else 
			return "Estas por encima del peso ideal";
	}
	
	private static String comprobarMayorEdad(Persona p) {
		if(p.esMayorDeEdad()==true) {
			return "Es mayor de edad";
		}
		else
			return "Es menor de edad";
	}
//	private static String menu() {
//		return "****Cuenta**** \n1.Ver cuenta \n2.Ingreasar dinero "
//				+ "\n3.Retirar dinero \n4.Salir \nSeleccione la opcion que desea: ";
//
//	}
//	private static void calculadora(){
//		int opc=0;
//		Scanner teclado= new Scanner(System.in);
//		Cuenta miCuenta = new Cuenta();
//		while (opc != 4) {
//			System.out.println(menu());
//			opc=teclado.nextInt();
//			switch (opc) {
//			case 1:
//				System.out.println(miCuenta.toString());
//				break;
//			case 2:
//				System.out.println("Introduce la cantidad que deseas ingresar");
//				double cantIngr = teclado.nextDouble();
//				miCuenta.ingresar(cantIngr);
//				break;
//			case 3:
//				System.out.println("Introduce la cantidad que deseas retirar");
//				double cantRetirar = teclado.nextDouble();
//				miCuenta.retirar(cantRetirar);
//				break;
//			case 4:
//				System.out.println("Adios");
//				break;
//			default:
//				System.out.println("Opcion incorrecta");
//				break;
//			}
//		}
//		teclado.close();
//	}
}

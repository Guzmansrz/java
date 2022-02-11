package clases;

import java.util.Random;

public class Persona {

	private static final int PARAM_INF = 20;
	private static final int PARAM_SUP = 25;
	private static final int PESO_BAJO = -1;
	private static final int PESO_MEDIO = 0;
	private static final int PESO_ALTO = 1;
	
	private String nombre;
	private int edad;
	private String apellidos;
	private int dni;
	private double peso;
	private double altura;
	private char sexo;
	private static int numeroObjetos;

//	public Persona() {
//		setSexo('H');
//		generarDNI();
//	}

	
	public Persona(String nombre, int edad, char sexo) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		comprobarSexo(sexo);
		generarDNI();
	}
	
	public Persona(String nombre, int edad, double estatura, String dni, double peso, char sexo) {
		setNombre(nombre);
		setEdad(edad);
		setAltura(estatura);
		setDni(dni);
		setPeso(peso);
		setSexo(sexo);
		comprobarSexo(sexo);
	}

	public Persona(String nombre, int edad, char sexo, double peso, double altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.sexo = sexo;
		this.peso = peso;
		this.altura = altura;
		comprobarSexo(sexo);
		generarDNI();

	}


	public Persona(Persona objPersona) {
		this.nombre = objPersona.nombre;
		this.edad = objPersona.edad;
		this.apellidos = objPersona.apellidos;
		this.dni = objPersona.dni;
		this.peso = objPersona.peso;
		this.altura = objPersona.altura;
		this.sexo = objPersona.sexo;
	}

	public Persona() {
		System.out.println("LLamada a Persona()");
		numeroObjetos++;
	}

	public Persona(String nombre) {
		this();
		System.out.println("Llamada a Persona(String nombre)");
		this.nombre=nombre;
	}
	
	public Persona(String nombre, String apellidos) {
		this(nombre);
		System.out.println("Llamada a Persona(String nombre, String apellidos)");
		this.apellidos=apellidos;
	}
	
	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}


	public double getAltura() {
		return altura;
	}


	public void setAltura(double altura) {
		this.altura = altura;
	}


	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}


	public String getApellidos() {
		return apellidos;
	}

	private void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return "" + this.dni + letraDNI(this.dni);
	}

	private void setDni(String numDni) {
		if (validarDni(numDni) == true) {
			this.dni = Integer.parseInt(numDni.substring(0, 8));
		}

	}

	public double getPeso() {
		return peso;
	}

	private void setPeso(double peso) {
		this.peso = peso;
	}



	public char getSexo() {
		return sexo;
	}

	private void setSexo(char sexo) {
		this.sexo = sexo;
	}

	private char letraDNI(int numeroDNI) {
		char[] letras = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q', 'V', 'H',
				'L', 'C', 'K', 'E' };
		int cociente = numeroDNI / 23;
		int valor = numeroDNI - (cociente * 23);
		return letras[valor];
	}

	private boolean validarDni(String numDni) {
		char letra = numDni.charAt(8); //71781468D
		int nums = Integer.parseInt(numDni.substring(0, 8));
		if (letraDNI(nums) == letra) {
			return true;
		} else
			return false;
	}
	
	public int calcularIMC() {
		double valor=0;
		valor =this.peso /(Math.pow(this.altura, 2));
		if(valor<PARAM_INF)
			return PESO_BAJO;
		else if(valor>PARAM_INF && valor<PARAM_SUP) {
			return PESO_MEDIO;
		}
		else 
			return PESO_ALTO;
	}
	public boolean esMayorDeEdad() {
		return getEdad()>=18;
	}
	private void comprobarSexo(char sexo) {
		if(getSexo()!='H'&& getSexo()!='M') {
			setSexo('H');
		}
	}
	private void generarDNI() {
		String stringDNI="";
		Random rand = new Random();
		for(int i=0; i<8; i++) {
			stringDNI+= rand.nextInt(9)+1;
		}
		int numDNI= Integer.parseInt(stringDNI);
		char letra=letraDNI(numDNI);
		String DNI= stringDNI+letra;
		setDni(DNI);
	}

	@Override
	public String toString() {
		return "nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", " + "estatura=" + altura
				+ ", DNI=" + getDni() + ", peso=" + peso + ", " + "sexo= " + sexo;
	}
}

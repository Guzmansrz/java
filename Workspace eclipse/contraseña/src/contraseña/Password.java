package contraseña;

import java.util.Random;

public class Password {
	private static int LONG_DEF = 8;
	private int longitud;
	private String contraseña;

	public Password() {
		setLongitud(LONG_DEF);
		generarPasword();
	}

	public Password(int longitud) {
		setLongitud(longitud);
		generarPasword();
	}

	public Password(int longitud, String contraseña) {
		super();
		this.longitud = longitud;
		this.contraseña = contraseña;
	}

	public Password(String contr) {
		this.contraseña = contr;
		this.longitud=contr.length();
	}

	protected void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	protected void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}

	public int getLongitud() {
		return longitud;
	}

	public String getContraseña() {
		return contraseña;
	}

	public boolean esFuerte() {
		int numCont = 0;
		int mayusCont = 0;
		int minusCont = 0;
		for (int i = 0; i < this.longitud; i++) {
			if (this.contraseña.charAt(i) >= 65 && this.contraseña.charAt(i) <= 90) {
				mayusCont++;
			} else if (this.contraseña.charAt(i) >= 97 && this.contraseña.charAt(i) <= 122) {
				minusCont++;
			} else if (this.contraseña.charAt(i) >= 48 && this.contraseña.charAt(i) <= 57) {
				numCont++;
			}
		}
		return numCont > 5 && minusCont > 1 && mayusCont > 2;
	}
	

	private void generarPasword() {
		Random rand = new Random();
		String contra="";
		char caracter;
		for (int i = 0; i < this.longitud; i++) {
			caracter=(char) ((char)  rand.nextInt(126-33)+33);
			contra+=caracter;
		}
		setContraseña(contra);
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contraseña=" + contraseña + "]";
	}
	
}

package contrase�a;

import java.util.Random;

public class Password {
	private static int LONG_DEF = 8;
	private int longitud;
	private String contrase�a;

	public Password() {
		setLongitud(LONG_DEF);
		generarPasword();
	}

	public Password(int longitud) {
		setLongitud(longitud);
		generarPasword();
	}

	public Password(int longitud, String contrase�a) {
		super();
		this.longitud = longitud;
		this.contrase�a = contrase�a;
	}

	public Password(String contr) {
		this.contrase�a = contr;
		this.longitud=contr.length();
	}

	protected void setLongitud(int longitud) {
		this.longitud = longitud;
	}

	protected void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}

	public int getLongitud() {
		return longitud;
	}

	public String getContrase�a() {
		return contrase�a;
	}

	public boolean esFuerte() {
		int numCont = 0;
		int mayusCont = 0;
		int minusCont = 0;
		for (int i = 0; i < this.longitud; i++) {
			if (this.contrase�a.charAt(i) >= 65 && this.contrase�a.charAt(i) <= 90) {
				mayusCont++;
			} else if (this.contrase�a.charAt(i) >= 97 && this.contrase�a.charAt(i) <= 122) {
				minusCont++;
			} else if (this.contrase�a.charAt(i) >= 48 && this.contrase�a.charAt(i) <= 57) {
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
		setContrase�a(contra);
	}

	@Override
	public String toString() {
		return "Password [longitud=" + longitud + ", contrase�a=" + contrase�a + "]";
	}
	
}

package clases;

public class Punto {

	private double posicionX;
	private double posicionY;


	public Punto(int posicionX, int posicionY) {
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}

	public Punto(String posicionX, String posicionY) {
		this.posicionX=Double.parseDouble(posicionX);
		this.posicionY=Double.parseDouble(posicionY);
	}

	public double getPosicionX() {
		return posicionX;
	}

	public double getPosicionY() {
		return posicionY;
	}


}

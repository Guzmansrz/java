package radio;

public class Sintonizador {
	private static final int FRECUENCIA_SUBIDA=10;
	private static final int FRECUENCIA_BAJADA=10;
	private static final int LIMITE_SUPERIOR=108;
	private static final int LIMITE_INFERIOR=80;
	
	public int frecuencia;

	
	public Sintonizador() {
		this.frecuencia=80;
	}

	public Sintonizador(int frecuencia) {
		this.frecuencia = frecuencia;
	}
	
	protected int getFrecuencia() {
		return frecuencia;
	}

	private void setFrecuencia(int frecuencia) {
		this.frecuencia = frecuencia;
	}

	/**
	 * 
	 * Metodo que sube la frecuencia
	 */
	public void up() {
		if(getFrecuencia()+FRECUENCIA_SUBIDA > LIMITE_SUPERIOR) {
			setFrecuencia(LIMITE_INFERIOR);
		}
		else
			setFrecuencia(getFrecuencia()+FRECUENCIA_SUBIDA);
	}
	
	/**
	 * 
	 * Metodo que baja la frecuencia
	 */
	public void down() {
		if(getFrecuencia()-FRECUENCIA_BAJADA < LIMITE_INFERIOR) {
			setFrecuencia(LIMITE_SUPERIOR);
		}
		else
			setFrecuencia(getFrecuencia()-FRECUENCIA_BAJADA);
	}
	/**
	 * Metodo que devuelve la frecuencia actual
	 */
	public void display() {
		System.out.println("La frecuencia actual es " + getFrecuencia()); 
	}
}

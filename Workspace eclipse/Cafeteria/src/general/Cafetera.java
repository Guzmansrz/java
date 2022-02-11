package general;

public class Cafetera {
	
	private final int MAXIMA_POR_DEFECTO=1000;
	private final int ACTUAL_POR_DEFECTO=0;
	
	private int capacidadMaxima;
	private int capacidadActual;

	public Cafetera(){
		this.capacidadMaxima = MAXIMA_POR_DEFECTO;
		this.capacidadActual = ACTUAL_POR_DEFECTO;
	}

	public Cafetera(int maxima){
		this.capacidadMaxima = maxima;
		this.capacidadActual = maxima;
	}

	public Cafetera(int maxima, int actual){
		this.capacidadMaxima = maxima;
		this.capacidadActual = actual;

		if (actual > maxima)
			this.capacidadActual = maxima;
	}

	public int getCapacidadMaxima(){
		return capacidadMaxima;
	}

	public int getCapacidadActual(){
		return capacidadActual;
	}

	private void setCapacidadActual(int capacidadActual){
		this.capacidadActual = capacidadActual;
	}
	
	/**
	 * Metodo que llena la cafetera, pone la capacidad actual igual que la capacidad maxima
	 */
	public void llenarCafetera(){
		this.capacidadActual = this.capacidadMaxima;
	}
	/**
	 * Metodo que sirve una taza de cafe. Retira una cantidad pasada como parametro
	 * de la cantidad actual
	 * @param cantidadCafe
	 */
	public void servirTaza(int cantidadCafe){
		if (cantidadCafe > getCapacidadActual())
			vaciarCafetera();
		else
			setCapacidadActual(getCapacidadActual() - cantidadCafe);
	}

	/**
	 * Metodo que pone vacia la cafetera, pone a 0 la capacidad actual
	 */
	public void vaciarCafetera(){
		setCapacidadActual(0);
	}
	
	/**
	 * Metodo que agrega cafe a la cafetera. Añade una cantidad pasada como parametro
	 * @param cantidadCafe
	 */
	public void agregarCafe(int cantidadCafe){
		if(cantidadCafe>getCapacidadMaxima())
			setCapacidadActual(getCapacidadMaxima());
		else
			setCapacidadActual(getCapacidadActual()+cantidadCafe);
	}

	@Override
	public String toString() {
		return "Cafetera [capacidadMaxima=" + capacidadMaxima + ", capacidadActual=" + capacidadActual + "]";
	}
	
}

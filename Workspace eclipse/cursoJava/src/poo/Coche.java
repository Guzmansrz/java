package poo;

public class Coche {
	private int ruedas, largo, ancho, motor, peso_plataforma, peso_total;
	private String color;
	private boolean asientos_cuero, climatizador;

	public Coche() {
		this.ruedas = 4;
		this.largo = 2000;
		this.ancho = 300;
		this.motor = 1600;
		this.peso_plataforma = 500;
	}

	@Override
	public String toString() {
		return "La plataforma del vehiculo tiene " + this.ruedas + " ruedas " + ". Mide " + this.largo / 1000
				+ " metros, con un ancho de " + this.ancho + " cm y un peso de la plataforma de " + this.peso_plataforma
				+ " kg";
	}

	public String getColor() {
		return "El color del coche es" + color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String dime_asientos() {
		if(asientos_cuero)
			return "El coche tiene asientos de cuero";
		else
			return "El coche tiene asientos de serie";
	}

	public void configura_asientos(String asientos_cuero) {
		if(asientos_cuero.equalsIgnoreCase("si"))
			this.asientos_cuero = true;
		else 
			this.asientos_cuero=false;
	}

	public String dime_climatizador() {
		if(this.climatizador)
			return "El cohce incorpora climatizador";
		else
			return "El coche lleva aire acondicionado";
	}

	public void configura_climatizador(String climatizador) {
		if(climatizador.equalsIgnoreCase("si"))
			this.climatizador = true;
		else 
			this.climatizador=false;
	}
	
	public String dime_peso_coche(){
		int peso_carroceria=500;
		peso_total=peso_plataforma+peso_carroceria;
		if(asientos_cuero)
			peso_total+=50;
		if(climatizador)
			peso_total+=20;
		return "El peso del coche es " + peso_total;
	}
}

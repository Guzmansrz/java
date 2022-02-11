package clases;

public class Cuenta {

	private Persona titular;
	private double cantidad;

	public Cuenta(Persona titular, double cantidad) {
		setTitular(titular);
		setCantidad(cantidad);
	}

	public Cuenta() {
	}

	protected void setTitular(Persona titular) {
		this.titular = titular;
	}

	protected void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}

	public Persona getTitular() {
		return titular;
	}

	public double getCantidad() {
		return cantidad;
	}

	@Override
	public String toString() {
		return "Cuenta [titular:" + titular.getNombre() + " " + titular.getApellidos() + " con DNI: " + titular.getDni() + ", cantidad=" + cantidad + "]";
	}

	public void ingresar(double ingreso) {
		if (ingreso > 0) {
			this.cantidad += ingreso;
		}
	}

	public void retirar(double retiro) {
		this.cantidad -= retiro;
		if (this.cantidad < 0) {
			this.cantidad = 0;
		}
	}
	
	public double mostrarSaldo() {
		return getCantidad();
	}

}

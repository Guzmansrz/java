package luces;

public class Bombilla {
	private boolean encendida;
	public static boolean interruptorGeneral = true;

	public Bombilla() {
		this.encendida = false;
	}

	public void apagar() {
		this.encendida = false;
	}

	public void encender() {
		this.encendida = true;
	}

	public String getEstado() {
		if (isEncendida())
			return "La bombilla esta encendida";
		else
			return "La bombilla esta apagada";
	}

	public boolean isEncendida() {
		return encendida && interruptorGeneral;
	}

	public void setEncendida(boolean encendida) {
		this.encendida = encendida;
	}

	public static void apagarGeneral() {
		Bombilla.interruptorGeneral = false;
	}
	public static void encenderGeneral() {
		Bombilla.interruptorGeneral = true;
	}
}

package reloj;

public class Main {

	public static void main(String[] args) {
		Hora h1 = new Hora(23, 56, 8);
		Hora h2 = new Hora(12, 40, 56);
		Hora h3= new Hora();
		h3=Hora.sumaHoras(h1,h2);
		System.out.println(h3.verHora());
		Hora h4 = new Hora(23, 56, 8);
		Hora h5 = new Hora(23, 56, 8);
		h4.compararHoras(h4,h5);
		h3=Hora.sumaHoras(h4,h5);
		System.out.println(h3.verHora());
		System.out.println(Hora.mayor_que(h1, h2));
	}

}

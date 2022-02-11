package general;

public class Main {

	public static void main(String[] args) {
		Cafetera caf = new Cafetera(1200, 1000);
		System.out.println(caf.toString());
		System.out.println();
		
		caf.llenarCafetera();
		System.out.println("Despues de llenarlo");
		System.out.println(caf.toString());
		System.out.println();
		
		caf.servirTaza(300);
		System.out.println("Despues de servir una taza de 300");
		System.out.println(caf.toString());
		System.out.println();
		
		caf.vaciarCafetera();
		System.out.println("Despues de vaciar la cafetera");
		System.out.println(caf.toString());
		System.out.println();
		
		caf.agregarCafe(1300);
		System.out.println("Agrego cafe por encima de la capacidad maxima");
		System.out.println(caf.toString());
		System.out.println();
		
		
		caf.servirTaza(1600);
		System.out.println("Sirvo cafe por encima de la capacidad actual");
		System.out.println(caf.toString());
	}

}

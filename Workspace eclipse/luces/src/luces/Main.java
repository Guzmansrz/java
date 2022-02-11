package luces;

public class Main {

	public static void main(String[] args) {
		Bombilla b1 = new Bombilla();
		Bombilla b2 = new Bombilla();
		Bombilla b3 = new Bombilla();
		Bombilla b4 = new Bombilla();
		b1.encender();
		b3.encender();
		System.out.println("Estado normal");
		System.out.println(b1.getEstado());
		System.out.println(b2.getEstado());
		System.out.println(b3.getEstado());
		System.out.println(b4.getEstado());
		System.out.println();
		
		Bombilla.apagarGeneral();
		System.out.println("El interruptor general esta apagado");
		System.out.println(b1.getEstado());
		System.out.println(b2.getEstado());
		System.out.println(b3.getEstado());
		System.out.println(b4.getEstado());
		System.out.println();
		
		Bombilla.encenderGeneral();
		System.out.println("El interruptor general esta encendido");
		System.out.println(b1.getEstado());
		System.out.println(b2.getEstado());
		System.out.println(b3.getEstado());
		System.out.println(b4.getEstado());
	}

}

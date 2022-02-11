package principal;

import radio.Sintonizador;

public class Main {

	public static void main(String[] args) {
		Sintonizador sinto = new Sintonizador();
		sinto.display();
		sinto.up();
		sinto.display();
	}

}

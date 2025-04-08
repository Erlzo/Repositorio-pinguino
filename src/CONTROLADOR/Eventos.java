package CONTROLADOR;

import java.util.Random;
import MODELO.Inventario;

public class Eventos {

	// Obt = obtener
	public static Random random = new Random();
	public Inventario inventario; // Acceso al inventario

	public Eventos(Inventario inventario) {
		this.inventario = inventario; // Inicializamos el inventario al recibirlo por constructor
	}

	int obtPez;
	int obtBolaNieve;
	int obtDadoRapido;
	int obtDadoLento;

	public Eventos(int obtPez, int obtBolaNieve, int obtDadoRapido, int obtDadoLento) {
		this.obtPez = obtPez;
		this.obtBolaNieve = obtBolaNieve;
		this.obtDadoRapido = obtDadoRapido;
		this.obtDadoLento = obtDadoLento;
	}

	public int getObtPez() {
		return obtPez;
	}

	public void setObtPez(int obtPez) {
		this.obtPez = obtPez;
	}

	public int getObtBolaNieve() {
		return obtBolaNieve;
	}

	public void setObtBolaNieve(int obtBolaNieve) {
		this.obtBolaNieve = obtBolaNieve;
	}

	public int getObtDadoRapido() {
		return obtDadoRapido;
	}

	public void setObtDadoRapido(int obtDadoRapido) {
		this.obtDadoRapido = obtDadoRapido;
	}

	public int getObtDadoLento() {
		return obtDadoLento;
	}

	public void setObtDadoLento(int obtDadoLento) {
		this.obtDadoLento = obtDadoLento;
	}

	public void obtenerEventoAleatorio() {

		int evento = random.nextInt(4);

		int[] opciones = { 0, 0, 0, 0, 0, // cada posición representa un 5% de probabilidad
				1, 1, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3 };

		int indice = random.nextInt(opciones.length);
		int numFinal = opciones[indice];

		switch (evento) {
		case 0:
			obtPez = inventario.getPeces();
			if (obtPez == 2) {
				System.out.println("Has alcanzado el limite de peces (Max:2)");
			} else {
				System.out.println("Has conseguido 1 pez ");
				inventario.setPeces(inventario.getPeces() + 1);
			}
			break;
		case 1:
			
			obtBolaNieve = inventario.getBolasNieve();
			
			int bolas = random.nextInt(3) + 1;
			if(obtBolaNieve == 6) {
				System.out.println("Has alcanzado el limite de bolas de nieve (Max:6)");
			}else {
			if (bolas == 1) {
				System.out.println("Has conseguido " + bolas + " bola de nieve");
			} else {
				System.out.println("Has conseguido " + bolas + " bolas de nieve");
			}

			inventario.setBolasNieve(inventario.getBolasNieve() + bolas);
			}
			break;
		case 2:
			obtDadoRapido = inventario.getDadoRapido();
			obtDadoLento = inventario.getDadoLentos();

			if ((obtDadoRapido + obtDadoLento) == 3) {
				System.out.println("Has alcanzado el limite de dados (Max:3)");
			} else {
				System.out.println("Has conseguido 1 dado rapido ");
				inventario.setDadoRapido(inventario.getDadoRapido() + 1);
			}
			break;
		case 3:
			obtDadoRapido = inventario.getDadoRapido();
			obtDadoLento = inventario.getDadoLentos();

			if ((obtDadoRapido + obtDadoLento) == 3) {
				System.out.println("Has alcanzado el limite de dados (Max:3)");
			} else {
				System.out.println("Has conseguido 1 dado lento  ");
				inventario.setDadoLentos(inventario.getDadoLentos() + 1);
			}
			break;
		}

	}

}

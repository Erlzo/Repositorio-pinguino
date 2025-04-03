package MODELO;

import java.util.Random;
import MODELO.Inventario;

public class Dados {

	Random random = new Random();

	public Inventario inventario; // Acceso al inventario

	public Dados(Inventario inventario) {
		this.inventario = inventario; // Inicializamos el inventario al recibirlo por constructor
	}

	int dadoNormal;
	int dadoRapido;
	int dadoLento;

	public int dadosUtilizados(int dadosElegidos) {

		if (dadosElegidos == 1) { // normal

			dadoNormal = random.nextInt(6) + 1;
			System.out.println("Avanzas " + dadoNormal + " posiciones.");
			return dadoNormal;
		} else if (dadosElegidos == 2) {// lento
			if (inventario.getDadoLentos() > 0) {
				dadoLento = new Random().nextInt(3) + 1;
				System.out.println("Avanzas " + dadoLento + " posiciones.");
				inventario.setDadoLentos(inventario.getDadoLentos() - 1);
				return dadoLento;
			} else {
				System.out.println("Error: Tienes " + inventario.getDadoLentos() + " dados.");
			}
		} else {// rapido
			if (inventario.getDadoRapido() > 0) {
				dadoRapido = new Random().nextInt(6) + 5;
				System.out.println("Avanzas " + dadoRapido + " posiciones.");
				inventario.setDadoRapido(inventario.getDadoRapido() - 1);
				return dadoRapido;
			}else {
				System.out.println("Error: Tienes " + inventario.getDadoRapido() + " dados.");
			}
		}
		
		return 0;
	}

}

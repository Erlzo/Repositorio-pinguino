package MODELO;

import CONTROLADOR.Eventos;
import MODELO.MoverFicha;

public class Tablero {

	public static String oso = "🐻";
	public static String agujeroHielo = "🌀";
	public static String trineo = "🛷";
	public static String eventoAleatorio = "?";

	public MoverFicha moverFicha;

	String[][] tablero = { { trineo, "|41|", "|42|", agujeroHielo, "|44|", eventoAleatorio, "|46|", oso, "|48|", "|🏁|" },
			/* 1 */ { "|39|", "|38|", eventoAleatorio, "|36|", "|35|", oso, "|33|", "|32|", agujeroHielo,eventoAleatorio },
			/* 2 */ { "|20|", "|21|", eventoAleatorio, agujeroHielo, "|24|", "|25|", trineo, "|27|", oso, "|29|" },
			/* 3 */ { "|19|", trineo, eventoAleatorio, "|16|", "|15|", "|14|", eventoAleatorio, "|12|", "|11|","|10|" },
			/* 4 */ { "|🚩|", "|1|", "|2|", agujeroHielo, "|4|", "|5|", "|6|", trineo, eventoAleatorio, "|9|" } };

	public void tablero() {

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();

		}

	}

	public int[] posTablero(int fila, int columna) {

		System.out.println(tablero[fila][columna]);

		String posi = tablero[fila][columna];

		if (posi.equals(oso)) {
			fila = 4;
			columna = 0;
		}

		// AGUJERO HIELO.
		
		if (posi.equals(tablero[2][3])) {
			fila = 4;
			columna = 3;
		} else if (posi.equals(tablero[1][8])) {
			fila = 2;
			columna = 3;
		} else if (posi.equals(tablero[0][3])) {
			fila = 1;
			columna = 8;
		}

		// TRINEO
		if (posi.equals(tablero[4][7])) {
			fila = 3;
			columna = 1;
		}else if (posi.equals(tablero[3][1])) {
			fila = 2;
			columna = 6;
		}else if (posi.equals(tablero[2][6])) {
			fila = 0;
			columna = 0;
		}

		return new int[] { fila, columna };

	}

	public int[] posTableroEvento(int fila, int columna) {

		String posi = tablero[fila][columna];

		if (posi.equals(eventoAleatorio)) {

			fila = 4;
			columna = 0;
		}
		return new int[] { fila, columna };

	}
}

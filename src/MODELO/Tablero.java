package MODELO;

public class Tablero {

	public Tablero() {

	}

	public static String oso = "🐻";
	public static String agujeroHielo = "🌀";
	public static String trineo = "🛷";
	public static String eventoAleatorio = "?";
	
	
	public static void tablero() {

		String[][] tablero = { { trineo, "|41|", "|42|", agujeroHielo, "|44|", eventoAleatorio, "|46|", oso, "|48|", "🏁" },
							   { "|39|", "|38|", eventoAleatorio, "|36|", "|35|", oso, "|33|", "|32|",agujeroHielo , eventoAleatorio },
							   { "|20|", "|21|", eventoAleatorio, agujeroHielo, "|24|", "|25|", trineo, "|27|", oso, "|29|" },
							   { "|19|", trineo, eventoAleatorio, "|16|", "|15|", "|14|", eventoAleatorio, "|12|", "|11|", "|10|" },
							   { "🚩", "|1|", "|2|", agujeroHielo, "|4|", "|5|", "|6|", trineo, eventoAleatorio, "|9|" } };

		for (int i = 0; i < tablero.length; i++) {
			for (int j = 0; j < tablero[i].length; j++) {
				System.out.print(tablero[i][j] + " ");
			}
			System.out.println();

		}

	}
	
	
	
	public static void main(String[] args) {
		
		tablero();
		
	}

	
	
}

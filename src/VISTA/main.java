package VISTA;

import java.util.Scanner;

import MODELO.Tablero;
import MODELO.Dados;
import MODELO.Inventario;
import MODELO.MoverFicha;
import MODELO.Pingüino;
import CONTROLADOR.Eventos;

import java.util.Random;

public class main {

	public static int dadoRapido = 1;
	public static int dadoLentos = 1;
	public static int peces = 1;
	public static int bolasNieve = 2;
	public static String nombre;
	public static String color;
	public static int id = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tablero tablero = new Tablero();
		Inventario inventario = new Inventario(dadoRapido, dadoLentos, peces, bolasNieve);
		Pingüino fichaJugador = new Pingüino(id, nombre, color);
		Eventos eventos = new Eventos(inventario); // Crear el objeto Eventos y pasar el inventario como parámetro
		Dados dados = new Dados(inventario);
		MoverFicha moverFicha = new MoverFicha();
		Scanner scanner = new Scanner(System.in);

		
		
		System.out.println("---- BIENVENIDO AL JUEGO DEL PINGÜINO ----\n");
		System.out.println("Escribe tu nombre de jugador: ");
		nombre = scanner.next();
		System.out.println("Escribe el color de tu ficha:");
		color = scanner.next();

		fichaJugador = new Pingüino(id, nombre, color);

		System.out.println("¡Perfecto! - Empezemos el juego");

		boolean continuar = true;

		while (continuar) {

			System.out.println("¿Que quieres hacer?");
			System.out.println("1 - Avanzar casilla");
			System.out.println("2 - Ver inventario");
			System.out.println("3 - Guardar/Cargar partida");
			System.out.println("4 - Reglas del juego");
			System.out.println("5 - Salir del juego");
			int opcion = scanner.nextInt();

			switch (opcion) {
			case 1:

				System.out.println("Este es el tablero");
				tablero.tablero();

				System.out.println("¿Que dado quieres utilizar?");
				System.out.println("1 - Dado normal");
				System.out.println("2 - Dado lento");
				System.out.println("3 - Dado rapido");
				int dadosElegidos = scanner.nextInt();
				
				int posicion = dados.dadosUtilizados(dadosElegidos);
				
				moverFicha.movimientoFicha(posicion);
				
				eventos.obtenerEventoAleatorio(); // SOLO PARA PRUEBA - QUITAR DEL CODIGO FINAL
				
				break;
			case 2:

				inventario.mostrarInventario(fichaJugador);

				break;
			case 3:

				break;
			case 4:

				break;
			case 5:
				System.out.println("Saliendo del juego...");
				continuar = false;
				break;
			default:

				System.out.println("Error: Opción no disponible, intentalo otra vez.");

				break;
			}

		}
	}

}

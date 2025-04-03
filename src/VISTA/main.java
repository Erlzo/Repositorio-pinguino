package VISTA;

import java.util.Scanner;

import MODELO.Tablero;
import MODELO.Inventario;
import MODELO.Pingüino;

import java.util.Random;

public class main {
	
	public static int dadoRapido;
	public static int dadoLentos;
	public static int peces;
	public static int bolasNieve;
	public static String nombre;
	public static String color;
	public static int id = 1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tablero tablero = new Tablero();
		Inventario inventario = new Inventario(dadoRapido, dadoLentos, peces, bolasNieve);
		Pingüino fichaJugador = new Pingüino(id, nombre, color);
		
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
			int opcion = scanner.nextInt();
			
			System.out.println("Este es el tablero");
			tablero.tablero();
			
			switch (opcion) {
			case 1:
				
				
				
				break;
			case 2:
				
				inventario.mostrarInventario();
				
				break;
			case 3:
				
				
				
				break;
				
			default:
				
				System.out.println("Error: Opción no disponible, intentalo otra vez.");
				
				break;
			}
			
		}
	}

}

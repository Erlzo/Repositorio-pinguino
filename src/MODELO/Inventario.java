package MODELO;

import java.util.Scanner;

public class Inventario {
	Scanner scanner = new Scanner(System.in);
	int dadoRapido = 1;
	int dadoLentos = 1;
	int peces = 1;
	int bolasNieve = 2;

	public Inventario(int dadoRapido, int dadoLentos, int peces, int bolasNieve) {
		this.dadoRapido = dadoRapido;
		this.dadoLentos = dadoLentos;
		this.peces = peces;
		this.bolasNieve = bolasNieve;
	}

	public int getdadoRapido() {
		return dadoRapido;
	}

	public void setdadoLentos(int dadoLentos) {
		this.dadoLentos = dadoLentos;
	}

	public int getdadoLentos() {
		return dadoLentos;
	}

	public void setdadoRapido(int dadoRapido) {
		this.dadoRapido = dadoRapido;
	}

	public int getPeces() {
		return peces;
	}

	public void setPeces(int peces) {
		this.peces = peces;
	}

	public int getBolasNieve() {
		return bolasNieve;
	}

	public void setBolasNieve(int bolasNieve) {
		this.bolasNieve = bolasNieve;
	}

	public void mostrarInventario(String jugador, int dadoRapido, int dadoLentos, int peces, int bolasNieve) {

		System.out.println("Este es tu inventario: ");
		System.out.println("1-Dados rapidos: " + this.dadoRapido);
		System.out.println("2-Dados lentos: " + this.dadoLentos);
		System.out.println("3-Peces: " + this.peces);
		System.out.println("4-Bolas de nieve: " + this.bolasNieve);

	}

	public int eleccionInventario(String jugador, int dadoRapido, int dadoLentos) {

		System.out.println("Este es tu inventario: ");
		System.out.println("1-Dado normal");
		System.out.println("2-Dados rapidos: " + this.dadoRapido);
		System.out.println("3-Dados lentos: " + this.dadoLentos);
		System.out.println("4-Atras");
		System.out.println("Que quieres hacer? ");
		int eleccion = scanner.nextInt();
		return eleccion;

	}

}

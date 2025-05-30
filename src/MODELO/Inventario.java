package MODELO;

import java.util.Scanner;

public class Inventario {
	Scanner scanner = new Scanner(System.in);
	int dadoRapido;
	int dadoLentos;
	int peces;
	int bolasNieve;

	public Inventario(int dadoRapido, int dadoLentos, int peces, int bolasNieve) {
		this.dadoRapido = dadoRapido;
		this.dadoLentos = dadoLentos;
		this.peces = peces;
		this.bolasNieve = bolasNieve;
	}

	public int getDadoRapido() {
		return dadoRapido;
	}

	public void setDadoLentos(int dadoLentos) {
		this.dadoLentos = dadoLentos;
	}

	public int getDadoLentos() {
		return dadoLentos;
	}

	public void setDadoRapido(int dadoRapido) {
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

	public void mostrarInventario(Pingüino jugadorMain) {
		System.out.println("Este es tu inventario " + jugadorMain.toString() + ": ");
		System.out.println("1-Dados rapidos: " + dadoRapido);
		System.out.println("2-Dados lentos: " + dadoLentos);
		System.out.println("3-Peces: " + peces);
		System.out.println("4-Bolas de nieve: " + bolasNieve);

	}

}

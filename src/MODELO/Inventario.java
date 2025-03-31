package MODELO;

public class Inventario {

	int dados;
	int peces;
	int bolasNieve;

	public Inventario(int dados, int peces, int bolasNieve) {
		this.dados = dados;
		this.peces = peces;
		this.bolasNieve = bolasNieve;
	}

	public int getDados() {
		return dados;
	}

	public void setDados(int dados) {
		this.dados = dados;
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



}

package CONTROLADOR;

public class Objetos {

	int pez;
	int bolaDeNieve;
	int dadoRapido;
	int dadoLento;
	
	public Objetos(int pez, int bolaDeNieve, int dadoRapido, int dadoLento) {
		
		this.pez = pez;
		this.bolaDeNieve = bolaDeNieve;
		this.dadoRapido = dadoRapido;
		this.dadoLento = dadoLento;
		
	}
	
	public void setPez(int pez) {
		this.pez = pez;
	}
	
	public void setBolaDeNieve(int bolaDeNieve) {
		this.bolaDeNieve = bolaDeNieve;
	}
	
	public void setDadoRapido(int dadoRapido) {
		this.dadoRapido = dadoRapido;
	}
	
	public void setDadoLento(int dadoLento) {
		this.dadoLento = dadoLento;
	}
	
	public int getPez() {
		return pez;
	}
	
	public int getBolaDeNieve() {
		return bolaDeNieve;
	}
	
	public int getDadoRapido() {
		return dadoRapido;
	}
	
	public int getDadoLento() {
		return dadoLento;
	}
}



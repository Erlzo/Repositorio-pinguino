package CONTROLADOR;

public class Guerra_jugadores {
	
String jugadores;
int bolas = 0;
int casillas = 0;
	

public Guerra_jugadores(String jugadores, int bolas, int casillas) {
	
	this.jugadores = jugadores;
	this.bolas = bolas;
	this.casillas = casillas;

}
	
//getters y setters
public void setJugadores(String jugadores){
	this.jugadores = jugadores;
}

public void setBolas(int bolas){
	this.bolas = bolas;
}

public void setCasillas(int casillas){
	this.casillas = casillas;
}
	
public String getJugadores() {
	return jugadores;
	
}
public int getBolas() {
	return bolas;
	
}
public int getCasillas() {
	return casillas;
	
}


}

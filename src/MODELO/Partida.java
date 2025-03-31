package MODELO;

public class Partida {

	int turnos;
	String Guardarpartida; 
	String cargarpartida; 
	
	public Partida(int turnos, String Guardarpartida, String cargarpartida) {
		this.turnos= turnos;
		this.Guardarpartida=Guardarpartida;
		this.cargarpartida=cargarpartida;
		
		
	}
	
	// Getters
    public int getTurnos() {
        return turnos;
    }

    public String getGuardarpartida() {
        return Guardarpartida;
    }

    public String getCargarpartida() {
        return cargarpartida;
    }

    // Setters
    public void setTurnos(int turnos) {
        this.turnos = turnos;
    }

    public void setGuardarpartida(String Guardarpartida) {
        this.Guardarpartida = Guardarpartida;
    }

    public void setCargarpartida(String cargarpartida) {
        this.cargarpartida = cargarpartida;
    }
}


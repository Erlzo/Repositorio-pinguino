package CONTROLADOR;

public class Eventos {
	
	//Obt = obtener
	
	String Obtpez;
	String Obtbolanieve; //entre 1-3
	String Obtdadorapido;
	int turno;
	int perderObjdelInventario;
	int MotodeNieve;
	
	public Eventos(String Obtpez, String Obtbolanieve, String Obtdadorapido, int turno, int perderObjdelInventario, int MotodeNieve) {
		this.Obtpez = Obtpez;
		this.Obtbolanieve = Obtbolanieve;
		this.Obtdadorapido= Obtdadorapido;
		this.turno = turno;
		this.perderObjdelInventario = perderObjdelInventario;
		this.MotodeNieve = MotodeNieve;
	}
	
	// Getters
    public String getObtpez() {
        return Obtpez;
    }

    public String getObtbolanieve() {
        return Obtbolanieve;
    }

    public String getObtdadorapido() {
        return Obtdadorapido;
    }

    public int getTurno() {
        return turno;
    }

    public int getPerderObjdelInventario() {
        return perderObjdelInventario;
    }

    public int getMotodeNieve() {
        return MotodeNieve;
    }

    // Setters
    public void setObtpez(String Obtpez) {
        this.Obtpez = Obtpez;
    }

    public void setObtbolanieve(String Obtbolanieve) {
        this.Obtbolanieve = Obtbolanieve;
    }

    public void setObtdadorapido(String Obtdadorapido) {
        this.Obtdadorapido = Obtdadorapido;
    }

    public void setTurno(int turno) {
        this.turno = turno;
    }

    public void setPerderObjdelInventario(int perderObjdelInventario) {
        this.perderObjdelInventario = perderObjdelInventario;
    }

    public void setMotodeNieve(int MotodeNieve) {
        this.MotodeNieve = MotodeNieve;
    }
	
}

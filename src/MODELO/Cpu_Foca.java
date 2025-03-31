package MODELO;

public class Cpu_Foca {
	
	 public int posicion;
	 public int inventario;
	 public int ultimoAgujero;
	
	
	 public Cpu_Foca(int  posicion , int inventario, int ultimoAgujero) {
		 
	        this.posicion = posicion;
	        this.inventario = inventario;
	        this.ultimoAgujero = 0; 
	    }
	    
	//getters y setters
	
	    
	    public int getPosicion() {
	        return posicion;
	    }
	    
	    public void setPosicion(int nuevaPosicion) {
	        this.posicion = nuevaPosicion;
	    }
	    
	    public int getInventario() {
	        return inventario;
	    }
	    
	    public void setInventario(int nuevoInventario) {
	        this.inventario = nuevoInventario;
	    }
	    
	    public int getUltimoAgujero() {
	        return ultimoAgujero;
	    }
	    
	    public void setUltimoAgujero(int agujero) {
	        this.ultimoAgujero = agujero;
	    }

}

package CONTROLADOR;


public class Eventos {
	
	Random random = new Random();
    int evento = random.nextInt(4); 

    switch (evento) {
        case 0:
            return ObtenerPescado();
        case 1:
            return obtenerBolaNieve();
        case 2:
            return obetnerDadoRapido();
        case 3:
            return obtenerDadoLento();
        default:
            return "🎟 No has elegido ningun evento 🎟";
    }
    
    public static String obetnerDadoRapido() {
            int casillas = new Random().nextInt(6) + 5; 
            return "Has conseguido el dado rapido --> " + casillas + " casillas ";
        }
        return "No has conseguido el dado rapido 🎲";
    }

  
    public static String obtenerDadoLento() {
        int casillas = new Random().nextInt(3) + 1; 
        return "Has conseguido el dado lento --> " + casillas ;
    }
}
	
    
}
	
	
	
	


}

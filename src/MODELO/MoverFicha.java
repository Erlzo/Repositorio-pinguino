package MODELO;

import MODELO.Dados;
import MODELO.Tablero;

public class MoverFicha {
    private int fila;
    private int columna;
    private int maxFilas = 4;  // Número de filas
    private int maxColumnas = 9;  // Número de columnas

	Tablero tablero = new Tablero();

    public MoverFicha() {
        // Empieza en la esquina inferior izquierda (fila 5, columna 1)
        this.fila = maxFilas;
        this.columna = 0;
    }

    // Mover la ficha de derecha a izquierda y subir de fila
    public void movimientoFicha(int posicionDado) {
        for (int i = 0; i < posicionDado; i++) {  // Mover solo la cantidad de posiciones del dado
            
            // Movimiento de derecha a izquierda
            if (fila % 2 == maxFilas % 2) { // Si la fila es par (empezando desde abajo), se mueve hacia la derecha
                if (columna < maxColumnas) {
                    columna++;  // Avanza a la derecha
                } else { 
                    fila--;     // Sube una fila cuando llega al final
                }
            } 
            // Movimiento de izquierda a derecha
            else {
                if (columna > 1) {
                    columna--;  // Avanza a la izquierda
                } else {
                    fila--;     // Sube una fila cuando llega al final
                }
            }

            // Detener el movimiento si llegamos a la primera fila
            if (fila <= 0) {
                System.out.println("La ficha ha llegado al final del tablero.");
                break;
            }
        }
        mostrarPosicion();

    }

    // Mostrar la posición actual de la ficha
    public void mostrarPosicion() {
        System.out.println("Ficha en fila: " + fila + ", columna: " + columna);
        tablero.posTablero(fila,columna);
    }

}

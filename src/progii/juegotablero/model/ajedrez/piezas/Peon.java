package progii.juegotablero.model.ajedrez.piezas;

import anotacion.Programacion2;
import list.ArrayList;
import progii.juegotablero.model.Casilla;
import progii.juegotablero.model.Jugador;
import progii.juegotablero.model.ajedrez.PiezaAjedrez;
import progii.juegotablero.model.ajedrez.TipoPiezaAjedrez;

@Programacion2 (
        nombreAutor1 = "Guillermo",
		apellidoAutor1 = "Buendia",
		emailUPMAutor1 = "guillermo.buendiad@alumnos.upm.es",
		nombreAutor2 = "Adrian",
		apellidoAutor2 = "Serrano López-Álvarez",
		emailUPMAutor2 = "adrian.serranol@alumnos.upm.es"
)

public class Peon extends PiezaAjedrez {

	public Peon(Jugador jugador, int fila, char columna) {
		super(jugador, TipoPiezaAjedrez.PEON, fila, columna);
	}


	public ArrayList<Casilla> movimientosValidos() {
		ArrayList<Casilla> resultado = new ArrayList<>();
		if (this.getJugador().getNombre().equals("NEGRO")) {
			this.auxiliar(resultado , 1 , 7);
		}
		if (this.getJugador().getNombre().equals("BLANCO")) {
			this.auxiliar(resultado, -1, 2);
		}
		return resultado;
	}
	
	public void auxiliar(ArrayList<Casilla> resultado, int num, int num2) {
		if (this.getFilaAjedrez() == num2 && Peon.queHay(getFila() + num, getColumna()) == null
				&& Peon.queHay(getFila() + 2*num, getColumna()) == null) {
			this.casillaVisitable(resultado, getFila() + 2*num , getColumna());// si es el primer movimiento puede mover																			// hasta dos
		}
		if (Peon.queHay(getFila() + num, getColumna()) == null) {
			this.casillaVisitable(resultado, this.getFila() + num, this.getColumna());
		}
		if (Peon.queHay(getFila() + num, getColumna() + 1) != null) {
			this.casillaVisitable(resultado, this.getFila() + num, this.getColumna() + 1);
		}
		if (Peon.queHay(getFila() + num, getColumna() - 1) != null) {
			this.casillaVisitable(resultado, this.getFila() + num, this.getColumna() - 1);
		}
	}

}

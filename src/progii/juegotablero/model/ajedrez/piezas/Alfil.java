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
public class Alfil extends PiezaAjedrez {

	public Alfil(Jugador jugador, int fila, char columna) {
		super(jugador, TipoPiezaAjedrez.ALFIL, fila, columna);
	}

	public ArrayList<Casilla> movimientosValidos() {
		ArrayList<Casilla> resultado = new ArrayList<>();
		// movimiento diagonal
		this.casillasVisitables(resultado, 1, 1);
		this.casillasVisitables(resultado, -1, -1);
		this.casillasVisitables(resultado, 1, -1);
		this.casillasVisitables(resultado, -1, 1);
		return resultado;

	}

}

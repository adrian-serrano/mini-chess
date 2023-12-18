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

public class Reina extends PiezaAjedrez{
	
	public Reina(Jugador jugador, int fila, char columna) {
		super(jugador, TipoPiezaAjedrez.REINA, fila, columna);	
	}
	public ArrayList<Casilla> movimientosValidos(){
		ArrayList<Casilla> resultado = new ArrayList<>();

        //movimiento horizontal
        this.casillasVisitables(resultado, 1, 0);
        this.casillasVisitables(resultado, -1, 0);

        //movimiento vertical
        this.casillasVisitables(resultado, 0, -1);
        this.casillasVisitables(resultado, 0, 1);
        
        //movimiento diagonal
        this.casillasVisitables(resultado, 1, 1);
        this.casillasVisitables(resultado, -1, -1);
        this.casillasVisitables(resultado, 1, -1);
        this.casillasVisitables(resultado, -1, 1);
        
		return resultado;
		
	}

}

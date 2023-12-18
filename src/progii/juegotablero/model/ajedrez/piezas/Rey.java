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

public class Rey extends PiezaAjedrez{
	
	public Rey(Jugador jugador, int fila, char columna) {
		super(jugador,TipoPiezaAjedrez.REY, fila, columna);
	}

	public ArrayList<Casilla> movimientosValidos(){
		ArrayList<Casilla> resultado = new ArrayList<>();
        //movimiento horizontal
        this.casillaVisitable(resultado, this.getFila()+1, this.getColumna());
        this.casillaVisitable(resultado, this.getFila()-1, this.getColumna());

        //movimiento vertical
        this.casillaVisitable(resultado, this.getFila(), this.getColumna()+1);
        this.casillaVisitable(resultado, this.getFila(), this.getColumna()-1);

        //movimiento diagonal
        this.casillaVisitable(resultado, this.getFila()+1, this.getColumna()+1);
        this.casillaVisitable(resultado, this.getFila()-1, this.getColumna()-1);
        this.casillaVisitable(resultado, this.getFila()+1, this.getColumna()-1);
        this.casillaVisitable(resultado, this.getFila()-1, this.getColumna()+1);
		return resultado;
		
	}

}

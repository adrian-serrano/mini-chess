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

public class Caballo extends PiezaAjedrez{


	public Caballo(Jugador jugador, int fila, char columna) {
		super(jugador, TipoPiezaAjedrez.CABALLO, fila, columna);

		
	}

	@Override
	public ArrayList<Casilla> movimientosValidos() {
        ArrayList<Casilla> resultado = new ArrayList<>();
        this.casillaVisitable(resultado, this.getFila()+2, this.getColumna()+1);
        this.casillaVisitable(resultado, this.getFila()+2, this.getColumna()-1);

        this.casillaVisitable(resultado, this.getFila()-2, this.getColumna()+1);
        this.casillaVisitable(resultado, this.getFila()-2, this.getColumna()-1);

        this.casillaVisitable(resultado, this.getFila()+1, this.getColumna()+2);
        this.casillaVisitable(resultado, this.getFila()-1, this.getColumna()+2);

        this.casillaVisitable(resultado, this.getFila()+1, this.getColumna()-2);
        this.casillaVisitable(resultado, this.getFila()-1, this.getColumna()-2);
        return resultado;
	}

}

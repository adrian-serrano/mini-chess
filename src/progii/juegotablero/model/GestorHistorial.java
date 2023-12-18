package progii.juegotablero.model;


import anotacion.Programacion2;
import progii.juegotablero.exceptions.MovimientoException;
import stacks.Stack;
import stacks.exceptions.EmptyStackException;

@Programacion2 (
        nombreAutor1 = "Guillermo",
		apellidoAutor1 = "Buendia",
		emailUPMAutor1 = "guillermo.buendiad@alumnos.upm.es",
		nombreAutor2 = "Adrian",
		apellidoAutor2 = "Serrano López-Álvarez",
		emailUPMAutor2 = "adrian.serranol@alumnos.upm.es"
)


/**
 * Clase que gestiona el historial de movimientos de la partida
 * 
 *
 */
public class GestorHistorial {
	
	/**
	 * Pila con los movimientos a deshacer
	 */
	private Stack<Movimiento> pilaDeshacer; 
	
	/**
	 * Pila con los movimientos a rehacer
	 */
	private Stack<Movimiento> pilaRehacer; 
	
	/**
	 * Crea e inicializa las pilas del gestor del historial
	 */
	public GestorHistorial() {
		this.pilaDeshacer = new Stack <> ();
		this.pilaRehacer = new Stack <> ();
	}
	
	/**
	 * Guarda un nuevo movimientos en el historial
	 * @param movimiento Movimiento a guardar
	 */
	public void guardarMovimiento (Movimiento movimiento) {
		pilaDeshacer.push(movimiento);
		if (!pilaRehacer.isEmpty()){
			pilaRehacer.makeEmpty();
		}
	}
	
	/**
	 * Devuelve el último movimiento realizado y lo elimina de la pila de deshacer
	 * @return El movimiento a deshacer
	 * @throws MovimientoException En caso de que no haya movimientos que deshacer
	 */
	public Movimiento deshacer () throws MovimientoException {
        if(pilaDeshacer.isEmpty()) {
            throw new MovimientoException ("No se puede deshacer porque no hay movimientos para deshacer");
        }else {
            Movimiento movimiento = null;
			try {
				movimiento = this.pilaDeshacer.pop();
			} catch (EmptyStackException e) {
				e.printStackTrace();
			}
            this.pilaRehacer.push(movimiento);
            return movimiento;
        }
	}
	
	
	/**
	 * Devuelve el último movimiento deshecho y lo elimina de la pila de rehacer
	 * @return El movimiento a rehacer
	 * @throws MovimientoException En caso de que no haya movimientos que rehacer
	 */
	public Movimiento rehacer () throws MovimientoException {
		if(pilaRehacer.isEmpty()) {
			throw new MovimientoException ("No se puede rehacer porque no hay movimientos para rehacer");
		}else {
			Movimiento movimiento = null;
			try {
				movimiento = this.pilaRehacer.pop();
			} catch (EmptyStackException e) {
				e.printStackTrace();
			}			
			this.pilaDeshacer.push(movimiento);
			return movimiento;
		}
	}	
}

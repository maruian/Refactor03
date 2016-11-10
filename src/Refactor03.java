
public class Refactor03 {

	public static void main(String[] args) {
		//Calculamos el movimiento de un peón en un tablero de ajedrez
		//Para una partida con más peones
		//Juegan negras en la parte inferior del tablero
		int colPeonNegra=1;
		int filPeonNegra=3;
		int colPeonBlanca=1;
		int filPeonBlanca=3;
		int sigmovColPeonNegra;
		int sigmovFilPeonNegra;
		
		//Calculamos siguiente movimieto
		if((colPeonNegra++==colPeonBlanca)&&(filPeonNegra++==filPeonBlanca)){
			//Me como blanca colocado en diagonal derecha
			sigmovColPeonNegra=colPeonNegra++;
			sigmovColPeonNegra=filPeonNegra++;
		}else if((colPeonNegra++==colPeonBlanca)&&(filPeonNegra--==filPeonBlanca)){
			//Este movimiento está mal
			//Me como blanca colocado en diagonal izda
			sigmovColPeonNegra=colPeonNegra++;
			sigmovColPeonNegra=filPeonNegra--;
		}else if((colPeonNegra++!=colPeonBlanca)){
			//Muevo adelante
			sigmovColPeonNegra=colPeonNegra++;
		}
	}

}

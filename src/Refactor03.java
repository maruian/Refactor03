
public class Refactor03 {

	//Calculamos el movimiento de un peón en un tablero de ajedrez
	//Para una partida con más peones
	//Juegan negras en la parte inferior del tablero
	private static int colPeonNegra;
	private static int filPeonNegra;
	private static int colPeonBlanca;
	private static int filPeonBlanca;
	private static int sigmovColPeonNegra;
	private static int sigmovFilPeonNegra;
	
	public Refactor03(){
		colPeonNegra=1;
		filPeonNegra=3;
		colPeonBlanca=1;
		filPeonBlanca=3;
	}
	
	
	public static void main(String[] args) {
		
		
		//Calculamos siguiente movimieto
		if(PodemosMoverDiagDerPeonBlanco()) {// colPeonNegra++==colPeonBlanca)&&(filPeonNegra++==filPeonBlanca)){
			//Me como blanca colocado en diagonal derecha
			MovemosDiagDerPeonBlanco();
		}else if(PodemosMoverDiagIzqPeonNegra()){ //(colPeonNegra++==colPeonBlanca)&&(filPeonNegra--==filPeonBlanca)
			//Este movimiento está mal
			//Me como blanca colocado en diagonal izda
			MovemosDiagIzqPeonNegra();
		}else if(PodemosMoverAdelantePeonNegra()){ //(colPeonNegra++!=colPeonBlanca)){
			//Muevo adelante
			MuevoAdelantePeonNegra();
		}
	}
	
	
	
	public static boolean PodemosMoverDiagDerPeonBlanco() {
		return ((colPeonNegra++==colPeonBlanca)&&(filPeonNegra++==filPeonBlanca))?true:false;
	}
	
	public static boolean PodemosMoverDiagIzqPeonNegra(){
		return (colPeonNegra++==colPeonBlanca)&&(filPeonNegra--==filPeonBlanca)?true:false;
	}
	
	public static boolean PodemosMoverAdelantePeonNegra(){
		return (colPeonNegra++!=colPeonBlanca)?true:false;
	}
		
	public static void MovemosDiagDerPeonBlanco(){
		sigmovColPeonNegra=colPeonNegra++;
		sigmovColPeonNegra=filPeonNegra++;
	}
	
	public static void MovemosDiagIzqPeonNegra(){
		sigmovColPeonNegra=colPeonNegra++;
		sigmovColPeonNegra=filPeonNegra--;
	}
	
	public static void MuevoAdelantePeonNegra(){
		sigmovColPeonNegra=colPeonNegra++;
	}
}




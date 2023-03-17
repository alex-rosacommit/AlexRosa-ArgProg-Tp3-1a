package alexRosa_Tp3_1a_package;

public class AlexRosa_Tp3_1a_Class {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadenaEjemplo = "Cadena para realizar el ejercicio";
		char letraBuscar = 'e';
		
		int vecesQueRepite = ContarLetra(cadenaEjemplo, letraBuscar);
		
		System.out.println("Veces en la que aparece '" + letraBuscar + "': " + vecesQueRepite);
	}
	
	private static int ContarLetra(String cadena, char letra) {
		int count = 0;
		
		for(int I = 0; I < cadena.length(); I++) {
			if(letra == cadena.charAt(I)) {
				count++;
			}
		}
		
		return count;
	}

}

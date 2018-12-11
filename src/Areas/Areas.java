package Areas;
import java.util.Scanner;
public class Areas {
	public static void menu() {
		System.out.println("	CÁLCULO DE AREAS	\n==============================\n\n1.Calcular el área de un triángulo\n2. Calcular el área de un trapecio\n3.Calcular el área de un rectágunlo\n4.Salir");;
		}
		
	public static double areaRectangulo(double base, double altura){
		boolean valid = true;
		double resultado=0;
		if (base < 2 || base > 10 ) {
			System.out.println("Base no valida");
			valid = false;
		}
		if (altura < 2 || altura >10) {
			System.out.println("Altura no valida");
			valid = false ;
		}
		if (valid == true) {
			
			resultado= base * altura  ;
			
		}else {
			System.out.println("No se ha podido calcular el area de su rectángulo");
		}
		return resultado;
	}
}


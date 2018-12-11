package Areas;
import java.util.Scanner;
public class Areas {
	public static void menu() {
		System.out.println("	CÁLCULO DE AREAS	\n==============================\n\n1.Calcular el área de un triángulo\n2. Calcular el área de un trapecio\n3.Calcular el área de un rectágunlo\n4.Salir");;
		}
		
	public static float areaRectangulo(float base, float altura){
		boolean valid = true;
		float resultado=0;
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
	public static float areaTriangulo(float base , float altura) {
		boolean valid = true;
		float resultado=0;
		if (base <=0 || altura <= 0 ) {
			System.out.println("La base o la altura no son validas");
			valid = false;
		}
		if (valid = true ) {
			resultado=(base * altura) /2;
		}
		return resultado; 
	}
	public static float areaTrapecio(float base1, float base2, float altura ) {
		float resultado=0;
		if (base2 > 0 && base1 >0 && base1!=base2) {
			double mediana = 0;
			mediana = (base2 +base1)/2;	
			resultado = (float) (altura * mediana) ;
		}else {
			System.out.println("La bases son negativas o bien ambas bases son de igual longitud");
		}
		return resultado;
	}
}


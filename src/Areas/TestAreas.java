package Areas;
import java.util.Scanner;
public class TestAreas {
//Rubén Núñez Valle 
//1ºDAM
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		//Hace un para que hasta que no se pulse 4 no se salga
		for(int i=0;i<5;i++) {
			i=0;
			//muestra el menú
			Areas.menu();
			float resultado=0;
			int opcion=0;
			float base1=0;
			float  altura=0;
			float base2=0;
			//lee la opcion del menú
			opcion = sc.nextInt();
			//ejecucion de las opciones
			switch (opcion) {
				case 1:
					System.out.println("Introduce el valor para la base del triángulo");
					base1=sc.nextFloat();
					System.out.println("Introduce el valor para la altura del triángulo");
					altura = sc.nextFloat();
					//realiza el area del triangulo con los valores introducidos
					resultado=Areas.areaTriangulo(base1, altura);
					//comprueba que haya un resultado efectivo
					if (resultado!=0)
						System.out.printf("El area del triángulo es de %.2f%n",resultado);
					//vuelve al menú
					break;
				case 2:
					System.out.println("Introduce el valor para la base 1 del trapecio");
					base1=sc.nextFloat();
					System.out.println("Introduce el valor para la base 2 del trapecio");
					base2 = sc.nextFloat();
					System.out.println("Introduce el valor para la altura del trapecio");
					altura = sc.nextFloat();
					//realiza el area del trapecio con los valores introducidos
					resultado = Areas.areaTrapecio(base1, base2, altura);
					//comprueba que haya un resultado efectivo
					if (resultado>0) {
						System.out.printf("El area del trapecio es de %.2f%n",resultado);
					}
					//vuelve al menú
					break;
				case 3:
					System.out.println("Introduce el valor para la base del rectángulo");
					base1=sc.nextFloat();
					System.out.println("Introduce el valor para la altura del rectángulo");
					altura = sc.nextFloat();
					//realiza el area del rectángulo con los valores introducidos
					resultado=Areas.areaRectangulo(base1, altura);
					//comprueba que haya un resultado efectivo
					if (resultado!=0)
						System.out.printf("El area del triángulo es de %.2f%n",resultado);
					//vuelve al menú
					break;
				case 4: 
					//Rompe el bucle principal
					i=6;
					//cierra el Scanner sc
					sc.close();
					//vuelve al menú
					break;
			}
		}
	}

}

package Areas;
import java.util.Scanner;
public class TestAreas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		for(int i=0;i<5;i++) {
			i=0;
			Areas.menu();
			float resultado=0;
			int opcion=0;
			float base1=0;
			float  altura=0;
			float base2=0;
			opcion = sc.nextInt();
			switch (opcion) {
				case 1:
					System.out.println("Introduce el valor para la base del triángulo");
					base1=sc.nextFloat();
					System.out.println("Introduce el valor para la altura del triángulo");
					altura = sc.nextFloat();
					resultado=Areas.areaTriangulo(base1, altura);
					if (resultado!=0)
						System.out.printf("El area del triángulo es de %.2f%n",resultado);
					break;
				case 2:
					System.out.println("Introduce el valor para la base 1 del trapecio");
					base1=sc.nextFloat();
					System.out.println("Introduce el valor para la base 2 del trapecio");
					base2 = sc.nextFloat();
					System.out.println("Introduce el valor para la altura del trapecio");
					altura = sc.nextFloat();
					resultado = Areas.areaTrapecio(base1, base2, altura);
					if (resultado>0) {
						System.out.printf("El area del trapecio es de %.2f%n",resultado);
					}
					break;
				case 3:
					System.out.println("Introduce el valor para la base del rectángulo");
					base1=sc.nextFloat();
					System.out.println("Introduce el valor para la altura del trectángulo");
					altura = sc.nextFloat();
					resultado=Areas.areaRectangulo(base1, altura);
					if (resultado!=0)
						System.out.printf("El area del triángulo es de %.2f%n",resultado);
					break;
				case 4: 
					i=6;
					sc.close();
					break;
			}
		}
	}

}

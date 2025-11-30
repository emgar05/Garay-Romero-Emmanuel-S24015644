import java.util.Scanner;
public class Ej3{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int opcion;
	float ad=1000, pago;
	do{
	System.out.println("Cajero Automatico");
	System.out.println("1-Consulta");
	System.out.println("2-Pago de mes");
	System.out.println("3-Pago adeudo");
	System.out.println("4-Salir");
	System.out.println("Elige una opción");
	opcion=sc.nextInt();
		switch(opcion){
			case 1:
				System.out.println("Su adeudo del mes es: " +ad);
				break;
			case 2:
				System.out.println("El adeudo de mes es: " +ad);
				System.out.println("Ingresa el monto que va a pagar: ");
				pago=sc.nextFloat();
				System.out.println("Su adeudo restante es de: " + (ad-pago));
				break;
			case 3:
				System.out.println("Su adeudo total es: " +ad);
				System.out.println("Ingrese el pago total: " + ad);
				System.out.println("Su adeudo es: " + (ad-ad));
				break;
			case 4:
				System.out.println("Saliendo...");
				break;
			default:
				System.out.println("Opcion no disponible");
				break;
			}
		}while (opcion!=4);
		sc.close();
	}
}

				


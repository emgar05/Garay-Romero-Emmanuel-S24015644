import java.util.Scanner;
public class Ej4{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int opcion;
	float sd=5000, mr;
		do{
			System.out.println("Bienvenido");
			System.out.println("Saldo disponible: " +sd);
			System.out.println("Ingrese el monto a retirar: ");
			mr=sc.nextFloat();
				if (mr>sd)
					System.out.println("Saldo insuficiente");
				else{
					sd= sd-mr;
					System.out.println("Sldo disponible: " +sd);
				}
			System.out.println("¿Desea retirar mas dinero? 1-Si / 2.No");
			opcion=sc.nextInt();
			System.out.println("Sesion Terminada");
			
		} while (opcion==1);
	}
}
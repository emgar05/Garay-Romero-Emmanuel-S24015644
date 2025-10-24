import java.util.Scanner;	
class Ejercicio8{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double C, TI=0.02, MT, CG;
	System.out.println("Ingrese su capital:");
	C=sc.nextDouble();
	MT=C*TI;
	System.out.println("El interes ganado este mes fue de: "+MT);
	CG=C+MT;
	System.out.println("El capital total ganado es: "+CG);
	}
}
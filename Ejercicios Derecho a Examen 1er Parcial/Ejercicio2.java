import java.util.Scanner;	
class Ejercicio2{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double radio, pi=3.14, circunferencia, area;
	System.out.println("Ingresa el valor del radio: ");
	radio=sc.nextDouble();
	circunferencia=2*pi*radio;
	area=(pi*(radio*radio));
	System.out.println("El valor de la circunferencia es: "+circunferencia);
	System.out.println("Es área es: "+area);
	}
}
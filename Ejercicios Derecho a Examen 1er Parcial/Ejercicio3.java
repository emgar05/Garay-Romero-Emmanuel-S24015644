import java.util.Scanner;	
class Ejercicio3{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int edad;
	double pul;
	System.out.println("Ingresa su edad: ");
	edad=sc.nextInt();
	pul=(220-edad)/10;
	System.out.println("Sus pulsaciones cada 10 segundos son: "+pul);
	}
}
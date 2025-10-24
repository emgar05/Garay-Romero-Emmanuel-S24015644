import java.util.Scanner;	
class Ejercicio19{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
	double G=0.40, T=0.30, P=0.30, PRE;
	System.out.println("Ingrese el Presupesto Anual");
	PRE=sc.nextDouble();
	G=PRE*G;
	System.out.println("El dinero destinado a Ginecología es: "+G);
	T=PRE*T;
	System.out.println("El dinero destinado a Traumatologia es: "+T);
	P=PRE*P;
	System.out.println("El dinero destinado a Pediatría es: "+P);
	}
}

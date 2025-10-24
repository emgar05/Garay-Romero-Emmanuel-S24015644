import java.util.Scanner;	
class Ejercicio5{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double T, F, TA;
	System.out.println("Ingresa la temperatura");
	T=sc.nextDouble();
	F=(T*(9.0/5.0))+32;
	TA=T+273.15;
	System.out.println("La temperatura en Farenheit es: "+F);
	System.out.println("En temperatura Absoluta es: "+TA);
	}
}
import java.util.Scanner;	
class Ejercicio10{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int M1, M2, M3, prom2;
	double prom, suma;
	System.out.println("Ingresa tu calificación de la materia 1");
	M1=sc.nextInt();
	System.out.println("Ingresa tu calificación de la materia 2");
	M2=sc.nextInt();
	System.out.println("Ingresa tu calificación de la materia 3");
	M3=sc.nextInt();
	suma=M1+M2+M3;
	prom=suma/3;
	prom2=10;
	System.out.println("El promedio laudatorio es: "+prom2);
	System.out.println("Tu promedio obtenido es: "+prom);
	}
}
import java.util.Scanner;
public class Ej6{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
		double cal, a=0, ap=0, r=0;
		double prom;
		for(int i=0;i<5;i++){
		System.out.println("Ingrese las calificaciones");
		cal=sc.nextInt();
		a=a+cal;
		if (cal>=6)
			ap++;
			
		else 
			r++;
		}
			
	System.out.println("La cantidad de alumnos aprobados fueron: "+ap);
	System.out.println("La cantidad de alumnos reprobados fueron: " +r);
	prom=a/5;
	System.out.println("El promedio es: " +prom);
	}
}

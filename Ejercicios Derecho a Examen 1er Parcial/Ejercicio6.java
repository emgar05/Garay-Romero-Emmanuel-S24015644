import java.util.Scanner;	
class Ejercicio6{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int H, M;
	double PM, PH;
	System.out.println("Ingresa la cantidad de alumnas");
	M=sc.nextInt();
	System.out.println("Ingresa la cantidad de alumnos");
	H=sc.nextInt();
	PM=(M*100)/(H+M);
	PH=(H*100)/(H+M);
	System.out.println("El porcentaje de Mujeres es: "+PM);
	System.out.println("El porcentaje de Hombres es: "+PH);
	}
}
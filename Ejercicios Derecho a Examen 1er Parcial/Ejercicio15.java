import java.util.Scanner;	
class Ejercicio15{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double calificacion;
	System.out.println("Ingrese la calificación");
	calificacion=sc.nextDouble();
	if ((calificacion==0.0)||(calificacion<=1.0)){
		System.out.println("Tu calificación es P (Pesimo)");
	}
	else if ((calificacion==1.1)||(calificacion<=2.0)){
		System.out.println("Tu calificación es M (Mala)");
	}
	else if ((calificacion==2.1)||(calificacion<=2.9)){
		System.out.println("Tu calificación es R (Regular)");
	}
	else if ((calificacion==3.0)||(calificacion<=4.0)){
		System.out.println("Tu califiación es B (Buena)");
	}
	else if ((calificacion==4.1)||(calificacion<=5.0)){
		System.out.println("Tu calificación es E (Excelente)");
	}
	else if (calificacion>=5.1){
		System.out.println("Tu califiacion no existe");
	}
	}
}
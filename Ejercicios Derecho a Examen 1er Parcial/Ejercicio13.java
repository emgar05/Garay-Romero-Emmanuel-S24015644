import java.util.Scanner;	
class Ejercicio13{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double a, b, c;
	System.out.println("Ingresa el valor de A");
	a=sc.nextDouble();
	System.out.println("Ingresa el valor de B");
	b=sc.nextDouble();
	System.out.println("Ingresa el valor de C");
	c=sc.nextDouble();
	
	if (a==0)
		System.out.println("No es una ecuación cuadratica");
		double d=b*b-4*a*c;
	if (d<0){
		double real=-b/(2*a);
		double imag=Math.sqrt(-d)/(2*a);
		System.out.println("Raiz compleja");
		System.out.println("x1=" + real + "+" + imag + "i"); // Se necesito ayuda de IA
		System.out.println("x2=" + real + "-" + imag + "i");
		}
		else if (d==0){
		double x=-b/(2*a);
		System.out.println("Una raiz real doble: x= " + x);
		} 
		else {
			double x1=(-b + Math.sqrt(d))/(2*a);
			double x2=(-b - Math.sqrt(d))/(2*a); //Se necesito ayuda de IA  
			System.out.println("Raiz 1: "+x1);
			System.out.println("Rauz 2: "+x2);
			}
		}	
}
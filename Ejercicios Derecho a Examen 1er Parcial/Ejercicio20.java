import java.util.Scanner;	
class Ejercicio20{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
	double d, n, t;
	System.out.println("Ingrese el monto total de su compra");
	t=sc.nextDouble();
	System.out.println("Deme un numero al azar");
	n=sc.nextDouble();
	if (n<74){
		d=t*0.15;
		System.out.println("El descuento obtenido es: "+d);
		t=t-d;
		System.out.println("El total de su compra con descuento es: "+t);
	}
	else{
		d=t*0.20;
		System.out.println("El descuento obtenido es: "+d);
		t=t-d;
		System.out.println("El total de su compra con descuento es: "+t);
	}
	}
}
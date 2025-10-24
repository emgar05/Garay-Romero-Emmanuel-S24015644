import java.util.Scanner;	
class Ejercicio7{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double desc=0.15, TC, FC, PC;
	System.out.println("El costo total de su compra es: ");
	TC=sc.nextDouble();
	PC=(desc*TC);
	FC=TC-PC;
	System.out.println("El descuento obtenido es: "+PC);
	System.out.println("El precio final de su compra es: "+FC);
	}
}
import java.util.Scanner;	
class Ejercicio1{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double metros, pies, pulgadas;
	System.out.println("CONVERSION DE METROS");
	System.out.println("Bienvenido, ingrese los metros");
	metros=sc.nextDouble();
	pies=metros*3.2808;
	pulgadas=pies*12;
	System.out.println("Los metros a pies son: " +pies);
	System.out.println("Los metros a pulgadas son: " +pulgadas);
	}
}
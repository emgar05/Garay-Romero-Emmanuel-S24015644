import java.util.Scanner;	
class Ejercicio16{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n;
	System.out.println("Ingresa un numero");
	n=sc.nextInt();
	if (n%2==0){
		System.out.println("El  numero es par");
	}
	else{
		System.out.println("El numero es impar");
	}
	}
}
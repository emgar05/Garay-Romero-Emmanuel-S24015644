import java.util.Scanner;	
class Ejercicio18{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int n, precio=7;
	System.out.println("Ingrese los minutos de su llamada");
	n=sc.nextInt();
	if (n<=3){
		System.out.println("Su llamada cuesta 10 pesos");
	}
	else if (n>3){
		precio=n+precio;
		System.out.println("Su llamda contara con un recargo de 1 peso, el nuevo precio sera: "+precio);
	}
	}
}
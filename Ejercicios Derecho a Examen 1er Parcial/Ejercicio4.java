import java.util.Scanner;	
class Ejercicio4{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int añoa, añon, edad;
	System.out.println("Ingresa tu año de Nacimiento: ");
	añon=sc.nextInt();
	System.out.println("Ingresa el año actual");
	añoa=sc.nextInt();
	edad=añoa-añon;
	System.out.println("Tu edad es: " +edad);
	}
}
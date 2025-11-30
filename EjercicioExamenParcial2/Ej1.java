import java.util.Scanner;
public class Ej1{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String[] nom= new String[10];
	int i=0;
		while (i<10){
			System.out.println("Ingresa el nombre: ");
			nom[i]=sc.nextLine();
			i++;
		}
	System.out.println("Lista de nombres: ");
	i=0;
		while (i<10){
			System.out.println((i+1) + "." + nom[i]);
			i++;
		}
		sc.close();
	}
}
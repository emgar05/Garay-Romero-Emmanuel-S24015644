import java.util.Scanner;
public class Ej12{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int mon, a=0, b=0;
	int ventas[]= new int[7];
		for(int i=0;i<7;i++){
			System.out.println("Ingresa la venta " + (i+1) + ": ");
			ventas[i]=sc.nextInt();
			a+=ventas[i];

			if (b<ventas[i])
			b=ventas[i];
		}

			System.out.println("La venta total de la semana es: " + a);
			System.out.println("La mayor venta es: " + b);
	}
}
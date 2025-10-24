import java.util.Scanner;	
class Ejercicio14{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double comision;
	int venta;
	System.out.println("Escribe el valor de tus 4 ventas totales");
	venta=sc.nextInt();
		if (venta==10000000){
			comision=(venta*0.02);
			System.out.println("Tu comision generada fue: "+comision);
		}
		else if ((venta>10000000)&&(venta<=15000000)){
			comision=(venta*0.04);
			System.out.println("Tu comision generada fue: "+comision);
		}
			else if (venta>15000000){
			comision=(venta*0.10);
			System.out.println("Tu comision generada fue: "+comision);
		}
	}
}
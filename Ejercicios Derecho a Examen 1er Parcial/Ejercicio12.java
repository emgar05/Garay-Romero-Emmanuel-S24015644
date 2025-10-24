import java.util.Scanner;	
class Ejercicio12{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double sal, ds;
	System.out.println("Ingrese el salario del trabajador (10000-20000)");
	sal=sc.nextDouble();
		if ((sal<=20000)&&(sal>15000)){
			System.out.println("Trabajador de 1era Categoria");
			ds=(sal*0.072);
			System.out.println("Descuento por salud: " +ds);
			sal=sal-ds;
			System.out.println("Salario Final: "+ds);
		} 
		else if ((sal<=15000)&&(sal>10000)){
			System.out.println("Trabajador de 2da Categoria");
			ds=(sal*0.072);
			System.out.println("Descuento por salud: "+ds);
			sal=sal-ds;
			System.out.println("Salario Final: "+sal);
		}
		else if ((sal<=10000)&&(sal>7500)){
				System.out.println("Trabajador de 3ra Categoria");
				ds=(sal*0.072);
				sal=sal-ds;
				System.out.println("Descuento por salud: "+ds);
				System.out.println("Salario Final: "+sal);
		}
		else if ((sal<=7500)&&(sal>10000)){
			System.out.println("Trabajador de 4ta Categoria");
			ds=sal*0.072;
			sal=sal-ds;
			System.out.println("Descuento por salud: "+ds);
			System.out.println("Salario Final: "+sal);
		}
		else if (sal<10000){
			sal=sal+(sal*0.15);
			System.out.println("Salario final por subsidio: "+sal);
			}
		}
}
			
		
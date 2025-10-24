import java.util.Scanner;	
class Ejercicio11{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int a, b, c;
	double prom;
	System.out.println("Ingresa el primer numero");
	a=sc.nextInt();
	System.out.println("Ingresa el segundo numero");
	b=sc.nextInt();
	System.out.println("Ingresa el valor del tercer numero");
	c=sc.nextInt();
		if((a==b)&&(b==c)&&(a==c)){
			System.out.println("Los valores son iguales");
		}
		else{
		if ((a>b)&&(a>c)){
			prom=(a+b+c)/3;
				if ((b<a)&&(b<c))
			System.out.println(a + " es mayor " + b + " es menor " +"\nEl promedio es: " +prom);
	else
		System.out.println(a + " es mayor " + c + " es menor " + "\nEl promedio es: " +prom);
	}
	else 
		if ((b>a)&&(b>c)){
			prom=(a+b+c)/3;
				if ((a<b)&&(a<c))
					System.out.println(b + " es mayor " + a + " es menor " + "\nEl promedio es:" +prom);
			else 
				System.out.println(b + "es mayor " + c + " es menor " + "\nEl promedio es: " +prom);
	}
	else{
		prom=(a+b+c)/3;
			if ((a<c)&&(a<b))
				System.out.println(c + "es mayor " + a + " es menor " + "\nEl promedio es: " +prom);
		else 
			System.out.println(c + " es mayor " + b + " es menor " + "\nEl promedio es: " +prom);
			}
		}
	}
}
		
		
import java.util.Scanner;	
class Ejercicio9{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	double inc=0.25, S, NS, AU;
	System.out.println("Ingresa tu salario:");
	S=sc.nextDouble();
	AU=(inc*S);
	NS=AU+S;
	System.out.println("Tu nuevo salario es: "+NS);
	}
}
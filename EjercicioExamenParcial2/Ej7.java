import java.util.Scanner;
public class Ej7{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
		int n, i;
		System.out.println("¿Qué tabla de multiplicar deseas?");
		n=sc.nextInt();

		for(i=1;i<=10;i++){
		System.out.println(n + "*" + i + "=" + n*i);
		}
	}
}
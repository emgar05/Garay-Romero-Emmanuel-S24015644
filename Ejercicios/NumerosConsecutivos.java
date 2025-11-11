import java.util.Scanner;
class NumerosConsecutivos{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int i, j, n, c=0;
	System.out.println("Escribe un numero: ");
		n=sc.nextInt();
		for(i=1; i<=n;i++){
		for (j=1;j<=i;j++){
		c++;
		System.out.print(c+" ");
		}
		System.out.println();
	}
}
}
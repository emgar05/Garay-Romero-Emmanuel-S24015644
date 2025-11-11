import java.util.Scanner;
class Trianguloforanidado{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int i, j, k, n;
	System.out.println("Escribe un numero: ");
		n=sc.nextInt();
		for(i=1; i<=n;i++){
		for (j=1;j<= (n-i);j++){
		System.out.print(" ");
		}
		for (k=1;k<=(2*i-1);k++){ //acudi con la IA para ver como hacer que quedara centrado 
		System.out.print("*");
		}
		System.out.println();
	}
}
}
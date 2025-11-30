import java.util.Scanner;
public class Ej15{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	final int paises=4;
	final int meses=3;
	String[] np=new String[paises];
	double[][] tem=new double[paises][meses];
	double[] mt=new double[paises];
	double maxm=-1;
	String pmm="";
	
	for(int i=0; i<paises;i++){
	System.out.printf("\nIngresa el nombre del país %d: ", (i+1));
	np[i]=sc.nextLine();
	double sumt=0;
	
	for (int j=0;j<meses;j++){
		System.out.printf(" Ingresa la temperatura media del mes %d: ", (j+1));
		tem[i][j]=sc.nextDouble();
		sumt+=tem[i][j];
	}
	sc.nextLine();
	
	mt[i]=sumt/meses;
	
	if(mt[i]>maxm){
		maxm=mt[i];
		pmm=np[i];
		}
	}
	for (int i=0;i<paises;i++){
	System.out.printf("\n🇵 Valor del país: **%s**\n", np[i]);
	System.out.print("temperaturas Ingresadas: [");
	for(int j=0;j<meses;j++){
		System.out.printf("%.2f%s", tem[i][j], (j<meses-1?", " : ""));
		}
	System.out.println("]");
	System.out.printf(" **Media Trimestral:** **%.2f**\n", mt[i]);
	}
	System.out.printf("\nPais con la Media mas Alta es: **%s** con una media de **%2**\n", pmm, maxm);
	sc.close();
	}
}
import java.util.Scanner;
public class Ej14{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	int empleados=4;
	int meses=3;
	String[] nombre= new String[empleados];
	double[][] ingresos= new double[empleados][meses];
	double[] ingresoA=new double [empleados];
	double mayorI=0;
	String nmi="";

	for(int i=0;i<empleados;i++){
		System.out.printf("Ingrese el nombre %d: ", (i+1));
		nombre[i]=sc.nextLine();
		double te=0;
	
	for(int j=0;j<meses;j++){
		System.out.printf("Ingresa el sueldo de %s en el mes %d: ", nombre[i], (j+1));
		ingresos[i][j]=sc.nextDouble();
		te+=ingresos[i][j];
	}
	sc.nextLine();
	ingresoA[i]=te;
	
	if(te>mayorI){
		mayorI=te;
		nmi=nombre[i];
		}
	}
	
	double total=0;
	for(double a:ingresoA)
		total+=a;
	
	System.out.println("Resultados");
	System.out.println("Ingreso Acumulado por Empleado");	
	for(int i=0;i<empleados;i++){
	System.out.printf("Empleado: %s | Total Acumulado %.2f\n", nombre[i], ingresoA[i]);
	}
	
	System.out.printf("El total pagado a todos los empleados es %.2f\n", total);
	System.out.printf("El empleado con mayor ingreso Acumulado es: **%s** (total: %.2f)\n", nmi, mayorI);
	sc.close();
	}
}
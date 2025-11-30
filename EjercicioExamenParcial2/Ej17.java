import java.util.Scanner;
class Ej17{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	String[][] atleta=new String[5][4];
		for (int i=0; i<5; i++){
			System.out.println("\nAtleta " + (i+1) + ": ");
			System.out.print("Nombre: ");
			atleta[i][0]=sc.next();
			System.out.print("Apellido: ");
			atleta[i][1]=sc.next();
			System.out.print("Especialidad (100 m, 200m, 300m, 400m): ");
			atleta[i][2]=sc.next();
			System.out.print("Tiempo registrado (segundos): ");
			atleta[i][3]=sc.next();
		}

	int mejor=0;
		for (int i=1; i<5; i++){
			double TA=Double.parseDouble(atleta[i][3]); 
			double MT=Double.parseDouble(atleta[mejor][3]);
				if (TA<MT)
					mejor=i;
		}
	System.out.println("\n=== RESULTADOS ===");
	System.out.println("---------------------------------------------");
	System.out.println("Nombre   Apellido   Especialidad   Tiempo(s)");
	System.out.println("---------------------------------------------");
		for (int i=0; i<5; i++){
			System.out.printf("%-8s %-10s %-13s %-10s", atleta[i][0], atleta[i][1], atleta[i][2], atleta[i][3]); 
				
					
			System.out.println();
		}
	System.out.println("----------------------------------------------");
	System.out.println("\nMejor tiempo: " + atleta[mejor][0] + " " + atleta[mejor][1] + " - " + atleta[mejor][3] + " segundos");
	sc.close();
	}
}


import java.util.Scanner;
public class Ej13{
	public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	
	int[][] escuela= new int[3][4];
	String[] nivel= {"Basico", "Medio", "Perfeccionamiento"};
	String[] idioma= {"Ingles", "Frances", "Aleman", "Ruso"};
	final int estudiantes=12;
	boolean e = false;
	
	System.out.println("Ingresa los Estudiantes por nivel e idioma");
		
	for(int i=0;i<3;i++){
		for (int j=0;j<4;j++){
			System.out.printf("Estudiantes en Nivel %s / Idioma %s: ", nivel[i], idioma[j]);
			escuela[i][j]=sc.nextInt();
		}
	}
	
	for (int i=0;i<3;i++){
		for (int j=0;j<4;j++){
			if (escuela[i][j]==estudiantes){
				System.out.printf("Los 12 estudiantes estan en:\n");
				System.out.printf("Nivel:  %s\n" , nivel[i]);
				System.out.printf("Idioma: %s\n", idioma[j]);
				e=true;
				}
			}
		}
		
		if(!e){
			System.out.println("No se encontro ningun idioma o nivel");
		}
		sc.close();
	}
}
import java.util.Scanner;
public class Ej16{
public static void main(String args[]){
	Scanner sc=new Scanner(System.in);
	final int filas=3;
	final int  columnas=3;
	String[][] inventario=new String[filas][columnas];
	String[] encabezado={"Articulo", "Talla", "Color"};
	String[] nomA={"Camisa", "Zapato", "Pantalon"};
	
	for(int i=0;i<filas;i++){
		System.out.printf("\n***Articulo: %s ***\n", nomA[i]);
		inventario[i][0]=nomA[i];
		System.out.printf("Ingresa la talla para %s: ", nomA[i]);
		inventario[i][1]=sc.nextLine();
		System.out.printf("Ingrese el color para %s: ", nomA[i]);
		inventario[i][2]= sc.nextLine();
	}
	
	System.out.println("\n==============================================");
	System.out.println("Inventario ");
	System.out.println("==============================================");
	
	System.out.printf("| %-10s | %-6s | %-10s |\n", encabezado[0], encabezado[1], encabezado[2]);
	System.out.println("|------------|-------|-----------");
	for (int i=0;i<filas;i++){
		System.out.printf("| %-10s | %-6s | %-10s |\n", inventario[i][0], inventario[i][1], inventario[i][2]);
	}
	System.out.println("==============================================");
	sc.close();
	}
}
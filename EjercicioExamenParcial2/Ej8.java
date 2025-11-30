public class Ej8{
	public static void main(String args[]){
	int i;
	double in=0.09, a=0, ah=500;
		for(i=0;i<12;i++){
			System.out.println("El ahorro del mes " +(i+1) + " es: " +ah);
			ah=(ah*in)+ah;
			a=a+ah;
		}
	System.out.println("El ahorro de un año es: "+a);
	}
}	
		
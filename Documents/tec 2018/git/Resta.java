import java.util.Scanner;
public class Resta{
	public static void main (String args[]){
		int n1=0, n2=0, res=0;
		Scanner dato= new Scanner(System.in);
		System.out.println("Escribe número minuendo");
		n1=Integer.parseInt(dato.nextLine());
		System.out.println("Escribe otro número sustraendo");
		n2=Integer.parseInt(dato.nextLine());
		res=n1-n2;
		System.out.println("El resultado de la resta es: "+res);
	}
}
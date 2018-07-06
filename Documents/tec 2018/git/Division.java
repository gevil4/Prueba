import java.util.Scanner;
public class Division{
	public static void main (String Args[]){
		double d1=0,d2=0, res=0;
		Scanner dato=new Scanner(System.in);
		System.out.println("Ingresa el dividendo: ");
		d1=Double.parseDouble(dato.nextLine());
		System.out.println("Ingresa el divisor: ");
		d2=Double.parseDouble(dato.nextLine());
		res=d1/d2;
		System.out.println("El resultado de la división es: "+res);
	}
}
import java.util.Scanner;

public class Principal {

	//metodo principal por donde inica el programa
	public static void main(String[] args) {
		
		System.out.println("ingrese la palabra que quiere conocer el tamaño");
		//clase del api  de jav que me permite capturar información por consola
		Scanner sc = new Scanner(System.in);
		String mensaje = sc.next();
		
		System.out.println("la palabra tiene :  " + mensaje.length() + " " + "letras" );
	}
	
}

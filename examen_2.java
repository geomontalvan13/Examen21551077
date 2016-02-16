import java.util.Scanner;

public class examen_2
{ 
	public static void main(String args[]){

		    Scanner teclado = new Scanner(System.in);
			System.out.println("cuantos juegos tienes: ");
			int juegos = teclado.nextInt();
			System.out.println("cuantos juegos de PS3: ");
			int consola = teclado.nextInt();

			if(consola="PS3"){
				examen_2.main(null);
			}
		}
	}
import java.util.Scanner;

public class exame
{ 
	public static void main(String args[]){

		    Scanner teclado = new Scanner(System.in);
			System.out.println("cuantos dias quiene cada mes del año 2014");
			System.out.println("--------------------------");
			System.out.println("Seleccione su opcion");
			System.out.println("1 = enero");
			System.out.println("2 = febrero");
			System.out.println("3 = marzo");
			System.out.println("4 = abril");
			System.out.println("5 = mayo");
			System.out.println("6 = junio");
			System.out.println("7 = julio");
			System.out.println("8 = agosto");
			System.out.println("9 = septiembre");
			System.out.println("10 = octubre");
			System.out.println("11 = noviembre");
			System.out.println("12 = diciembre");
			int menu = teclado.nextInt();
			System.out.println("Resultado = ");

			for(i=0; 1<mes; i++);
			switch(i){
				case 1: System.out.println("31 dias");
				break;
				case 2: System.out.println("28 dias");
				break;
				case 3: System.out.println("31dias");
				break;
				case 4: System.out.println("30 dias");
				break;
				case 5: System.out.println("31 dias");
				break;
				case 6: System.out.println("30 dias");
				break;
				case 7: System.out.println("31 dias");
				break;
				case 8: System.out.println("31 dias");
				break;
				case 9: System.out.println("30 dias");
				break;
				case 10: System.out.println("31 dias");
				break;
				case 11: System.out.println("30 dias");
				break;
				case 12: System.out.println("31 dias");
				break;
			}
		}
	}




			
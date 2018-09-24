package uF4.trabajos.A1_17_09_2018._01;

import java.util.Scanner;

public class Main {
	
	public static final int LIMITE = 6;  // Es para inicializa el el maximo de las bombillas.
	
	
	// Este método recibira un objeto e inicializa las 6 bombillas de 0 a 5
	public static void inicializar(Object bombilla[]){
		for(int i = 0; i < LIMITE; i++) {  
			bombilla[i] = new Bombillas(i);
		} 
	} 
	
	
	// Esto es para mostrar el menú de opciones.
	public static int menu() {
		
		System.out.println("\n\n\n");
		System.out.println("||||||||||||||||||||||||||||||||||||||||||||||");
		System.out.println("|||||||||||||||||||BOMBILLAS||||||||||||||||||");
		System.out.println();
		System.out.println("1. Inicializar las Bombillas.\n" + 
						   "2. Verificar estado de bombillas.\n" + 
						   "3. Subir o bajar intencidad de una bombilla\n" + 
						   "0. Salir.");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("\nIngrese un numero: ");
		int dato = sc.nextInt();
		
		return dato;
	}
	
	

	public static void main(String[] args) {
		
		Bombillas bombilla[] = new Bombillas[LIMITE];  // esto es un array de objetos Bombillas.
		Scanner sc = new Scanner(System.in);  // para entrada de opciones o elegir una bombilla.
		int respuesta;
		
		do {
			respuesta = menu();  // Llama al menu de opciones devolviendo un valor entero.
			
			switch(respuesta){
			
			case 1: 
				// Aquí se inicializa las 6 bombillas de 0 a 5
				inicializar(bombilla);  
				System.out.println("\nBombillas inicializadas.\n\n");		
				break;
				
			case 2:
				// Aquí se verifica el estado inicializado de las bombillas.
				try {
					System.out.print("\nValores de las Bombillas:");
					for(int i = 0; i < LIMITE; i++) {  
						bombilla[i].detallesBombilla();
						System.out.print(" en la Bombilla Nº" + (i + 1));
					}   
				}
				catch (Exception e) {
					System.err.println(" ERROR\nPrimero inicialice las bombillas.");
				}
				System.out.println("\n\n");
				break;
			
			case 3:
				//Aquí se podra aumentar o bajar la intencda de una bombilla.
				System.out.print("\nElija una de las 6 bombillas: ");
				int foco = sc.nextInt();
				
				System.out.print("ingrese una intencidad: ");
				int intencidad = sc.nextInt();
				
				try {
					bombilla[foco - 1].setIntensidad(intencidad); // Subiendo o bajando la intensidad de una bombilla
				}
				catch (Exception e) {
					System.err.println(" ERROR\nPrimero inicialice las bombillas.");
				}
				System.out.println("\n\n");
				break;
		}
			
		}while(respuesta != 0);
		
		
		
	}




	
	
	
	
	
	
}


/*
A12 - Bombillas de intensidad variable
    Queremos utilizar bombillas de intensidad variable para un videojuego.
    La intensidad de la bombilla toma un valor de 0 a 5, cero si la bombilla está apagada. 

[] Si la intensidad sobrepasa el nivel 5 la bombilla se quema y deja de funcionar. Ya no se puede modificar la intensidad de 
   la bombilla si está apagada.

[x]1) Diseñar una aplicación Java que controle seis bombillas de manera las lleve a un estado inicial en que una bombilla esté 
     apagada y cada una de las otras tenga una intensidad diferente. Muestre este estado inicial

[x]2) suba la intensidad de cada una de las bombillas y mostrad su estado

[x]3) Baje la intensidad de cada una de las bombillas y mostrad su estado
*/

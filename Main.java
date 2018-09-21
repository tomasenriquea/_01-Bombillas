package uF4.trabajos.A1_17_09_2018._01;

public class Main {
	
	public static final int LIMITE = 6;  // Es para inicializael el maximo de las bombillas.
	
	public static void inicializar(Object bombilla[]){
		for(int i = 0; i < LIMITE; i++) {  // Aquí se inicializa las 6 bombillas de 0 a 5
			bombilla[i] = new Bombillas(i);
		} 
	}
	
	
	public static void main(String[] args) {

		Bombillas b[] = new Bombillas[LIMITE];  // esto es un array de objetos Bombillas.
		inicializar(b);  // Aquí se inicializa las 6 bombillas de 0 a 5
		
	
		System.out.print("Valores de las Bombillas:");
		for(int i = 0; i < LIMITE; i++) {  
			b[i].detallesBombilla();
			System.out.print(" en la Bombilla Nº" + (i + 1));
		}
	
		
		System.out.println("\n---------------------------");
		System.out.print("Aumentando intensidad en la Bombilla 4:");
		b[3].setIntensidad(9); // Subiendo intensidad de una bombilla
		for(int i = 0; i < LIMITE; i++) {  // verificando aumento
			b[i].detallesBombilla();
			System.out.print(" en la Bombilla Nº" + (i + 1));
		}
		
		
		System.out.println("\n---------------------------");
		b[5].setIntensidad(1); // Bajando intensidad de otra bombilla
		System.out.print("Disminuyendo intensidad en la Bombilla 6:");
		for(int i = 0; i < LIMITE; i++) {  // verificando disminusion
			b[i].detallesBombilla();
			System.out.print(" en la Bombilla Nº" + (i + 1));
		}  
		

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

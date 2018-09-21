package uF4.trabajos.A1_17_09_2018._01;

public class Bombillas {
	
	private int intensidad;
	
	
	
	//CONSTRUCTOR
	public Bombillas(int intensidad) {
		this.intensidad = intensidad;
	}

	//GETTERS
	public int getIntensidad() {
		return intensidad;
	}


	//SETTERS
	public void setIntensidad(int intensidad) {
		this.intensidad = intensidad;
	}
	
	
	
	//DETALLES DE BOMBILLAS
	public void detallesBombilla() {
		System.out.printf("\nLa intensidad es: %d", intensidad);
	}
	
	
	
	
	
	
	
	
	
	

}

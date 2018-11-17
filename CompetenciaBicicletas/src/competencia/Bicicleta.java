/**
 * clase del alumno que participa en la carrera
 * 
 * @author Irasema Caicero
 * @version 1.0
 * @since 10/10/2018
 */
package competencia;

public class Bicicleta {
	private int noSerie;
	private String marca;
	private String color;
	
	public Bicicleta(int noSerie, String marca, String color) {
		super();
		this.noSerie = noSerie;
		this.marca = marca;
		this.color = color;
	}

	public int getNoSerie() {
		return noSerie;
	}

	public String getMarca() {
		return marca;
	}

	public String getColor() {
		return color;
	}
	
	
	

}

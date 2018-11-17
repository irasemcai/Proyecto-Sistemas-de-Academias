/**
 * clase del alumno que participa en la carrera
 * 
 * @author Irasema Caicero
 * @version 1.0
 * @since 10/10/2018
 */
package competencia;

public class Participante {
	private String nombre;
	private String matr�cula;
	private String carrera;
	private int edad;
	private Bicicleta bicicleta;
	
	public Participante(String nombre, String matr�cula, String carrera, int edad) {
		super();
		this.nombre = nombre;
		this.matr�cula = matr�cula;
		this.carrera = carrera;
		this.edad = edad;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public String getCarrera() {
		return carrera;
	}
	
	public int getEdad() {
		return edad;
	}
	
}

	
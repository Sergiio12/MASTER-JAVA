package es.sasensior.entidades;

public final class Profesor extends Persona implements Academizable {
	String idProfesor;

	public Profesor() {
		this.idProfesor = "";
	}
	
	public Profesor(String idProfesor) {
		super();
		this.idProfesor = idProfesor;
	}
	
	public void setIdProfesor(String idProfesor) {
		this.idProfesor = idProfesor;
	}
	
	public String getIdProfesor() {
		return this.idProfesor;
	}
	
}

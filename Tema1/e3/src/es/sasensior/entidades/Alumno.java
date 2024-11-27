package es.sasensior.entidades;

public final class Alumno extends Persona implements Academizable {
	String idAlumno;
	
	public Alumno() {
		this.idAlumno = "";
	}
	
	public Alumno(String idAlumno) {
		this.idAlumno = idAlumno;
	}
	
	public void setAlumno(String idAlumno) {
		this.idAlumno = idAlumno;
	}
	
	public String getAlumno() {
		return this.idAlumno;
	}
	
}

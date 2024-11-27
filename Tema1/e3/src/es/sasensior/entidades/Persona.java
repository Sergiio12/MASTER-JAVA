package es.sasensior.entidades;

public class Persona {
	private String nombre;
	private int edad;
	private float peso;
	private float altura;
	
	public Persona() {
		this.nombre = "";
		this.edad = 0;
		this.peso = 0;
		this.altura = 0;
	}
	
	public Persona(String nombre, int edad, float peso, float altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.peso = peso;
		this.altura = altura;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return this.nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return this.edad;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public float getPeso() {
		return this.peso;
	}
	
	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	public float getAltura() {
		return this.altura;
	}
	
	@Override
	public String toString() {
		return "Nombre: " + this.nombre + ", edad: " + this.edad + ", peso: " + this.peso + ", altura: " + this.altura + ".";
	}

}

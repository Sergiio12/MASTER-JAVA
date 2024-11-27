package es.sasensior.entidades;

public interface Academizable {
	
	/**
	 * Con este metodo mostrariamos el historial de una persona haciendo una consulta a la base de datos.
	 */
	public static void mostrarHistorial() {
		System.out.println("Mostrando historial...");
	}
	
	/**
	 * Con este metodo se podrian actualizar los datos de una persnona haciendo una consulta a la base de datos.
	 */
	public static void actualizarDatos() {
		System.out.println("Actualizando datos...");
	}

}

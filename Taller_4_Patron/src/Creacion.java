public class Creacion {
	private creadorPersonaje creadorpersonaje;
	public void creacionPersonaje() {
		creadorpersonaje.crearPersonaje();
		creadorpersonaje.asignarTipo();
		creadorpersonaje.asignarNombre();
		creadorpersonaje.asignarImagen();		
		creadorpersonaje.asignarAltura();
		creadorpersonaje.asignarHabilidades();
		creadorpersonaje.asignarPeso();
		creadorpersonaje.asignarInteligencia();
		creadorpersonaje.asignarCondicion();
	}
	public void setcreadorPersonaje(creadorPersonaje cp) {
		creadorpersonaje = cp;
	}
	public Personaje getPersonaje() {
		return creadorpersonaje.getPersonaje();
	}
}

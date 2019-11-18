public abstract class creadorPersonaje {
	protected Personaje personaje;

	public Personaje getPersonaje() {
		return personaje;
	}
	
	public void crearPersonaje() {
		personaje = new Personaje();
	}
	public abstract void asignarTipo();
	public abstract void asignarNombre();
	public abstract void asignarImagen();
	public abstract void asignarAltura();
	public abstract void asignarHabilidades();
	public abstract void asignarPeso();
	public abstract void asignarInteligencia();
	public abstract void asignarCondicion();
}

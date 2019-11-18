import java.util.Scanner;

public class creadorTipoPersonaje extends creadorPersonaje {
	Scanner input = new Scanner(System.in);
	public void asignarTipo() {
		System.out.println("\nEscriba el tipo elegido: ");
		String tipo = input.nextLine();
		personaje.setTipo(tipo);
		}
	public void asignarNombre() {
		System.out.println("\nIngrese Nombre a su Personaje: ");
		String nombre = input.nextLine();
		personaje.setNombre(nombre);
	}
	public void asignarImagen() {
		System.out.println("\nEscriba una imagen a su Personaje (Cualquier cosa): ");
		String imagen = input.nextLine();
		personaje.setImagen(imagen);
	}
	public void asignarAltura() {
		System.out.println("\nEnumere la altura a su personaje (cm): ");
		int altura = input.nextInt();
		personaje.setAltura(altura);
		}
	public void asignarHabilidades() {		
		System.out.println("\nEnumere habilidades de su personaje: ");
		int habilidades = input.nextInt();
		personaje.setHabilidades(habilidades);
		}
	public void asignarPeso() {
		System.out.println("\nEnumere el peso de su personaje(kg): ");
		int peso = input.nextInt();
		personaje.setPeso(peso);
		}
	public void asignarInteligencia() {
		System.out.println("\nEnumere la inteligencia de su personaje: ");
		int inteligencia = input.nextInt();
		personaje.setInteligencia(inteligencia);
	}
	public void asignarCondicion(){
		
		//Metodo para asignar la condicion o cualidad del personaje
	}
	
}
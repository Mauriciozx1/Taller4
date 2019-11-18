import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Creacion creacion = new Creacion();
		Scanner input = new Scanner(System.in);
		int seleccion = 0;
		int contar = 0;
		while(seleccion != -1) {
			System.out.println("Hola, Desea crear un nuevo personaje o seleccionar uno ya creado?\n1)Crear\n2)Seleccionar\n3)Salir\n=> ");
			seleccion = input.nextInt();
			if(seleccion == 1) {
				contar = contar + 1;
				System.out.println("Exite esta variedad de tipos de personajes:Heroe - Villano - Monstruo - Principe\n");
				creacion.setcreadorPersonaje(new creadorTipoPersonaje());
				creacion.creacionPersonaje();
				Personaje pj = creacion.getPersonaje();
				System.out.println(pj.getTipo() + " se ha creado satifactoriamente");
				}
			}
			if(seleccion == 2) {
				if(contar == 0) {
					System.out.println("No existe ningun personaje creado aun, primero crea uno y luego lo seleccionas");
				}
				else {			
				}

			}
			if(seleccion == 3){
				System.out.println("Programa terminado");
				System.exit(0);
			}
			else {
				System.out.println("Dato ingresado invalido");
			}
		}
	}



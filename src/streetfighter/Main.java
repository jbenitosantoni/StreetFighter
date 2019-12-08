package streetfighter;

import java.util.Scanner;

/**
 * Agrupa los metodos generales
 * 
 * @author Javier Benito Santoni
 */
public class Main {
	/**
	 * Inicializa los personajes y creamos un combate
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Personaje[] personaje = new Personaje[8];
		Main.InicializarPersonajes(personaje);
		Main.SimulaCombate(personaje[0], personaje[1]);
	}

	/**
	 * Analiza cual es el tipo de ataque que esta haciendo, los ataques rapidos son
	 * 1 y los ataques lentos son 2. 0 es Ataque Espacial 1, 1 es Ataque Espacial 2,
	 * 2 es Ataque Especial 3
	 * 
	 * 
	 * @author Javier Benito Santoni
	 * @param personaje
	 * @return daño El daño ralizado en el ataque
	 */
	public static double Ataque(Personaje personaje) {
		double daño = 0;
		double adicional = 0;
		// ¡ true = Rapido
		if (personaje.getPuñetazo() == 1) {
			adicional = 0.3;
		} else if (personaje.getPuñetazo() == 2) {
			adicional = 0.7;
		} else if (personaje.getPatada() == 1) {
			adicional = 0.5;
		} else if (personaje.getPatada() == 2) {
			adicional = 1;
		} else if (personaje.getAgarre() == 1) {
			adicional = 3;
		} else if (personaje.getAgarre() == 2) {
			adicional = 5;
		} else if (personaje.getAtaqueEspecial() == 0) {
			adicional = 1.5;
		} else if (personaje.getAtaqueEspecial() == 1) {
			adicional = 2;
		} else if (personaje.getAtaqueEspecial() == 2) {
			adicional = 3;
		}
		daño = personaje.getFuerza() * adicional;
		personaje.setPuñetazo(0);
		personaje.setPatada(0);
		personaje.setAgarre(0);
		personaje.setAtaqueEspecial(3);

		return daño;
	}

	/**
	 * Muestra las vidas de cada personaje
	 * 
	 * @author Javier Benito Santoni
	 * @param personaje1 Personaje numero 1 en partida
	 * @param personaje2 Personaje numero 2 en partida
	 */
	public static void mostrarVidas(Personaje personaje1, Personaje personaje2) {
		System.out.println("Puntos " + personaje1.getNombre() + " : " + personaje1.getPuntos());
		System.out.println("Puntos " + personaje2.getNombre() + " : " + personaje2.getPuntos());
	}

	/**
	 * Inicializa los 8 personajes del juego dandoles sus atributos
	 * 
	 * @author Javier Benito Santoni
	 * @param personajes Rellena el array de personajes
	 */
	public static void InicializarPersonajes(Personaje[] personajes) {
		personajes[0] = new Personaje("Ryu", "Japon",
				"un karateka japonés que trata de perfeccionar todas sus habilidades", 170, 67.5, "Azul",
				"Pantalones Cortos", "Japon", 50, 4);
		personajes[1] = new Personaje("E. Honda", "Japon", "Luchador de sumo venido desde Japón", 180, 150, "Negro",
				"Calzoncillos", "Japon", 70, 5);
		personajes[2] = new Personaje("Blanka", "Brasil",
				"un mutante con forma de bestia que creció en la jungla de Brasil", 175, 90, "Calvo", "Sin ropa",
				"Brasil", 30, 10);
		personajes[3] = new Personaje("Guile", "Estados Unidos", "un antiguo militar estadounidense", 182, 80, "Negro",
				"Ropa Militar", "EEUU", 100, 3);
		personajes[4] = new Personaje("Ken", "Estados Unidos", "Rival de Ryu", 180, 82, "Negro", "Ropa Callejera",
				"EEUU", 40, 7);
		personajes[5] = new Personaje("Chun-Li", "Chino", "una artista marcial china que trabaja para la Interpol", 170,
				50, "Rubio", "Ropa Judo", "China", 50, 7);
		personajes[6] = new Personaje("Zangief", "URSS", "Un luchador profesional de la URSS", 190, 90, "Rubio",
				"Ropa Luchador", "URSS", 100, 10);
		personajes[7] = new Personaje("Dhalsim", "India", "Un maestro de yoga", 170, 50, "Negro", "Ropa Yoga", "India",
				30, 9);
	}

	/**
	 * Comienza el convate, calcula cual es el personaje mas rapido para saber cual
	 * ataca primero, una vez sabemos cual es el mas rapido se van turnando atacando
	 * cada vez uno.
	 * 
	 * @author Javier Benito Santoni
	 * @param personaje1 Se pasa en la llamada a la funcion el personaje1
	 * @param personaje2 Se pasa en la llamada a la funcion el personaje2
	 */
	public static void SimulaCombate(Personaje personaje1, Personaje personaje2) {
		Scanner sc = new Scanner(System.in);
		System.out.println(personaje1.getNombre() + " vs " + personaje2.getNombre() + " - Pais: " + personaje1.getPais()
				+ " - Escenario: " + personaje1.getEscenario());
		int tipoataque;
		int tipoataque2;
		boolean primerataque = false;
		int atacante = 0;
		do {
			if (personaje1.getVelocidad() > personaje2.getVelocidad() && !primerataque) {
				System.out.println("Ataca: " + personaje1.getNombre());
				System.out.println("1. Puñetazo");
				System.out.println("2. Patada");
				System.out.println("3. Agarre");
				System.out.println("4. Ataque Especial");
				tipoataque = sc.nextInt();
				switch (tipoataque) {
				case 1:
					System.out.println("1. Rapido");
					System.out.println("2. Lento");
					tipoataque2 = sc.nextInt();
					if (tipoataque2 == 1) {
						personaje1.setPuñetazo(1);
					} else if (tipoataque2 == 2) {
						personaje1.setPuñetazo(2);
						;
					}
					break;
				case 2:
					System.out.println("1. Rapido");
					System.out.println("2. Lento");
					tipoataque2 = sc.nextInt();
					if (tipoataque2 == 1) {
						personaje1.setPatada(1);
					} else if (tipoataque2 == 2) {
						personaje1.setPatada(2);
						;
					}
					break;
				case 3:
					System.out.println("1. Rapido");
					System.out.println("2. Lento");
					tipoataque2 = sc.nextInt();
					if (tipoataque2 == 1) {
						personaje1.setAgarre(1);
					} else if (tipoataque2 == 2) {
						personaje1.setAgarre(2);
						;
					}
					break;
				case 4:
					System.out.println("1. Ataque Especial 1");
					System.out.println("2. Ataque Especial 2");
					System.out.println("3. Ataque Especial 3");
					personaje1.setAtaqueEspecial(sc.nextInt());
					break;
				}
				personaje2.setPuntos(personaje2.getPuntos() - Main.Ataque(personaje1));
				Main.mostrarVidas(personaje1, personaje2);
				primerataque = true;
				atacante = 1;
			} else if (personaje2.getVelocidad() > personaje1.getVelocidad() && !primerataque) {
				System.out.println("Ataca: " + personaje2.getNombre());
				System.out.println("1. Puñetazo");
				System.out.println("2. Patada");
				System.out.println("3. Agarre");
				System.out.println("4. Ataque Especial");
				tipoataque = sc.nextInt();
				switch (tipoataque) {
				case 1:
					System.out.println("1. Rapido");
					System.out.println("2. Lento");
					tipoataque2 = sc.nextInt();
					if (tipoataque2 == 1) {
						personaje2.setPuñetazo(1);
					} else if (tipoataque2 == 2) {
						personaje2.setPuñetazo(2);
						;
					}
					break;
				case 2:
					System.out.println("1. Rapido");
					System.out.println("2. Lento");
					tipoataque2 = sc.nextInt();
					if (tipoataque2 == 1) {
						personaje2.setPatada(1);
					} else if (tipoataque2 == 2) {
						personaje2.setPatada(2);
						;
					}
					break;
				case 3:
					System.out.println("1. Rapido");
					System.out.println("2. Lento");
					tipoataque2 = sc.nextInt();
					if (tipoataque2 == 1) {
						personaje2.setAgarre(1);
					} else if (tipoataque2 == 2) {
						personaje2.setAgarre(2);
						;
					}
					break;
				case 4:
					System.out.println("1. Ataque Especial 1");
					System.out.println("2. Ataque Especial 2");
					System.out.println("3. Ataque Especial 3");
					personaje2.setAtaqueEspecial(sc.nextInt());
					break;
				}
				personaje1.setPuntos(personaje1.getPuntos() - Main.Ataque(personaje2));
				Main.mostrarVidas(personaje1, personaje2);
				primerataque = true;
				atacante = 2;
			}
			if (atacante == 2 && primerataque == true) {
				System.out.println("Ataca: " + personaje1.getNombre());
				System.out.println("1. Puñetazo");
				System.out.println("2. Patada");
				System.out.println("3. Agarre");
				System.out.println("4. Ataque Especial");
				tipoataque = sc.nextInt();
				switch (tipoataque) {
				case 1:
					System.out.println("1. Rapido");
					System.out.println("2. Lento");
					tipoataque2 = sc.nextInt();
					if (tipoataque2 == 1) {
						personaje1.setPuñetazo(1);
					} else if (tipoataque2 == 2) {
						personaje1.setPuñetazo(2);
						;
					}
					break;
				case 2:
					System.out.println("1. Rapido");
					System.out.println("2. Lento");
					tipoataque2 = sc.nextInt();
					if (tipoataque2 == 1) {
						personaje1.setPatada(1);
					} else if (tipoataque2 == 2) {
						personaje1.setPatada(2);
						;
					}
					break;
				case 3:
					System.out.println("1. Rapido");
					System.out.println("2. Lento");
					tipoataque2 = sc.nextInt();
					if (tipoataque2 == 1) {
						personaje1.setAgarre(1);
					} else if (tipoataque2 == 2) {
						personaje1.setAgarre(2);
						;
					}
					break;
				case 4:
					System.out.println("1. Ataque Especial 1");
					System.out.println("2. Ataque Especial 2");
					System.out.println("3. Ataque Especial 3");
					personaje1.setAtaqueEspecial(sc.nextInt());
					break;
				}
				personaje2.setPuntos(personaje2.getPuntos() - Main.Ataque(personaje1));
				Main.mostrarVidas(personaje1, personaje2);
				atacante = 1;
			} else if (atacante == 1 && primerataque == true) {
				System.out.println("Ataca: " + personaje2.getNombre());
				System.out.println("1. Puñetazo");
				System.out.println("2. Patada");
				System.out.println("3. Agarre");
				System.out.println("4. Ataque Especial");
				tipoataque = sc.nextInt();
				switch (tipoataque) {
				case 1:
					System.out.println("1. Rapido");
					System.out.println("2. Lento");
					tipoataque2 = sc.nextInt();
					if (tipoataque2 == 1) {
						personaje2.setPuñetazo(1);
					} else if (tipoataque2 == 2) {
						personaje2.setPuñetazo(2);
						;
					}
					break;
				case 2:
					System.out.println("1. Rapido");
					System.out.println("2. Lento");
					tipoataque2 = sc.nextInt();
					if (tipoataque2 == 1) {
						personaje2.setPatada(1);
					} else if (tipoataque2 == 2) {
						personaje2.setPatada(2);
						;
					}
					break;
				case 3:
					System.out.println("1. Rapido");
					System.out.println("2. Lento");
					tipoataque2 = sc.nextInt();
					if (tipoataque2 == 1) {
						personaje2.setAgarre(1);
					} else if (tipoataque2 == 2) {
						personaje2.setAgarre(2);
						;
					}
					break;
				case 4:
					System.out.println("1. Ataque Especial 1");
					System.out.println("2. Ataque Especial 2");
					System.out.println("3. Ataque Especial 3");
					personaje2.setAtaqueEspecial(sc.nextInt());
					break;
				}
				personaje1.setPuntos(personaje1.getPuntos() - Main.Ataque(personaje2));
				Main.mostrarVidas(personaje1, personaje2);
				atacante = 2;
			}
		} while (personaje1.getPuntos() > 0 && personaje2.getPuntos() > 0);
		if (personaje1.getPuntos() < 0) {
			System.out.println("Gana: " + personaje2.getNombre());
			if (personaje2.getPuntos() == 100) {
				System.out.println("Perfect");
			}
		} else if (personaje2.getPuntos() < 0) {
			System.out.println("Gana: " + personaje1.getNombre());
			if (personaje1.getPuntos() == 100) {
				System.out.println("Perfect");
			}
		}
	}
}

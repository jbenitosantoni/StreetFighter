package streetfighter;

/**
 * Crea atributos para personaje, tambien sus getters y setters y por ultimo un
 * constructor.
 * 
 * @author javierbenitosantoni
 *
 */
public class Personaje {
	private String nombre;
	private String pais;
	private String historia;
	private double altura;
	private double peso;
	private String colorPelo;
	private String vestimenta;
	private String escenario;
	private double puntos = 100;
	private int velocidad;
	private int fuerza;
	// No se incluyen en constructor
	private int patada;
	private int puñetazo;
	private int agarre;
	private int ataqueEspecial;

	/**
	 * Constructor de personaje
	 * 
	 * @param nombre     Nombre personaje
	 * @param pais       Pais de Personaje
	 * @param historia   Historia de personaje (Texto largo)
	 * @param altura     Altura del personaje
	 * @param peso       Peso del personaje
	 * @param colorPelo  Color del pelo del personaje
	 * @param vestimenta Vestimenta del personaje
	 * @param escenario  Escenario en el que se encuentra el personaje
	 * @param velocidad  Velocidad del personaje
	 * @param fuerza     Fuerza del personaje
	 * @author Javier Benito Santoni
	 */
	public Personaje(String nombre, String pais, String historia, double altura, double peso, String colorPelo,
			String vestimenta, String escenario, int velocidad, int fuerza) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.historia = historia;
		this.altura = altura;
		this.peso = peso;
		this.colorPelo = colorPelo;
		this.vestimenta = vestimenta;
		this.escenario = escenario;
		this.velocidad = velocidad;
		this.fuerza = fuerza;
	}

	/**
	 * Obtiene nombre de personaje
	 * 
	 * @return nombre
	 * @author Javier Benito Santoni
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Cambia o crea nombre personaje
	 * 
	 * @author Javier Benito Santoni
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Obtiene pais de personaje
	 * 
	 * @author Javier Benito Santoni
	 * @return pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * Cambia o crea pais personaje
	 * 
	 * @author Javier Benito Santoni
	 * @param pais
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * Obtiene historia de personaje
	 * 
	 * @author Javier Benito Santoni
	 * @return historia
	 */
	public String getHistoria() {
		return historia;
	}

	/**
	 * Cambia o crea historia personaje
	 * 
	 * @author Javier Benito Santoni
	 * @param historia
	 */
	public void setHistoria(String historia) {
		this.historia = historia;
	}

	/**
	 * Obtiene altura de personaje
	 * 
	 * @author Javier Benito Santoni
	 * @return altura
	 */
	public double getAltura() {
		return altura;
	}

	/**
	 * Cambia o crea altura personaje
	 * 
	 * @author Javier Benito Santoni
	 * @param altura
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}

	/**
	 * Obtiene peso de personaje
	 * 
	 * @author Javier Benito Santoni
	 * @return peso
	 */
	public double getPeso() {
		return peso;
	}

	/**
	 * Cambia o crea peso personaje
	 * 
	 * @author Javier Benito Santoni
	 * @param peso
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}

	/**
	 * Obtiene color del pelo de personaje
	 * 
	 * @author Javier Benito Santoni
	 * @return color del pelo
	 */
	public String getColorPelo() {
		return colorPelo;
	}

	/**
	 * Cambia o crea color pelo de personaje
	 * 
	 * @author Javier Benito Santoni
	 * @param color pelo
	 */
	public void setColorPelo(String colorPelo) {
		this.colorPelo = colorPelo;
	}

	/**
	 * Obtiene vestimenta de personaje
	 * 
	 * @author Javier Benito Santoni
	 * @return vestimenta
	 */
	public String getVestimenta() {
		return vestimenta;
	}

	/**
	 * Cambia o crea vestimenta personaje
	 * 
	 * @author Javier Benito Santoni
	 * @param vestimenta
	 */
	public void setVestimenta(String vestimenta) {
		this.vestimenta = vestimenta;
	}

	/**
	 * Obtiene escenario de personaje
	 * 
	 * @author Javier Benito Santoni
	 * @return escenario
	 */
	public String getEscenario() {
		return escenario;
	}

	/**
	 * Cambia o crea escenario personaje
	 * 
	 * @author Javier Benito Santoni
	 * @param escenario
	 */
	public void setEscenario(String escenario) {
		this.escenario = escenario;
	}

	/**
	 * Obtiene puntos de personaje
	 * 
	 * @author Javier Benito Santoni
	 * @return puntos
	 */
	public double getPuntos() {
		return puntos;
	}

	/**
	 * Cambia o crea puntos personaje
	 * 
	 * @author Javier Benito Santoni
	 * @param puntos
	 */
	public void setPuntos(double puntos) {
		this.puntos = puntos;
	}

	/**
	 * Obtiene velocidad de personaje
	 * 
	 * @author Javier Benito Santoni
	 * @return velocidad
	 */
	public int getVelocidad() {
		return velocidad;
	}

	/**
	 * Cambia o crea velocidad personaje
	 * 
	 * @author Javier Benito Santoni
	 * @param velocidad
	 */
	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	/**
	 * Obtiene fuerza de personaje
	 * 
	 * @author Javier Benito Santoni
	 * @return fuerza
	 */
	public int getFuerza() {
		return fuerza;
	}

	/**
	 * Cambia o crea fuerza personaje
	 * 
	 * @author Javier Benito Santoni
	 * @param fuerza
	 */
	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	/**
	 * Obtiene patada de personaje
	 * 
	 * @author Javier Benito Santoni
	 * @return patada
	 */
	public int getPatada() {
		return patada;
	}

	/**
	 * Cambia o crea patada personaje
	 * 
	 * @author Javier Benito Santoni
	 * @param patada
	 */
	public void setPatada(int patada) {
		this.patada = patada;
	}

	/**
	 * Obtiene puñetazo de personaje
	 * 
	 * @author Javier Benito Santoni
	 * @return puñetazo
	 */
	public int getPuñetazo() {
		return puñetazo;
	}

	/**
	 * Cambia o crea puñetazo personaje
	 * 
	 * @author Javier Benito Santoni
	 * @param puñetazo
	 */
	public void setPuñetazo(int puñetazo) {
		this.puñetazo = puñetazo;
	}

	/**
	 * Obtiene agarre de personaje
	 * 
	 * @author Javier Benito Santoni
	 * @return agarre
	 */
	public int getAgarre() {
		return agarre;
	}

	/**
	 * Cambia o crea agarre personaje
	 * 
	 * @author Javier Benito Santoni
	 * @param agarre
	 */
	public void setAgarre(int agarre) {
		this.agarre = agarre;
	}

	/**
	 * Obtiene ataque especial de personaje
	 * 
	 * @author Javier Benito Santoni
	 * @return ataque especial
	 */
	public int getAtaqueEspecial() {
		return ataqueEspecial;
	}

	/**
	 * Cambia o crea ataque especial personaje
	 * 
	 * @author Javier Benito Santoni
	 * @param ataqueEspecial
	 */
	public void setAtaqueEspecial(int ataqueEspecial) {
		this.ataqueEspecial = ataqueEspecial;
	}

}
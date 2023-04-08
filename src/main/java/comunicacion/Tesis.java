package comunicacion;
//import java.util.ArrayList;
public class Tesis extends Escrito {

	private String idea;
	private String [] argumentos = null;// Se declara un atributo de tipo arreglo de tamaño fijo sin definir su tamaño
	private String conclusion;
	private String referencias;
	private String interpretacion;

	public Tesis(String origen, String titulo, String autor, int paginas, String idea, String[] argumentos,
			String conclusion, String referencias, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}



	public String getIdea() {
		return idea;
	}



	public void setIdea(String idea) {
		this.idea = idea;
	}



	public String[] getArgumentos() {
		return argumentos;
	}



	public void setArgumentos(String[] argumentos) {
		this.argumentos = argumentos;
	}



	public String getConclusion() {
		return conclusion;
	}



	public void setConclusion(String conlusion) {
		this.conclusion = conlusion;
	}



	public String getReferencias() {
		return referencias;
	}



	public void setReferencias(String referencias) {
		this.referencias = referencias;
	}



	public String getInterpretacion() {
		return interpretacion;
	}



	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}



	@Override
	int palabrasTotales(int palabrasPagina) {
		
		return palabrasPagina*5;
	}

	@Override
	String interpretacion() {
		
		return interpretacion;
	}

	@Override
	public String toString() {
		String tesis = this.getOrigen() + "\n";
		tesis += getTitulo() + "\n";
		tesis += getAutor() + "\n";
		tesis += getPaginas() + "\n";
		tesis += this.idea + "\n";
		tesis += this.argumentos.length + "\n";
		tesis += this.conclusion + "\n";
		tesis += this.referencias;
		
		  return tesis;
	}
	
	
}

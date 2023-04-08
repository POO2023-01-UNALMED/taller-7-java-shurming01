package comunicacion;

public class Fabula extends Escrito{
	
	private String ensenanza;
	private String interpretacion;
	
	public Fabula(String origen, String titulo, String autor, int paginas, String ensenanza, String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	@Override
	int palabrasTotales(int palabrasPagina) {
		return palabrasPagina*2;
	}
	
	@Override
	String interpretacion() {
		return interpretacion;
	}
	
	@Override
	public String toString() {
	  String fabula = this.getOrigen() + "\n";
	  fabula += this.getTitulo() + "\n";
	  fabula += this.getAutor() + "\n";
	  fabula += this.getPaginas() + "\n";
	  fabula += this.ensenanza;
	  
	  return fabula;
	
	}

}

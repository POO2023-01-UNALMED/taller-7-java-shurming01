package comunicacion;


public class Alfabeto extends Pictograma{
	
    private String[] letras =null;
	//private ArrayList<String> letras; 
	private String interpretacion;
	
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	

	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

    public int cantidadLetras() {
		return this.getLetras().length;
	}
	
	@Override
	String interpretacion() {
		return interpretacion;
	}

	@Override
	public String toString() {
		String letra = "";
		for(int i = 0; i<= letras.length-1; i++) {
			
			 letra += letras[i]+", ";
		}
		
		letra += letras[letras.length-1];
		return letra;
	}


	
	
	

}

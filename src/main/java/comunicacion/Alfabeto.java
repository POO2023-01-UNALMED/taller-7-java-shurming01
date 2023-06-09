package comunicacion;


public class Alfabeto extends Pictograma{
	
     private String[] letras =null;
    
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
		return getLetras().length;
	}
	
	@Override
	public String interpretacion() {
		return interpretacion;
	}

	@Override
	public String toString() {
		String letra = "";
		for(int i = 0; i<= letras.length-2; i++) {
			
			 letra += letras[i]+", ";
		}
		
		letra += letras[letras.length-1];
		return letra;
	}


	
	
	

}

package simulado;

public class CaixaPentagonal extends CaixaAbstract {
	
	
	private int lado;
	private String formato;
	private double altura;
	

	public CaixaPentagonal(String descUnica, String personalizacao, int lado) {
		super(descUnica, personalizacao);
	
		this.lado = lado;
		this.formato = "Pentagonal";
		this.altura = ((this.lado/2) * (Math.sqrt(5) + 2) * Math.sqrt(5)) / 2; 
				
	}



	@Override
	public int calculaPreco() {
		
		int areaTampa =    (int) (5 *  (this.lado * this.altura) / 2);                 
		return 10 * areaTampa;
	}



	@Override
	public String getFormato() {
		
		return this.formato;
	}


	
	
	

}

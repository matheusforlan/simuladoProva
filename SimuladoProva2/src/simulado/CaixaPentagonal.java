package simulado;

public class CaixaPentagonal implements Caixa {
	
	private String descUnica;
	private String personalizacao;
	private int lado;
	private String formato;
	private double altura;
	

	public CaixaPentagonal(String descUnica, String personalizacao, int lado) {
		
		this.descUnica = descUnica;
		this.personalizacao = personalizacao;
		this.lado = lado;
		this.formato = "Pentagonal";
		this.altura = ((this.lado/2) * (Math.sqrt(5) + 2) * Math.sqrt(5)) / 2; 
				
	}


	@Override
	public String toString() {
		return "Caixa com " + this.personalizacao + " custa " + calculaPreco() + "centavos. Formato" + this.formato;
	}


	@Override
	public int calculaPreco() {
		
		int areaTampa =    (int) (5 *  (this.lado * this.altura) / 2);                 
		return 10 * areaTampa;
	}



	@Override
	public void modificar(String novaPersonalizacao) {
		this.descUnica = novaPersonalizacao;
		
	}


	@Override
	public String getFormato() {
		
		return this.formato;
	}


	@Override
	public String getPersonalizcao() {
		
		return this.personalizacao;
	}


	@Override
	public String getDescUnica() {
		return this.getDescUnica();
	}
	
	
	

}

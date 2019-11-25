package simulado;

public class CaixaCircular implements Caixa {
	
	private String descUnica;
	private String personalizacao;
	private int raio;
	private String formato;

	public CaixaCircular(String descUnica, String personalizacao, int raio) {
		
		this.descUnica = descUnica;
		this.personalizacao = personalizacao;
		this.raio = raio;
		this.formato = "Circular";
	}
	
	
	
	@Override
	public String toString() {
	
		return "Caixa com " + this.personalizacao + " custa " + calculaPreco() + "centavos. Formato" + this.formato;
	}



	@Override
	public int calculaPreco() {
		int areaTampa = (int) (3.14 * (this.raio* this.raio));
		return 10 * areaTampa;
	}
	
	public void setDescUnica(String descUnica) {
		this.descUnica = descUnica;
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

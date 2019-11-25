package simulado;

public abstract class CaixaAbstract {
	
	protected String personalizacao;
	protected String descUnica;
	
	public CaixaAbstract(String descUnica, String personalizacao) {
		this.personalizacao = personalizacao;
		this.descUnica = descUnica;
	}
	public abstract String getFormato();
	
	
	public String getPersonalizcao() {
		return this.personalizacao;
	}
	public  String getDescUnica(){
		return this.descUnica;
	}
	
	public void modificar(String novaPersonalizacao) {
		this.descUnica = novaPersonalizacao;
		
	}
	
	public abstract  int calculaPreco();
	
	

	public String toString() {
	
		return "Caixa com " + this.personalizacao + " custa " + calculaPreco() + "centavos. Formato" + getFormato();
	}
}

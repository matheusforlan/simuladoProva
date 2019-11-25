package simulado;

public class CaixaRetangular implements Caixa{
	
	private String descUnica;
	private String personalizacao;
	private int lado1;
	private int lado2;
	private String formato;

	public CaixaRetangular(String descUnica, String personalizacao, int lado1, int lado2) {
		
		
		this.descUnica = descUnica;
		this.personalizacao = personalizacao;
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.formato = "Retangular";
	}

	@Override
	public String toString() {
	 return "Caixa com " + this.personalizacao + " custa " + calculaPreco() + "centavos. Formato" + this.formato;
	}

	@Override
	public int calculaPreco() {
		 int areaTampa = this.lado1 *  this.lado2;
		return 10*areaTampa;
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

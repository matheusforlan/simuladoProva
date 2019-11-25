package simulado;

public class CaixaCircular extends CaixaAbstract {
	
	
	private int raio;
	private String formato;

	public CaixaCircular(String descUnica, String personalizacao, int raio) {
		super(descUnica, personalizacao);
		
		this.raio = raio;
		this.formato = "Circular";
	}
	
	



	@Override
	public int calculaPreco() {
		int areaTampa = (int) (3.14 * (this.raio* this.raio));
		return 10 * areaTampa;
	}
	
	
	@Override
	public String getFormato() {
		
		return this.formato;
	}



	

}

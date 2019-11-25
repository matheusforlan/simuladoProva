package simulado;

public class CaixaRetangular extends CaixaAbstract{
	
	private int lado1;
	private int lado2;
	private String formato;

	public CaixaRetangular(String descUnica, String personalizacao, int lado1, int lado2) {
		super(descUnica, personalizacao);
		
		
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.formato = "Retangular";
	}

	@Override
	public int calculaPreco() {
		 int areaTampa = this.lado1 *  this.lado2;
		return 10*areaTampa;
	}
	
	
	
	
	

	@Override
	public String getFormato() {
		
		return this.formato;
	}




}

package simulado;

import java.util.List;

public class Facade {
	
	private ControllerCaixas controllerCaixas;
	
	public Facade() {
		
		this.controllerCaixas = new ControllerCaixas();
		
	}
	
	
	public void cadastraCaixaPentagonal(String descUnica, String personalizacao, int lado) {
		this.controllerCaixas.cadastraCaixaPentagonal(descUnica, personalizacao, lado);
	}
	
	public void cadastraCaixaRetangular(String descUnica, String personalizacao, int lado1, int lado2) {
		this.controllerCaixas.cadastraCaixaRetangular(descUnica, personalizacao, lado1, lado2);
	}
	
	public void cadastraCaixaCircular(String descUnica, String personalizacao, int raio) {
		this.controllerCaixas.cadastraCaixaCircular(descUnica, personalizacao, raio);
	}
	
	public void modificar(String descUnica, String novaPersonalizacao) {
		this.controllerCaixas.modificar(descUnica, novaPersonalizacao);
	}
	
	public boolean remover(String descUnica) {
		return this.controllerCaixas.remover(descUnica);
	}
	
	public  boolean contem(String personalizacao, String formato) {
		return this.controllerCaixas.contem(personalizacao, formato);
	}
	
	public List<String> pesquisa(String personalizacao){
		return this.controllerCaixas.pesquisa(personalizacao);
	}
	
	public int calcularRendimentos() {
		return this.controllerCaixas.calcularRendimentos();
	}
	
}

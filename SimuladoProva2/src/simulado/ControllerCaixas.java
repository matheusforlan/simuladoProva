package simulado;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ControllerCaixas {
	
	private Map <String ,CaixaAbstract> mapaCaixas;
	
	public ControllerCaixas() {
		this.mapaCaixas =  new LinkedHashMap<String, CaixaAbstract>();
		
	}
	
	
	
	public void cadastraCaixaPentagonal(String descUnica, String personalizacao, int lado) {
		
		if (lado <= 0) {
			throw new IllegalArgumentException("Valores não podem ser iguais a 0 ou negativos");
		}
		
		CaixaPentagonal caixaPentagonal = new CaixaPentagonal(descUnica, personalizacao, lado);
		this.mapaCaixas.put(descUnica, caixaPentagonal);
		
	}



	public void cadastraCaixaRetangular(String descUnica, String personalizacao, int lado1, int lado2) {
		if (lado1 <= 0 || lado2 <= 0) {
			throw new IllegalArgumentException("Valores não podem ser iguais a 0 ou negativos");
		}
		
		CaixaRetangular caixaRetangular = new CaixaRetangular(descUnica, personalizacao, lado1, lado2);
		this.mapaCaixas.put(descUnica, caixaRetangular);
	}



	public void cadastraCaixaCircular(String descUnica, String personalizacao, int raio) {
		
		if (raio <= 0) {
			throw new IllegalArgumentException("Valores não podem ser iguais a 0 ou negativos");
		}
		
		CaixaCircular caixaCircular = new CaixaCircular(descUnica, personalizacao, raio);
		
		this.mapaCaixas.put(descUnica, caixaCircular);
	}
	
	public void modificar(String descUnica, String novaPersonalizacao) {
		
		CaixaAbstract caixa = this.mapaCaixas.get(descUnica);
		caixa.modificar(novaPersonalizacao);
		this.mapaCaixas.remove(descUnica);
		this.mapaCaixas.put(novaPersonalizacao, caixa);
		
	}
	
	public boolean remover(String descUnica) {
		if (this.mapaCaixas.containsKey(descUnica)) {
			this.mapaCaixas.remove(descUnica);
			return true;
		}
		return false;
		
	}
	
	public  boolean contem(String personalizacao, String formato) {
		
		for (CaixaAbstract caixa: this.mapaCaixas.values()) {
			if (caixa.getPersonalizcao().equals(formato) || caixa.getPersonalizcao().equals(personalizacao)) {
				return true;
			}
		}
		
		return false;
	}



	public List<String> pesquisa(String personalizacao) {
	
		List listaInteresses = new ArrayList<String>();
		
		for (CaixaAbstract caixa: this.mapaCaixas.values()) {
			if(caixa.getPersonalizcao().equals(personalizacao)) {
				listaInteresses.add(caixa.getDescUnica());
			}
		}
		
		
		Collections.sort(listaInteresses);
		
		return listaInteresses;
		
	}



	public int calcularRendimentos() {
		int rendimento = 0;
		
		for (CaixaAbstract caixa: this.mapaCaixas.values()) {
			rendimento += caixa.calculaPreco();
		}
		
		return rendimento;
	}
	
	
	
	

}

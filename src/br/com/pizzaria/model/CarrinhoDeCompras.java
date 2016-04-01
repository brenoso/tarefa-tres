package br.com.pizzaria.model;

import java.util.ArrayList;

/**
 * Classe que representa o objeto do tipo Carrinho de Compras.
 * 
 * 
 * @author Flávio Luiz Gonçalves <flavio.luiz.goncalves@hotmail.com>
 * @since 13/03/2016 18:50:10
 * @version 1.0
 */

public class CarrinhoDeCompras {

	private ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
	private double precoTotal = 0;

	public void addPizza(Pizza p) {
		if (p.getIngrediente().isEmpty()) {
			
		} else
			pizzas.add(p);
	}

	public int totalPizzas() {
		return pizzas.size();
	}

	public double getPrecoTotal() {
		for (int i = 0; i < pizzas.size(); i++) {
			precoTotal += pizzas.get(i).getPreco();
		}
		return precoTotal;
	}

}

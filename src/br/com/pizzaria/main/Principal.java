package br.com.pizzaria.main;

import br.com.pizzaria.model.CarrinhoDeCompras;
import br.com.pizzaria.model.Pizza;

/**
 * Classe principal para gerar os objetos e imprimir na tela.
 * 
 * 
 * @author Flávio Luiz Gonçalves <flavio.luiz.goncalves@hotmail.com>
 * @since 13/03/2016 19:00:03
 * @version 1.0
 */

public class Principal {

	public static void main(String[] args) {

		/**Criando os Objetos do tipo Pizza*/
		Pizza pedidoPizza1 = new Pizza();
		Pizza pedidoPizza2 = new Pizza();
		Pizza pedidoPizza3 = new Pizza();
		
		/**Setando os ingredientes*/
		pedidoPizza1.adicionaIngrediente("Parmesão");
		pedidoPizza1.adicionaIngrediente("Queijo");
		pedidoPizza1.adicionaIngrediente("Calabresa");
		pedidoPizza1.adicionaIngrediente("Milho");
		
		/*pedidoPizza2.adicionaIngrediente("Frango");
		pedidoPizza2.adicionaIngrediente("Angus");
		pedidoPizza2.adicionaIngrediente("Catupiry");
		pedidoPizza2.adicionaIngrediente("Alho e óleo");
		pedidoPizza2.adicionaIngrediente("Milho");
		pedidoPizza2.adicionaIngrediente("Moda da casa");
		
		pedidoPizza3.adicionaIngrediente("Palmito");
		pedidoPizza3.adicionaIngrediente("Frango");
		pedidoPizza3.adicionaIngrediente("Bacon");*/
		
		/**Criando Carrinho de Compras e passando os objetos do tipo Pizza*/
		CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
		//carrinhoDeCompras.addPizza(pedidoPizza1);
		/*carrinhoDeCompras.addPizza(pedidoPizza2);
		carrinhoDeCompras.addPizza(pedidoPizza3);*/
	
		/**Imprimindo o resultado na tela*/
		System.out.println("===============================");
		System.out.println("Total de pizzas no pedido: [" +carrinhoDeCompras.totalPizzas()+"]");
		System.out.println("TOTAL: [" + carrinhoDeCompras.getPrecoTotal()+"]");
		System.out.println("===============================");
		System.out.println("Ingredientes utilizados: \n" +Pizza.getListaIngredientes());
		

		
	}

}

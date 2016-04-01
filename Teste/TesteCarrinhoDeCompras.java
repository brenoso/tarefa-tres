import static org.junit.Assert.*;

import org.junit.Test;

import br.com.pizzaria.model.CarrinhoDeCompras;
import br.com.pizzaria.model.Pizza;

public class TesteCarrinhoDeCompras {

	/*
	 * Faça os testes da classe CarrinhoDeCompras, verificando se o preço das
	 * pizzas são somados corretamente.
	 */
	@Test
	public void testVerificarPreco() {
		Pizza pedidoPizza1 = new Pizza();

		pedidoPizza1.adicionaIngrediente("Tomate");
		pedidoPizza1.adicionaIngrediente("Queijo");
		pedidoPizza1.adicionaIngrediente("Presunto");
		pedidoPizza1.adicionaIngrediente("Orégano");

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.addPizza(pedidoPizza1);

		assertEquals(20.0, carrinho.getPrecoTotal(), 0);
	}

	/*ele impede a adição de uma pizza sem ingredientes */
	@Test
	public void testIngredientesVazio() {
		Pizza pedidoPizza1 = new Pizza();

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.addPizza(pedidoPizza1);

		assertEquals(0, carrinho.getPrecoTotal(), 0);
	}
	
	
}

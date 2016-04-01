import static org.junit.Assert.*;

import org.junit.Test;

import br.com.pizzaria.model.CarrinhoDeCompras;
import br.com.pizzaria.model.Pizza;

public class TesteCarrinhoDeCompras {

	/*
	 * Fa�a os testes da classe CarrinhoDeCompras, verificando se o pre�o das
	 * pizzas s�o somados corretamente.
	 */
	@Test
	public void testVerificarPreco() {
		Pizza pedidoPizza1 = new Pizza();

		pedidoPizza1.adicionaIngrediente("Tomate");
		pedidoPizza1.adicionaIngrediente("Queijo");
		pedidoPizza1.adicionaIngrediente("Presunto");
		pedidoPizza1.adicionaIngrediente("Or�gano");

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.addPizza(pedidoPizza1);

		assertEquals(20.0, carrinho.getPrecoTotal(), 0);
	}

	/*ele impede a adi��o de uma pizza sem ingredientes */
	@Test
	public void testIngredientesVazio() {
		Pizza pedidoPizza1 = new Pizza();

		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.addPizza(pedidoPizza1);

		assertEquals(0, carrinho.getPrecoTotal(), 0);
	}
	
	
}

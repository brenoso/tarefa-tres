import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import br.com.pizzaria.model.Pizza;

public class TestePizza {
	
	/*zera o registro de ingredientes */
	@Before
	public void limparRegPizza() {
		Pizza.zeraIngredientes();
	}

	/*verifique se o valor da Pizza está correto de acordo com a quantidade de ingredientes*/
	@Test
	public void test() {
		Pizza pedidoPizza1 = new Pizza();
		
		pedidoPizza1.adicionaIngrediente("Tomate");
		pedidoPizza1.adicionaIngrediente("Queijo");
		pedidoPizza1.adicionaIngrediente("Presunto");
		pedidoPizza1.adicionaIngrediente("Orégano");
		
		assertEquals(4, pedidoPizza1.getIngrediente().size());
	}
	
	/*Verifique também se o registro de ingredientes funcionou corretamente*/
	@Test
	public void testIngredientes() {
		Pizza pedidoPizza1 = new Pizza();
		
		pedidoPizza1.adicionaIngrediente("Tomate");
		pedidoPizza1.adicionaIngrediente("Queijo");
		pedidoPizza1.adicionaIngrediente("Presunto");
		pedidoPizza1.adicionaIngrediente("Orégano");
		
		ArrayList<String> ingredientes = new ArrayList<String>();
		ingredientes.addAll(pedidoPizza1.getIngrediente());
		
		assertEquals(ingredientes, pedidoPizza1.getIngrediente());
	}
	
	
	

}

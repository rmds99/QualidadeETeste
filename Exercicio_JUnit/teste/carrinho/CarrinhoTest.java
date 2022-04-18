package carrinho;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import produto.Produto;

public class CarrinhoTest {
	
	Carrinho carrinho;
	Produto livro;
	
	@BeforeEach
	public void inicializa() {
		carrinho = new Carrinho();
		livro = new Produto("Introdução ao Teste de Software", 100.00);
	}
	
	@Test
	public void testCriaCarinho() {
		Assertions.assertAll("carrinho",
				() -> assertTrue(0.0 == carrinho.getValorTotal())						
				);
	}
	
	@Test
	public void testAddItem() {
		carrinho.addItem(livro);
		Assertions.assertAll("carrinho",
				() -> assertTrue(100.00 == carrinho.getValorTotal()),
				() -> assertTrue(1 == carrinho.getQtdeItems())						
				);
		
	}
	

}
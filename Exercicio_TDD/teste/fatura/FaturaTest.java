package fatura;

import java.util.Date;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FaturaTest {
	Date data;
	Fatura fatura;
	
	@BeforeEach
	public void inicializa() {
		data = new Date();
		fatura = new Fatura ("rafael", data , 15000.0, "não pago");
	}
	
	@Test
	public void testaGetName() {
		String name = fatura.getName();
		Assertions.assertEquals(name, "rafael");
	}
	
	@Test
	public void testaGetData() {
		Date time = fatura.getData();
		Assertions.assertEquals(time, data );
	}
	@Test
	public void testaGetValor() {
		double dinheiro = fatura.getValor();
		Assertions.assertEquals(dinheiro, 15000.0);
	}
	@Test
	public void testaGetPago() {
		String pagamento = fatura.getPago();
		Assertions.assertEquals(pagamento, "não pago");
	}
}

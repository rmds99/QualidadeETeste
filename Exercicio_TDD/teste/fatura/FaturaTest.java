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
		fatura = new Fatura ("rafael", data , 1000.0, "não pago");
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
}
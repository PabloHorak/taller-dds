package prueba3;

import domain.Pajaro;
import org.junit.Assert;
import org.junit.Test;

public class PajaroTest {

	@Test
	public void pichonDeberiaNacerConMuchaEnergia() {
		Pajaro pichon = new Pajaro();
		Assert.assertEquals(500, pichon.getEnergia());
	}
}

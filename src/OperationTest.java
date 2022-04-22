import static org.junit.Assert.*;
import org.junit.Test;
import java.math.BigDecimal;

public class OperationTest {

	@Test
	public void testSum() {
		BigDecimal n1 = new BigDecimal("3.1");
		BigDecimal n2 = new BigDecimal("3.1");
		BigDecimal exv = new BigDecimal("6.1");
		BigDecimal res = Operation.sum(n1, n2);
		assertTrue(exv.compareTo(res) == 0);
	}

	@Test
	public void testSub() {
		BigDecimal n1 = new BigDecimal("7");
		BigDecimal n2 = new BigDecimal("8");
		BigDecimal exv = new BigDecimal("-12");
		BigDecimal res = Operation.sub(n1, n2);
		assertTrue(exv.compareTo(res) == 0);
	}

	@Test
	public void testMul() {
		BigDecimal n1 = new BigDecimal("3");
		BigDecimal n2 = new BigDecimal("4");
		BigDecimal exv = new BigDecimal("12");
		BigDecimal res = Operation.mul(n1, n2);
		assertTrue(exv.compareTo(res) == 0);
	}

	@Test
	public void testDiv() {
		BigDecimal n1 = new BigDecimal("12.6");
		BigDecimal n2 = new BigDecimal("3");
		BigDecimal exv = new BigDecimal("4.2");
		BigDecimal res = Operation.div(n1, n2);
		assertTrue(exv.compareTo(res) == 0);
	}

	@Test
	public void testMod() {
		BigDecimal n1 = new BigDecimal("10");
		BigDecimal n2 = new BigDecimal("3");
		BigDecimal exv = new BigDecimal("1");
		BigDecimal res = Operation.mod(n1, n2);
		assertTrue(exv.compareTo(res) == 0);
	}

}

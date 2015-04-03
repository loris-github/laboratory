package laboratory;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class CollectionShuffTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public void testUseConcurrentHashMap() {
		CollectionShuff cs = new CollectionShuff();
		assertEquals(10,cs.useConcurrentHashMap(10));
	}

	@Test
	public void testAddOpration() {
		CollectionShuff cs = new CollectionShuff();
		assertEquals(20,cs.addOpration(10));
	}

}

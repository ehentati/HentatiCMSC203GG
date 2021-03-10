import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class GradeBookTest {

	GradeBook gb1,gb2;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		
		gb1 = new GradeBook(5);
		gb2 = new GradeBook(5);
		
		gb1.addScore(75);
		gb1.addScore(50);
		gb1.addScore(65);
		gb1.addScore(72);
		gb1.addScore(51);
		
		gb2.addScore(35);
		gb2.addScore(80);
		gb2.addScore(55);
		gb2.addScore(70);
		gb2.addScore(68);
	}

	@AfterEach
	void tearDown() throws Exception {
		
		gb1 = null;
		gb2 = null;
	}

	@Test
	void testGetScoreSize() {
		fail("Not yet implemented");
	}

	@Test
	void testToString() {
		fail("Not yet implemented");
	}

	@Test
	void testAddScore() {

		assertTrue(gb1.toString().equals("75.0 50.0 65.0 72.0 51.0 "));
		
		assertTrue(gb2.toString().equals("35.0 80.0 55.0 70.0 68.0 "));
		
		assertEquals(5,gb1.getScoreSize());
		assertEquals(5,gb2.getScoreSize());
	}

	@Test
	void testSum() {
		
		assertEquals(313.0, gb1.sum());
		assertEquals(308.0, gb2.sum());
	}

	@Test
	void testMinimum() {
		
		assertEquals(50.0, gb1.minimum());
		assertEquals(35.0, gb2.minimum());
	}

	@Test
	void testFinalScore() {
		
		assertEquals(263.0, gb1.finalScore());
		assertEquals(273.0, gb2.finalScore());
	}

}

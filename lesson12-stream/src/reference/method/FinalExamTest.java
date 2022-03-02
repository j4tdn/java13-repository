package reference.method;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
class FinalExamTest {
	@Test
	void test1() {
		// Expected result: true
		assertEquals(FinalExam.isPerfect(6), true);
	}
	@Test
	void test2() {
		// Expected result: false
		assertEquals(FinalExam.isPerfect(9), false);
	}
	@Test
	void test3() {
		// Expected result: false
		assertEquals(FinalExam.isPerfect(3), false);
	}
	@Test
	void test4() {
		// Expected result: false
		assertEquals(FinalExam.isPerfect(10000), false);
	}
	@Test
	void test5() {
		// Expected result: true
		assertEquals(FinalExam.isPerfect(8128), true);
	}
}

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Tester {

//	@Test
	void test() {
		fail("Not yet implemented");
	}
	
	@Test
	void popTest() {
		MinStack temp = new MinStack();
		
		temp.push(4);
		temp.push(8);
		temp.push(5);
		temp.push(9);
	
		temp.push(2);
		temp.push(9);
		temp.push(3);
		
		temp.pop();
		temp.pop();
		temp.pop();
		
		
		assertEquals(5, temp.min()); 
	}

}

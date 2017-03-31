import static org.junit.Assert.*;

import org.junit.Test;

public class MatrixTest {



	@Test
	public void testDeterminant() {
		Matrix m=new Matrix(3);
		m.matrixSet(0,0,8);
		m.matrixSet(0,1,9);
		m.matrixSet(0,2,1);
		
		m.matrixSet(1,0,3);
		m.matrixSet(1,1,5);
		m.matrixSet(1,2,2);
		
		m.matrixSet(2,0,-2);
		m.matrixSet(2,1,3);
		m.matrixSet(2,2,-1);
		
		//Should be -78.0
		assertEquals(-78.0, m.determinant(),.001);
	
	}

	@Test
	public void testSubMatrix() {
		
		fail("Not yet implemented");
	}

	@Test
	public void testInverse() {
		fail("Not yet implemented");
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

}

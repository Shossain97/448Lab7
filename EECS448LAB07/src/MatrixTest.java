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
		
		Matrix sub=new Matrix(2);
		sub.matrixSet(0,0,5);
		sub.matrixSet(0,1,2);
		
		sub.matrixSet(1, 0, 3);
		sub.matrixSet(1, 1, -1);
		assertEquals(sub.toString(),m.subMatrix(0,0).toString());
		
	}

	@Test
	public void testInverse() {
		fail("Not yet implemented");
	}



}
